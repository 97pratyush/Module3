package com.cg;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "employee_details")
@NamedQueries({ @NamedQuery(name = "getAllEmployees", query = "from Employee"),
		@NamedQuery(name = "getEmployeeByGender", query = "from Employee where gender=:gen") })
public class Employee {
	@Id
	@Column(name = "empId")
	private int id;
	@Column(name = "empName")
	private String name;
	private String gender;
	private int age;
	@Column(name = "annualSalary")
	private float salary;

	public Employee() {
		super();
	}

	public Employee(int id, String name, String gender, int age, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", salary=" + salary
				+ "]";
	}

}
