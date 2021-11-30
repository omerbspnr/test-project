package com.murat.firstapp.controller;

import com.murat.firstapp.dto.Student;
import com.murat.firstapp.repository.IStudentRepository;
import com.murat.firstapp.service.IStudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {
    private final IStudentService studentService;
    public StudentController(IStudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public List<Student> getAllStudent() {
        return studentService.findAll();
    }
    @GetMapping("/students/name")
    public List<Student> getByStudentName(@RequestParam String name) {
        return studentService.findByName(name);
    }

    @PostMapping("/students")
    public String getStudent(@RequestBody Student student) {
        return studentService.findStudent(student).isPresent() ? student.getName() : "invalid student";
    }






}


