package com.revature.model;

public class Animal {

	public String species;
	public String name;
	public int level;
	public int hP;

	public Animal(String species, String name, int level, int hP) {
		this.species = species;
		this.name = name;
		this.level = level;
		this.hP = hP;
	}

	public void gotHit(Monster monster) { // method 1
		System.out.println(this.name + " is getting hit by a " + monster.name + "!");
		this.hP = this.hP - monster.damage;
	}

	public void attack(Monster monster) { // method 2
		System.out.println(this.name + " is attacking the " + monster.name + "!");
		this.level = this.level + monster.level;
	}

	public void eat(Food food) { // method 3
		System.out.println(this.name + " is eating " + food.name);
		this.hP = this.hP + food.healing;
	}

	public void stats() {
		System.out.println("Species: " + this.species);
		System.out.println("Name: " + this.name);
		System.out.println("Level: " + this.level);
		System.out.println("HP: " + this.hP);
	}
}
