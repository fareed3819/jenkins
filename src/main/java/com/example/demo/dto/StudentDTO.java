package com.example.demo.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class StudentDTO {
    private int id;
    private int rollno;
    private String name;
}
