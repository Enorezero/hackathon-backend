package com.example.hackathonbackend.service.registrationservice;

import com.example.hackathonbackend.model.Key;
import com.example.hackathonbackend.repository.KeyRepository;
import com.example.hackathonbackend.service.registrationservice.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    KeyRepository keyRepository;

    @Autowired
    private JavaMailSender emailSender;


    @Override
    public void sendToEmail(String email) {
        try {
            Random random = new Random();
            String code= String.format("%04d", random.nextInt(10000));
            Key key = new Key();
            key.setEmail(email);
            key.setCode(code);
            keyRepository.save(key);
            SimpleMailMessage mailMessage = new SimpleMailMessage();
            mailMessage.setFrom("den1s.starts@yandex.ru");
            mailMessage.setTo(email);
            mailMessage.setSubject("Код активации");
            mailMessage.setText(code);
            emailSender.send(mailMessage);
        }
        catch (Exception e){
            throw new RuntimeException();
        }
    }

    @Override
    public boolean validate(String email, String code) {
        Key key = keyRepository.findByEmail(email);
        if(code.equals(key.getCode())){
            keyRepository.delete(key);
            return true;
        }
        return false;
    }
}
