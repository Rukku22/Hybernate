package com.crud.crud_1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Registration")
public class Registration {
@Id
private int rollno;
private String name;
private String group;
 
public int getRollno() {
	return rollno;
}
 
public void setRollno(int rollno) {
	this.rollno = rollno;
}
 
public String getName() {
	return name;
}
 
public void setName(String name) {
	this.name = name;
}
 
public String getGroup() {
	return group;
}
 
public void setGroup(String group) {
	this.group = group;
}
public Registration() {
}


}
