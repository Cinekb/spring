package com.example.demo.controller;


import com.example.demo.domain.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {

    @Autowired
    StudentRepository repository;


    @RequestMapping("/students")
    String getStudents(Model model){
        List<Student> students = new ArrayList<>(repository.getAll());
        model.addAttribute("students",students);
        return "students";
    }

    @RequestMapping("/newstudent")
    String addStudent(Model model){
        model.addAttribute("student",new Student());
        return  "studentform";
    }

    @RequestMapping(value = "/students" ,method = RequestMethod.POST)
    String savestudent(Student student){
        repository.createStudent(student);
        return "redirect:/students";
    }
    @RequestMapping("student/{index}")
    String studentid (@PathVariable("index") Integer index ,Model model){
        --index;
        Student student= repository.getidStudent(index);
        model.addAttribute("student",student);
        return "student";
    }
}
