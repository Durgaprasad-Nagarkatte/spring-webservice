package com.durgaprasad.spring.webservices.springwebservice.helloworld;

import com.durgaprasad.spring.webservices.springwebservice.Response;
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
