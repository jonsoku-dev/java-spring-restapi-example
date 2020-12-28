package com.tamastudy.myrestfulservices.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonFilter;
import com.tamastudy.myrestfulservices.post.Post;
import io.swagger.annotations.ApiModel;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


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
    @Column(name = "user_id")
    private Integer id;
    @Size(min = 2, message = "Name은 2글자 이상 입력해 주세요.")
    private String name;
    @Past
    private Date joinedDate;

    private String password;
    private String ssn;

    @OneToMany(mappedBy = "user")
    private List<Post> posts = new ArrayList<>();

    public User(int id, String name, Date joinedDate, String password, String ssn) {
        this.id = id;
        this.name = name;
        this.joinedDate = joinedDate;
        this.password = password;
        this.ssn = ssn;
    }
}
