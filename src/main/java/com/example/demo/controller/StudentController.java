package com.example.demo.controller;
import com.example.demo.dto.StudentDTO;
import com.example.demo.entity.Student;
import com.example.demo.mapper.StudentMapper;
import com.example.demo.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StudentController {

    @Autowired
    private StudentRepo studentRepo;
    @Autowired
    private StudentMapper studentMapper;

    @PostMapping("/students")
    public Student save(@RequestBody StudentDTO studentDTO){
        Student student=studentMapper.convertToEntity(studentDTO);
        Student student1=studentRepo.save(student);
        return student1;
    }
    @GetMapping("/students")
    public Iterable<Student> findAll(){
        return studentRepo.findAll();
    }

}
