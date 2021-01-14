package com.rank.SpringLoggingSample.model;

public class Book {
	
	
	private int id;
	private String Name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Book(int id, String name) {
		this.id = id;
		Name = name;
	}
	public Book() {
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", Name=" + Name + "]";
	}
	
	

}
