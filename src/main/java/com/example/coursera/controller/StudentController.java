package com.example.coursera.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/student")
@RestController
public class StudentController {

  @Value("${message}")
  private String strController;

  @GetMapping("/msg")
  public String getStrController(){
    return strController;
  }
}
