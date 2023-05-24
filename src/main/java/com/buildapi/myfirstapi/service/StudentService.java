package com.buildapi.myfirstapi.service;

import com.buildapi.myfirstapi.model.Student;
import com.buildapi.myfirstapi.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    //Fake DataBase/DB
//    private List<Student> students = new ArrayList<>(
//            Arrays.asList(
//                    new Student(1L, "Mikaila", "https://www.zipcodewilmington.com/hubfs/SI-Images/our-team/Mikaila.jpg"),
//                    new Student(2L, "Angel", "Angel.jpg"),
//                    new Student(3L, "Jerry", "Jerry.jpg")
//            )
//    );

    //create a method that will allow me to fetch all students in db
    public Iterable<Student> getStudents(){
        return studentRepository.findAll();
    }

    //add a student to db list
    public void addStudent(Student student){
        studentRepository.save(student);
    }

    public void removeStudent(Long id){
        studentRepository.deleteById(id);
    }

    public void editStudent(Long id, Student student){
        studentRepository.save(student);
    }

    public Optional<Student> getStudentById(Long id){
        return studentRepository.findById(id);
    }
//
//    public void removeStudent(Long id){
//        for (Student student : students) {
//            if(student.getId().equals(id)){
//                students.remove(student);
//            }
//        }
//    }
//
//    public void editStudent(Long id, Student student){
//        for (int x = 0; x < students.size(); x++){
//            Student student1 = students.get(x);
//            if (student1.getId().equals(id)){
//                students.set(x, student);
//            }
//        }

//        for (Student p : students) {
//            if (p.getId().equals(id)){
//                students.set(students.indexOf(p), student);
//            }
//        }
//    }


}
