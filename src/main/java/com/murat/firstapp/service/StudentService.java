package com.murat.firstapp.service;

import com.murat.firstapp.dto.Student;
import com.murat.firstapp.entity.StudentEntity;
import com.murat.firstapp.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StudentService implements IStudentService {
    private final IStudentRepository repository;
    private static Student getStudent(StudentEntity entity) {
        return new Student(entity.getName(), entity.getLastName());
    }

    private static StudentEntity getStudent(Student student) {
        return new StudentEntity(null, student.getName(), student.getLastName());
    }


    @Autowired
    public StudentService(IStudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Student> findByName(String name) {
        return repository
                .findByName(name)
                .stream()
                .map(StudentService::getStudent)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Student> findStudent(Student student) {
        return repository.findStudent(getStudent(student)).map(StudentService::getStudent);
    }

    @Override
    public List<Student> findAll() {
        return repository.
                findAll()
                .stream()
                .map(StudentService::getStudent)
                .collect(Collectors.toList());
    }
}
