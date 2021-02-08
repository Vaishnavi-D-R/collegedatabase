package com.mindtree.collegedatabase.entity;

public class Student {
private String stuName;
private int age;
private String subject;
private College college;
public Student() {
	super();
}
public Student(String stuName, int age, String subject, College college) {
	super();
	this.stuName = stuName;
	this.age = age;
	this.subject = subject;
	this.college = college;
}
public String getStuName() {
	return stuName;
}
public void setStuName(String stuName) {
	this.stuName = stuName;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public College getCollege() {
	return college;
}
public void setCollege(College college) {
	this.college = college;
}

}
