package com.dzkj2.pojo;

public class user {
	private String name;
	private Integer age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public user(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}
