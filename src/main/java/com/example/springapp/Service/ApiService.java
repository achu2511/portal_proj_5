package com.example.springapp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.Models.book;
import com.example.springapp.Repositories.bookrepository;

@Service
public class ApiService {
	@Autowired
	bookrepository repo;
	
	public String updatedetails(book st) {
		return "updated";
	}
	
	public String delStudent(int id){
		
		repo.deleteById(id);
		return "deleted";
	}
}
