package factory190603;

import java.util.ArrayList;

public abstract class Pizza {
	String name;
	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clams;
	ArrayList<String> toppings = new ArrayList<>();



	//추상메소드로 바꾼다
	public abstract void prepare();

	void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

	void cut() {
		System.out.println("Cutting the pizza into diagonal slice");
	}

	void box() {
		System.out.println("Place pizza in official PizzaStroe box");
	}

	public String getName() {
		return this.name;
	}
}
