package com.tutorial.dockerdemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker-demo")
public class Controller {
  @GetMapping("/greet")
  public ResponseEntity<String> getHello( @RequestParam(defaultValue = "Hello")  String greeting) {
    return new ResponseEntity<>(greeting + " world!", HttpStatus.OK);
  }
}
