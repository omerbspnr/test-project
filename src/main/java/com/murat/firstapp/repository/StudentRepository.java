package com.murat.firstapp.repository;


import com.murat.firstapp.entity.StudentEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class StudentRepository implements IStudentRepository {
    private static final List<StudentEntity> students=  new ArrayList<>();

    static  {
        students.add(new StudentEntity("1","ali","veli"));
        students.add(new StudentEntity("2","murat","cagiran"));
        students.add(new StudentEntity("3","omer","baspinar"));
        students.add(new StudentEntity("4","oguz","yildirim"));
        students.add(new StudentEntity("4","omer","test"));
    }
    @Override
    public List<StudentEntity> findAll() {
        return students;
    }
    @Override
    public List<StudentEntity> findByName(String name) {
        return students
                .stream()
                .filter(i -> i.getName().equals(name))
                .collect(Collectors.toList());
    }

    @Override
    public Optional<StudentEntity> findStudent(StudentEntity entity) {
        return students.stream().filter(i -> i.equals(entity)).findFirst();
    }
}
