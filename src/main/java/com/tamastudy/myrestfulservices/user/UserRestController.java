package com.tamastudy.myrestfulservices.user;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserRestController {
    private final UserDaoService service;

    @GetMapping("/users")
    public List<User> allUsers() {
        return service.findAll();
    }

    @GetMapping("/users/{id}")
    public User user(
            @PathVariable int id
    ) {
        return service.findOne(id);
    }
}
