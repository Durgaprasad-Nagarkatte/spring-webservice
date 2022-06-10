package com.durgaprasad.spring.webservices.springwebservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

  @GetMapping("hello-world/{name}")
  public Response helloWorld(@PathVariable String name) {
    return new Response(String.format("Hello World, %s", name));
  }

}
