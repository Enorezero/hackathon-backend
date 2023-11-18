package com.example.hackathonbackend.service;

import com.example.hackathonbackend.model.BaseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class RegisterServiceImpl implements RegisterService{

    @Autowired
    private JavaMailSender emailSender;
//    @Override
//    public void registerTrainee(BaseInfo info) {
//    }

    @Override
    public void sendToEmail(String email) {
        try {
            Random random = new Random();
            String code = String.format("%04d", random.nextInt(10000));
            SimpleMailMessage mailMessage = new SimpleMailMessage();
            mailMessage.setFrom("den1s.starts@yandex.ru");
            mailMessage.setTo(email);
            mailMessage.setSubject("Код активации");
            mailMessage.setText(code);
            System.out.println(mailMessage);
            emailSender.send(mailMessage);
        }
        catch (Exception e){
            throw new RuntimeException();
        }
    }
}
