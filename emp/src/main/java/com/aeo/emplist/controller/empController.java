package com.aeo.emplist.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aeo.emplist.dto.Emp;
import com.aeo.emplist.service.empService;

@RestController
@RequestMapping("/emp")
public class empController {
	@Autowired
	empService empservice;
	
	@PostMapping(value="/newemp" , consumes= {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public Emp addEmp(@RequestBody Emp emp)
	{
		return  empservice.addemp(emp);
		 
	}
	
	@GetMapping(value="/allemp" ,produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE} )
	public List<Emp> getAll()
	{
		return empservice.getAll();
	}
	

	@PutMapping(value="/update/{id}" , consumes= {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public Emp updateEmp(@PathVariable("id") int id, @RequestBody Emp emp)
	{
		return  empservice.updateEmp(id,emp);
		 
	}
	@DeleteMapping(value="/delete/{id}")
	public boolean delete(@PathVariable("id") int id)
	{
		return empservice.delete(id);
	}
	
	
	
	
	
	
	
	
}
