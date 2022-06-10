package com.durgaprasad.spring.webservices.springwebservice.user;

import java.net.URI;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequiredArgsConstructor
public class UserController {

  private final UserDaoService userDaoService;

  @GetMapping("/users")
  public List<User> getAllUsers() {
    return userDaoService.findAll();
  }

  @GetMapping("/users/{id}")
  public User getUser(@PathVariable Integer id) {
    return userDaoService.findOne(id);
  }

  @PostMapping("/users")
  public ResponseEntity<Object> createUser(@RequestBody User user) {
    User newUser = userDaoService.save(user);

    URI location = ServletUriComponentsBuilder
        .fromCurrentRequest()
        .path("/{id}")
        .buildAndExpand(newUser.getUserId())
        .toUri();

    return ResponseEntity.created(location).build();
  }
}
