package com.example.hackathonbackend.service;

import com.example.hackathonbackend.model.BaseInfo;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl implements RegisterService{

//    @Autowired
//    private  JavaMailSender emailSender;
//    @Override
//    public Answer registerTrainee(BaseInfo info) {
//        return null;
//    }

//    @Override
//    public Answer sendToEmail(String email) {
//        try {
////            System.out.println("Ошибка 1");
////            Random random = new Random();
////            String code = String.format("%04d", random.nextInt(10000));
////            SimpleMailMessage mailMessage = new SimpleMailMessage();
////            mailMessage.setFrom(" ");
////            mailMessage.setTo(email);
////            mailMessage.setSubject("Код активации");
////            mailMessage.setText(code);
////            System.out.println("Ошибка 2");
////            emailSender.send(mailMessage);
////            System.out.println("Ошибка 3");
////            Answer answer = new Answer();
////            answer.setText("Код успешно отправлен");
////            return answer;
//        }
//        catch (Exception e){
//            throw new RuntimeException();
//        }
//    }
}
