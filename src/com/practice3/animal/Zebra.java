package com.practice3.animal;

public class Zebra extends Animal {

	private String name;

	public Zebra(String name, String size, boolean predator, String type) {
		super(size, predator, type);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
