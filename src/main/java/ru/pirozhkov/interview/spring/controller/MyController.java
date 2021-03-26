package ru.pirozhkov.interview.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.pirozhkov.interview.spring.entity.Student;
import ru.pirozhkov.interview.spring.repositories.StudentRepository;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    private StudentRepository studentRepository;

    @RequestMapping("/students")
    public String showAllEmployees(Model model) {
        List<Student> allStudents = studentRepository.getAllStudents();
        model.addAttribute("allStudents", allStudents);
        return "all-employees";
    }
}

