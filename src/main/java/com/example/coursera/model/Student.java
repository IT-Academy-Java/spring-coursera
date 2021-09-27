package com.example.coursera.model;

public class Student {

  private String id;
  private String firstName;
  private String surname;
  private String dept;
  private Double fees;

  public Student(String id, String firstName, String surname, String dept, Double fees) {
    this.id = id;
    this.firstName = firstName;
    this.surname = surname;
    this.dept = dept;
    this.fees = fees;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public String getDept() {
    return dept;
  }

  public void setDept(String dept) {
    this.dept = dept;
  }

  public Double getFees() {
    return fees;
  }

  public void setFees(Double fees) {
    this.fees = fees;
  }
}
