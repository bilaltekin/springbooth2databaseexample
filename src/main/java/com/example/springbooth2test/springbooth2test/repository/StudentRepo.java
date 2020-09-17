package com.example.springbooth2test.springbooth2test.repository;

import com.example.springbooth2test.springbooth2test.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Long> {
}
