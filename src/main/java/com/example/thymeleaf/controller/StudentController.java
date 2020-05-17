package com.example.thymeleaf.controller;

import com.example.thymeleaf.entity.Student;
import com.example.thymeleaf.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    StudentService studentService;
    @RequestMapping("/listStudent")
    public String findAll(Model model){
        List<Student> students = studentService.findALL();
        model.addAttribute("students",students);
        return "listStudent";
    }

    @RequestMapping("/deleteStudent")
    public String delete(int id){
        studentService.delete(id);
        return "redirect:listStudent";
    }

    @RequestMapping("/updateStudent")
    public String updateStudent(Student student){
        studentService.update(student);
        return "redirect:listStudent";
    }

    @RequestMapping("/editStudent")
    public String editStudent(int id, Model model) {
        Student student = studentService.get(id);
        model.addAttribute("student", student);
        return "editStudent";
    }

    @RequestMapping("/addStudent")
    public String addStudent(Student student){
       studentService.insert(student);
        return "redirect:listStudent";
    }

}
