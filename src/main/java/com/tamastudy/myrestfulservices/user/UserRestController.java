package com.tamastudy.myrestfulservices.user;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/users")
    public void createUser(@RequestBody User user) {
        User savedUser = service.save(user);

    }
}
