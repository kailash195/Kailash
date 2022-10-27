package com.springboot.springbootcrudrestfulwebservices.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.springbootcrudrestfulwebservices.exception.ResourceNotFoundException;
import com.springboot.springbootcrudrestfulwebservices.model.Employee;
import com.springboot.springbootcrudrestfulwebservices.repository.EmployeeRepository;

//@Controller
@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
	
	
	Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
	EmployeeRepository empRepo;
	
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return empRepo.findAll();
	}
	
	@PostMapping("/employees")
	public Employee createEmployee(@Validated @RequestBody Employee emp) {
		return empRepo.save(emp);
	}
	
	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable(value = "id") long id) throws ResourceNotFoundException{
		Employee empl = empRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee Not Found for " +id));
		return ResponseEntity.ok().body(empl);
	}
	
	
	@PutMapping("/employees/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable(value = "id") long id
			, @RequestBody Employee emp) throws ResourceNotFoundException {
		
		Employee emplUpdate = empRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee Not Found for " +id));
		emplUpdate.setEmpName(emp.getEmpName());
		final Employee updateEmp = empRepo.save(emplUpdate);
		return ResponseEntity.ok(updateEmp);
	
	}
	
	@DeleteMapping("/employees/{id}")
	public ResponseEntity deleteEmployee(@PathVariable(value = "id") long id) throws ResourceNotFoundException {
		empRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee Not Found for " +id));
		empRepo.deleteById(id);
		return ResponseEntity.ok().build();
	}
	
	
	
	
	
	
	
	
	/*
	 * @RequestMapping("index") public String employee() { return "index.jsp"; }
	 * 
	 * @RequestMapping("addUser")
	 * 
	 * public String addEmployee(Employee emp) { System.out.println(emp);
	 * 
	 * logger.info(emp.toString()); empRepo.save(emp); //return "Saved"; return
	 * "index.jsp"; }
	 * 
	 * @RequestMapping("getEmployee")
	 * 
	 * public ModelAndView getEmployee(@RequestParam int id) {
	 * 
	 * ModelAndView mav = new ModelAndView("showEmployee.jsp"); Employee empl =
	 * empRepo.findById(id).orElse(new Employee()); System.out.println(id);
	 * //System.out.println(mav); System.out.println(empl); mav.addObject(empl);
	 * return mav; //return "index.jsp"; }
	 */

	
}
