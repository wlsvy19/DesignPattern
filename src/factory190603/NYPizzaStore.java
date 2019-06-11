package factory190603;

public class NYPizzaStore extends PizzaStore {
	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		if(type.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName(ingredientFactory.NY_STYLE + "Cheese Pizza");
		}
		if(type.equals("pepper")) {
			pizza = new NYStylePepperoniPizza();
		}
		if(type.equals("clam")) {
			pizza = new NYStyleClamPizza();
		}
		if(type.equals("veggie")) {
			pizza = new NYStyleVeggiePizza();
		}
		return pizza;
	}
}
