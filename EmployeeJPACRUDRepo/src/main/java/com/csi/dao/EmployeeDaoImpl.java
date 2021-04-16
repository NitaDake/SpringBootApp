package com.csi.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.csi.model.Employee;
import com.csi.repository.EmployeeRepository;

@Component
public class EmployeeDaoImpl {
	@Autowired 
	EmployeeRepository employeeRepository;
	
public List<Employee>getEmployee(){
	return (List<Employee>) employeeRepository.findAll();
}
public Optional<Employee> getDataById(int empId) {
	return employeeRepository.findById(empId);
	
}
public void saveData(Employee employee) {
	 employeeRepository.save(employee);
}
public void updateEmployee(int empId,Employee employee) {
	employeeRepository.save(employee);
}

public void deleteEmployee(int empId) {
	employeeRepository.deleteById(empId);
}
}
