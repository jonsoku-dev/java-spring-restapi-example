package com.tamastudy.myrestfulservices.user;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User savedUser = service.save(user);

        // 서버에서 생성된 사용자의 id를 가져올 수 있다. (POST collection 방식 생성 시에)
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }
}
