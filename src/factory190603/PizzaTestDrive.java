package factory190603;

public class PizzaTestDrive {
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();

		Pizza nyStylePizza = nyStore.orderPizza("cheese");
		System.out.println(nyStylePizza.getName());
		System.out.println("-------------------------------------------------");

		Pizza chicagoStylePizza = chicagoStore.orderPizza("cheese");
		System.out.println(chicagoStylePizza.getName());
	}
}
