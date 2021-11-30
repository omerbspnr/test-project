package com.murat.firstapp.service;

import com.murat.firstapp.dto.Student;

import java.util.List;
import java.util.Optional;

public interface IStudentService {
    List<Student> findByName(String name);
    Optional<Student> findStudent(Student student);
    List<Student> findAll();
}
