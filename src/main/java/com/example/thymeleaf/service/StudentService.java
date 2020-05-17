package com.example.thymeleaf.service;

import com.example.thymeleaf.entity.Student;
import com.example.thymeleaf.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import java.util.List;
@Primary
@Service
public class StudentService {

    @Autowired
    StudentMapper studentMapper;

    public List<Student> findALL(){

        List<Student> students = studentMapper.findAll();
        return students;
    }

    public void delete(int id){
        studentMapper.delete(id);
    }

    public void update(Student student){
        studentMapper.update(student);
    }

    public Student get(int id){
        return studentMapper.get(id);
    }

    public void insert(Student student){
        studentMapper.insert(student);
    }
}
