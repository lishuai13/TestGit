package com.example.thymeleaf.mapper;

import com.example.thymeleaf.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface StudentMapper {


    List<Student> findAll();

    void delete(int id);

    Student get(int id);

    void update(Student student);

    void insert(Student student);

}
