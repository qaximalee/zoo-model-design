package com.practice3.cage;

public class Cage {
	private int capacity;
	private String type;

	public Cage(int capacity, String type) {
		this.capacity = capacity;
		this.type = type;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
