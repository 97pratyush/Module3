package com.cg;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinTable;

@Entity
public class Faculty {
	@Id
	@GeneratedValue
	private int id;
	private String name;

	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "faculties")
//	@JoinTable(name = "factech", joinColumns = @JoinColumn(name = "facid"), inverseJoinColumns = @JoinColumn(name = "techId"))
	private List<Technology> technologies = new ArrayList<>();

	public List<Technology> getTechnologies() {
		return technologies;
	}

	public void setTechnologies(List<Technology> technologies) {
		this.technologies = technologies;
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

	@Override
	public String toString() {
		return "Faculty [id=" + id + ", name=" + name + "]";
	}

}
