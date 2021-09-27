package com.example.coursera.service;

import com.example.coursera.model.Student;

import java.util.Collection;

public interface StudentService {

  Student getStudent(String id);
  Collection<Student> getAllStudents();

}
