package com.example.coursera.controller;

import com.example.coursera.model.Student;
import com.example.coursera.service.StudentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.Collection;

@RequestMapping("/student")
@RestController
public class StudentController {

  @Value("${message}")
  private String strController;

  @Inject
  private StudentService studentService;

  @GetMapping("/msg")
  public String getStrController(){
    return strController;
  }

  @GetMapping("/all")
  public Collection<Student> getAll(){
    return studentService.getAllStudents();
  }
}
