package com.tamastudy.myrestfulservices.user;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@Data
public class User {
    private Integer id;
    private String name;
    private Date joindDate;
}
