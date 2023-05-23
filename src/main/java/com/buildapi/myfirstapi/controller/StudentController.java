package com.buildapi.myfirstapi.controller;

import com.buildapi.myfirstapi.model.Student;
import com.buildapi.myfirstapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//This is my controller
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    //HTTP Methods - GET, POST, PUT, DELETE, PATCH

    //Create a path that will allow me to fetch all the students in database

    //get all the students
    @GetMapping("/students")
    public List<Student> getAllStudents(){
        //return a list of all the students
        return studentService.getStudents();
    }

    @PostMapping("/students")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

    @DeleteMapping("/students")
    public void removeStudent(@RequestBody Student student){
        studentService.removeStudent(student);
    }


}
