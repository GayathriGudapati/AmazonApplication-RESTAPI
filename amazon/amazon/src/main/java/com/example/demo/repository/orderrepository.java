package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.orderpage;

@Repository

public interface orderrepository extends CrudRepository<orderpage, Integer>{

}