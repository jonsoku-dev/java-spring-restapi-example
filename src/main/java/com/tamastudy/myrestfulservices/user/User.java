package com.tamastudy.myrestfulservices.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonFilter;
import io.swagger.annotations.ApiModel;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "All details about the user.")
@Entity
//@JsonIgnoreProperties(value = {"password"})
//@JsonFilter("UserInfo")
public class User {
    @GeneratedValue
    @Id
    private Integer id;
    @Size(min = 2, message = "Name은 2글자 이상 입력해 주세요.")
    private String name;
    @Past
    private Date joinedDate;

    private String password;
    private String ssn;
}
