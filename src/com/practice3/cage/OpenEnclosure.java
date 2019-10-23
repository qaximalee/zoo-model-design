package com.practice3.cage;

import java.util.List;
import java.util.Map;

import com.practice3.animal.Animal;

public class OpenEnclosure extends Cage {

	/*
	 * Limit of each Animal(i.e Lion, Zebra) in OpenEnclosure Cage. List contains
	 * Animal's Name and it's value in Integer
	 */
	private Map<String, Integer> limitListOfSpecificAnimalType;

	// List of Animals added in Open enclosure;
	private List<Animal> listOfAnimals;

	public OpenEnclosure(Map<String, Integer> limitListOfSpecificAnimalType, int capacity, String type,
			List<Animal> listOfAnimals) {
		super(capacity, type);
		this.limitListOfSpecificAnimalType = limitListOfSpecificAnimalType;
		this.listOfAnimals = listOfAnimals;
	}

	public Map<String, Integer> getLimitListOfSpecificAnimalType() {
		return limitListOfSpecificAnimalType;
	}

	public void setLimitListOfSpecificAnimalType(Map<String, Integer> limitListOfSpecificAnimalType) {
		this.limitListOfSpecificAnimalType = limitListOfSpecificAnimalType;
	}

	public List<Animal> getListOfAnimals() {
		return listOfAnimals;
	}

	public void setListOfAnimals(List<Animal> listOfAnimals) {
		this.listOfAnimals = listOfAnimals;
	}

	public boolean compareAnimalForLiving() {

		boolean liveable = true;

		// It will check whether animal list has predator and have other animal
		for (Animal animal : listOfAnimals) {
			if (animal.isPredator()) {
				if (listOfAnimals.size() > 1) {
					// Removed List of Animal List
					listOfAnimals.forEach(x -> listOfAnimals.remove(x));
					liveable = false;
					break;
				}
			}
		}

		return liveable;
	}
}
