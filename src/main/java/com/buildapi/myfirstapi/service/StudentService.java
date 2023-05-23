package com.buildapi.myfirstapi.service;

import com.buildapi.myfirstapi.model.Student;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@Service
public class StudentService {

    //Fake DataBase/DB
    private List<Student> students = new ArrayList<>(
            Arrays.asList(
                    new Student(1L, "Mikaila", "https://www.zipcodewilmington.com/hubfs/SI-Images/our-team/Mikaila.jpg"),
                    new Student(2L, "Angel", "Angel.jpg"),
                    new Student(3L, "Jerry", "Jerry.jpg")
            )
    );

    //create a method that will allow me to fetch all students in db
    public List<Student> getStudents(){
        return students;
    }

    //add a student to db list
    public void addStudent(Student student){
        students.add(student);
    }

    public void removeStudent(Long id){
        for (Student student : students) {
            if(student.getId().equals(id)){
                students.remove(student);
            }
        }
    }

    public void editStudent(Long id, Student student){
        for (Student q : students) {
            if(q.getId().equals(id)){
                
            }
        }
    }


}
