package com.csi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Employee {
@Id
@GeneratedValue
private int empId;
private String fisrtName;
private String lastName;
private String emailId;

}
