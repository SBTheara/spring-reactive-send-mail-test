package com.theara.testsendmail.module;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Mail {
    private String id;
    private String from;
    private List<String> to;
    private List<String> cc;
    private List<String> bcc;
    private LocalDateTime time = LocalDateTime.now();
}
