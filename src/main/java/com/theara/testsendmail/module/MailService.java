package com.theara.testsendmail.module;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
@Slf4j
public class MailService {

  @Autowired private JavaMailSender javaMailSender;

  public void send() throws MessagingException {
    String[] cc  = {"thearaholishit@gmail.com","thearasambath112@gmail.com"};
    MimeMessage message = javaMailSender.createMimeMessage();
    MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(message);
    mimeMessageHelper.setTo("thearaholishit@gmail.com");
    mimeMessageHelper.setCc(cc);
    mimeMessageHelper.setSubject("Hello world");
    mimeMessageHelper.setText("My heart will get out");
    javaMailSender.send(message);
  }
}
