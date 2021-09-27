package com.example.coursera.dao;

import com.example.coursera.model.Student;

import java.util.Collection;

public interface StudentDao {

  Student getOne(String id);
  Collection<Student> getAll();
}

