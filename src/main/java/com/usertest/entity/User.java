package com.usertest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="User")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name ="userid")
	private int userid;
	
	@Column(name="name")
	private String name;
	
	@Column(name="age")
	private int age;
	
	 @Column(name="salary")
	 private float salary;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int userid, String name, int age, float salary) {
		super();
		this.userid = userid;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	 
	 
	

}
