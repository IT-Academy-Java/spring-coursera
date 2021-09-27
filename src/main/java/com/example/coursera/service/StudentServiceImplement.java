package com.example.coursera.service;

import com.example.coursera.dao.StudentDao;
import com.example.coursera.model.Student;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Collection;

@Named
public class StudentServiceImplement implements StudentService{

  @Inject
  private StudentDao studentDao;

  @Override
  public Student getStudent(String id) {
    return studentDao.getOne(id);
  }

  @Override
  public Collection<Student> getAllStudents() {
    return studentDao.getAll();
  }

  public void setStudentDao(StudentDao studentDao){
    this.studentDao = studentDao;
  }

}
