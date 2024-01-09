package com.theara.testsendmail.module;

import jakarta.mail.MessagingException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/mail")
@RequiredArgsConstructor
public class MailController {

  private final MailService mailService;


  @PostMapping("/send")
  public ResponseEntity<String> sendMail(
      @RequestParam(name = "files",required = false) MultipartFile[] files,
      @RequestParam(value = "to",required = false) String to,
      @RequestParam(value = "cc",required = false) String[] cc,
      @RequestParam(value = "subject",required = false) String subject,
      @RequestParam(value = "body",required = false) String body) throws MessagingException {
      this.mailService.send();
      return ResponseEntity.ok("mail sent");
  }
  @GetMapping("/greeting")
    public Mono<String> greeting() throws MessagingException {
      this.mailService.send();
      return Mono.just("Helloworld");
  }
}
