package uz.sodiqdev.appjpa.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uz.sodiqdev.appjpa.model.Student;
import uz.sodiqdev.appjpa.repository.StudentRepository;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/student")
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping
    public List<Student> getAllStudent(){
        List<Student> students = studentRepository.findAll();
        return students;
    }

    @GetMapping(value = "/{id}")
    public Student getStudentById(@PathVariable Integer id){
        Optional<Student> optionalStudent = studentRepository.findById(id);
        if (optionalStudent.isPresent()) {
            Student student = optionalStudent.get();
            return student;
        }
        return new Student();
    }

    @PostMapping
    public String addStudent(@RequestBody Student student){
        studentRepository.save(student);
        return "Successfully added";
    }

    @PutMapping(value = "/{id}")
    public String updateStudent(@PathVariable Integer id, @RequestBody Student currentStudent){
        Optional<Student> optionalStudent = studentRepository.findById(id);
        if (optionalStudent.isPresent()) {
            Student student = optionalStudent.get();
            student.setUsername(currentStudent.getUsername());
            student.setPhoneNumber(currentStudent.getPhoneNumber());
            studentRepository.save(student);
        }
        return "Student updated";
    }

    @DeleteMapping(value = "/{id}")
    public String deleteStudent(@PathVariable Integer id){
        Optional<Student> optionalStudent = studentRepository.findById(id);
        if (optionalStudent.isPresent()) {
            Student student = optionalStudent.get();
            studentRepository.delete(student);
            return "Student deleted";
        }
        return "Error";
    }

}
