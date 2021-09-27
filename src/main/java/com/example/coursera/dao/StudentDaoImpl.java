package com.example.coursera.dao;

import com.example.coursera.model.Student;

import javax.inject.Named;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Named
public class StudentDaoImpl implements StudentDao {
  private Map<String, Student> studentMap;
  {
    studentMap = new HashMap<>();
    studentMap.put("1", new Student("1", "Elena", "Piaggio", "English 1", 145.00));
  }

  @Override
  public Student getOne(String id) {
    return studentMap.get(id);
  }

  @Override
  public Collection<Student> getAll() {
    return studentMap.values();
  }
}


