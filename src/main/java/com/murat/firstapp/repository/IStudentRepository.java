package com.murat.firstapp.repository;

import com.murat.firstapp.entity.StudentEntity;

import java.util.List;
import java.util.Optional;

public interface IStudentRepository {
    List<StudentEntity> findByName(String name);
    Optional<StudentEntity> findStudent(StudentEntity entity);
    List<StudentEntity> findAll();
}
