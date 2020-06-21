package com.example.demo.mapper;

import com.example.demo.dto.StudentDTO;
import com.example.demo.entity.Student;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {
    @Autowired
    private ModelMapper modelMapper;

    public Student convertToEntity(StudentDTO studentDTO){
        return modelMapper.map(studentDTO,Student.class);
    }

}
