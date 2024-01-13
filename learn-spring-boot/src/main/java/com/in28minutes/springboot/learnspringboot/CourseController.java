package com.in28minutes.springboot.learnspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
                new Course(1,"Learn AWS","in28minutes"),
                new Course(2,"Learn Devops","in28minutes"),
                new Course(3,"Learn Azure","in28minutes")
                //new Course(4,"Terraform","in28minutes")
                //new Course(5,"Cybersecurity","in28minutes")
        );
    }
}

