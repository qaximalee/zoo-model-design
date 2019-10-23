package com.practice3.animal;

public class Animal {

	private String size;
	private boolean predator;
	// Herbivores or Carnivores
	private String type;

	public Animal(String size, boolean predator, String type) {
		super();
		this.size = size;
		this.predator = predator;
		this.type = type;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public boolean isPredator() {
		return predator;
	}

	public void setPredator(boolean predator) {
		this.predator = predator;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
