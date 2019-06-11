package factory190603;

public class CheesePizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;

	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	public void prepare() {
		this.dough = ingredientFactory.createDough();
		this.sauce = ingredientFactory.createSauce();
		this.cheese = ingredientFactory.createCheese();
	}

	public PizzaIngredientFactory getIngredientFactory() {
		return ingredientFactory;
	}

	public void setIngredientFactory(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}


}
