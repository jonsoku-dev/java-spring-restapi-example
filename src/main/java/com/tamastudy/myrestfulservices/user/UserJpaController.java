package com.tamastudy.myrestfulservices.user;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/jpa") // prefix
@RequiredArgsConstructor
public class UserJpaController {
    private final UserRepository userRepository;

    // http://localhost:8088/jpa/users
    @GetMapping("/users")
    public List<User> retrieveAllUsers() {
        return userRepository.findAll();
    }
}
