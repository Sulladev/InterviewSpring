package ru.pirozhkov.interview.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @RequestMapping("/add")
    public String addNewStudent(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);
        return "student-info";
    }

    @RequestMapping("/saveStudent")
    public String saveStudent(@ModelAttribute("student") Student student) {
        studentRepository.saveStudent(student);
        return "redirect:/students";
    }

    @RequestMapping("/updateInfo")
    public String updateStudent(@RequestParam("studId") int id, Model model) {
        Student student = studentRepository.getStudent(id);
        model.addAttribute("student",student);
        return "student-info";
    }

    @RequestMapping("/deleteStudent")
    public String deleteStudent(@RequestParam("studId") int id) {

        studentRepository.deleteStudent(id);
        return "redirect:/students";
    }
}

