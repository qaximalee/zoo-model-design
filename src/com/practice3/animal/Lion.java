package com.practice3.animal;

public class Lion extends Animal {

	private String name;

	public Lion(String name, String size, boolean predator, String type) {
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
