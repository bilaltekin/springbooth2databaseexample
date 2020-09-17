package com.example.springbooth2test.springbooth2test.controller;

import com.example.springbooth2test.springbooth2test.exception.RecordNotFoundException;
import com.example.springbooth2test.springbooth2test.entity.Student;
import com.example.springbooth2test.springbooth2test.repository.AdressRepo;
import com.example.springbooth2test.springbooth2test.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api")

public class StudentController {

    @Autowired
    StudentRepo studentRepo;
    @Autowired
    AdressRepo adressRepo;


    Student student = new Student();


    @GetMapping("students/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    Student saveStudentById(@PathVariable Long id) {

        return studentRepo.findById(id)
                .orElseThrow(() -> new RecordNotFoundException("Employee id '" + id + "' does no exist"));
    }

    @GetMapping("students")
    List<Student> all() {

        return studentRepo.findAll();

    }

    @PostMapping("students")
    @ResponseStatus(HttpStatus.CREATED)
    Student saveStudent(@Valid @RequestBody Student student) {
        return studentRepo.save(student);
    }

    @PutMapping("students/{id}")
    Student updateStudent(@RequestBody Student newStudent, @PathVariable Long id) {

        return studentRepo.findById(id).map(student -> {
            student.setName(newStudent.getName());
            student.setPassportNumber(newStudent.getPassportNumber());
            return studentRepo.save(student);
        }).orElseGet( ()-> {
                    newStudent.setId(id);
                    return studentRepo.save(newStudent);
                });
    }

    @DeleteMapping("students/{id}")
    void saveStudent(@PathVariable Long id) {

        try {
            studentRepo.deleteById(id);
        }
        catch (Exception e)
        {

          throw   new RecordNotFoundException("Employee id '" + id + "' does no exist");
        }

    }

}
