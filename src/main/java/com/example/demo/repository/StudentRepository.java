package com.example.demo.repository;


import com.example.demo.domain.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {

    List<Student> liststudent = new ArrayList<>();


    public void createStudent( Integer age, String name, String lastname) {
        Student student = new Student( name, lastname, age);
        liststudent.add(student);

    }

    public void createStudent(Student student) {
        liststudent.add(student);
    }

    public List<Student> getAll() {
        return liststudent;
    }

    public Student getidStudent(Integer id) {
        Student student = liststudent.get(id);
        return student;
    }

}
