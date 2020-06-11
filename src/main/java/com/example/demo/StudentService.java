package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentrepository;
    
    public List<Student> getAllStudents(){
        final List<Student> students = new ArrayList<>();
        studentrepository.findAll().forEach(students::add);

        return students;
    }

    public void addStudent(Student student){
        studentrepository.save(student);
    }

    public Optional<Student> getStudent(String id){
        return studentrepository.findById(id);
    } 

    public void updateStudent(String id, Student student){  
        studentrepository.save(student);
    } 

    public void deleteStudent(String id){
        studentrepository.deleteById(id);
    }
}