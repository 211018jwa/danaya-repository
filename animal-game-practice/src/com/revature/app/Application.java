package com.revature.app;

import javax.swing.text.DefaultHighlighter;

import com.revature.model.Animal;
import com.revature.model.Monster;
import com.revature.model.Food;

public class Application {
	public static void main(String args[]) {

		Animal animal1 = new Animal("Bunny", "Fufu", 1, 100);
		Monster monster1 = new Monster("Fox", 7, 15);
		Monster monster2 = new Monster("cat", 2, 5);
		Food food1 = new Food("Carrot", 3);
		Food food2 = new Food(" Strawberry", 8);

		animal1.stats();

		System.out.println();

		animal1.gotHit(monster2);
		System.out.println("Taking damage. AHHHH!");
		System.out.println("HP: " + animal1.hP);

		System.out.print("\n");

		animal1.attack(monster2);
		System.out.println("Level Up!!");
		System.out.println("Level: " + animal1.level);

		System.out.println();

		animal1.gotHit(monster1);
		System.out.println("Taking damage. OUCH!!");
		System.out.println("HP: " + animal1.hP);

		System.out.print("\n");

		animal1.attack(monster1);
		System.out.println("Level Up!!");
		System.out.println("Level: " + animal1.level);

		System.out.println();

		animal1.eat(food1);
		System.out.println("Yum!");
		System.out.println("HP: " + animal1.hP);

		System.out.println();

		animal1.eat(food2);
		System.out.println("Delicious!");
		System.out.println("HP: " + animal1.hP);
	}

}
