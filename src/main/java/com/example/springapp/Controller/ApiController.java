package com.example.springapp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.Models.book;
import com.example.springapp.Repositories.bookrepository;
import com.example.springapp.Service.ApiService;

@RestController
public class ApiController {
	@Autowired
	bookrepository rep;
	
	@Autowired
	ApiService ser;
	
	@PutMapping("/update")
	public String updatw(@RequestBody book st) {
		return ser.updatedetails(st);
	}
	
	@DeleteMapping("/del")
	public String delete(@RequestParam int id) {
		return ser.delStudent(id);
	}
}
