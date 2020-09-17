package com.example.springbooth2test.springbooth2test.repository;

import com.example.springbooth2test.springbooth2test.entity.Adress;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdressRepo extends JpaRepository<Adress,Long>   {
}
