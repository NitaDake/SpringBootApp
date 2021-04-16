package com.csi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.csi.model.Employee;
import com.csi.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
@Autowired
EmployeeService employeeService;
@GetMapping("/employee")
public List<Employee>getAllData(){
	return employeeService.getEmployee();
}
@GetMapping("/employee/{empId}")
public Optional<Employee> getOneEmployee(@PathVariable  int empId) {
	return employeeService.getDataById(empId);
}
@PostMapping("/employee")
public String saveEmployee(@RequestBody Employee employee) {
	employeeService.saveData(employee);
	return"Employee saved Successfully";
}
@PutMapping("/employee/{empId}")
public String updateEmployee(@PathVariable int empId,@RequestBody Employee employee) {
	employeeService.updateEmployee(empId,employee);
	return"Employee updated Successfully";
}
/*
 * @DeleteMapping("/employee/{empId}") public String
 * deleteEmployee(@PathVariable int empId) {
 * employeeService.deleteEmployee(empId); return
 * "Employee Deleted Successfully";
 * 
 * }
 */
}
