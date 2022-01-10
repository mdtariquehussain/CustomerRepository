package com.myLib.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	private String id;
	private String name;
	private char gender;
	private int age;
	private String preferredFood;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPreferredFood() {
		return preferredFood;
	}
	public void setPreferredFood(String preferredFood) {
		this.preferredFood = preferredFood;
	}
}
