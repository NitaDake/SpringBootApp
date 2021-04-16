package com.csi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csi.dao.EmployeeDaoImpl;
import com.csi.model.Employee;

@Service
public class EmployeeService {
@Autowired
EmployeeDaoImpl employeeDaoImpl;
public List<Employee>getEmployee(){
	return (List<Employee>) employeeDaoImpl.getEmployee();
}
public Optional<Employee> getDataById(int empId) {
	return employeeDaoImpl.getDataById(empId);
	
}
public void saveData(Employee employee) {
	employeeDaoImpl.saveData(employee);
}
public void updateEmployee(int empId,Employee employee) {
	employeeDaoImpl.updateEmployee(empId, employee);
}

public void deleteEmployee(int empId) {
	employeeDaoImpl.deleteEmployee(empId);
}
}
