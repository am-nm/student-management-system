package com.javaproject.studentmanagementsystem.service;

import com.javaproject.studentmanagementsystem.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student saveStudent(Student student);
}
