package com.student.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Max;
import javax.validation.constraints.Pattern;

@Entity
public class Student {

	@Id
	@SequenceGenerator(name = "abc", allocationSize = 1, initialValue = 101)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "abc")
	private int id;
	private String name;
	@Max(30)
	private int age;
	@Pattern(regexp = "(CS|EC|MECH)", message = "Stream should be EC, CS or MECH only")
	private String stream;

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

}
