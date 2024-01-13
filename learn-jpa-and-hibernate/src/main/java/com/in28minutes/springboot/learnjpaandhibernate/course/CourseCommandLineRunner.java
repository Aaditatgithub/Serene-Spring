package com.in28minutes.springboot.learnjpaandhibernate.course;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;
import com.in28minutes.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.in28minutes.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
//    @Autowired
//    private CourseJdbcRepository repository;

//    @Autowired
//    private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1,"Learn Azure", "IEEE"));
        repository.save(new Course(2,"Learn AWS", "IEEE"));
        repository.save(new Course(3,"Learn GCP", "IEEE"));
//        repository.deleteById(1L);
//        System.out.println(repository.findById(2L));
//        System.out.println(repository.findById(3L));

        System.out.println(repository.findAll());
        System.out.println(repository.findByAuthor("in28minutes"));
        System.out.println(repository.findByAuthor("IEEE"));
        System.out.println(repository.findByName("Learn Azure"));
    }
}
