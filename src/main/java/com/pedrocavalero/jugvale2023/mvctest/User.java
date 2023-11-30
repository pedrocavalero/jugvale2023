package com.pedrocavalero.jugvale2023.mvctest;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name = "users")
public class User {


	@Id
	private String id;

	private String first;

	private String last;

	private String city;

	private String county;

	private int age;

	public User() {
		super();
	}

	public User(String first) {
		super();
		this.first = first;
	}

	public User(String id, String first) {
		super();
		this.id = id;
		this.first = first;
	}
	
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String name) {
		this.first = name;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String name) {
		this.last = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}