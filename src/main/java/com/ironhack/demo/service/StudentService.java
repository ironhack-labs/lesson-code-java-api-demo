package com.ironhack.demo.service;

import com.ironhack.demo.model.Student;
import com.ironhack.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student addNewStudent(Student student) {
        return studentRepository.save(student);
    }
}
