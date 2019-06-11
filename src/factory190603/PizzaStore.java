package factory190603;

public abstract class PizzaStore {

	public Pizza orderPizza(String type) {
		Pizza pizza;

		pizza = createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

	//팩토리 메소드
	//Pizza 인스턴스를 만드는 일은 팩토리 역할을 하는 메소드에서 맡아 처리한다.
	 abstract Pizza createPizza(String type);
}
