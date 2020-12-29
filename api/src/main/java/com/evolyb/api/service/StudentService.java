package com.evolyb.api.service;

import com.evolyb.core.model.Student;

public class StudentService {
    public static Student createStudent(){
        Student student = new Student();
        student.setName("Evolyb");
        student.setAddress("HN");
        return student;
    }
}
