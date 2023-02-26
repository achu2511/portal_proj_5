package com.example.springapp.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springapp.Models.book;

@Repository
public interface bookrepository extends JpaRepository<book,Integer>{

}
