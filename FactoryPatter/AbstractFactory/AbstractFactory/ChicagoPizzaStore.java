package AbstractFactory;
/**
 * Fabrica de pizzas 
 * */
public class ChicagoPizzaStore extends PizzaStore{

	/**
	 * Este es el metodo principal de creacion para el factory method
	 * No se ocupa una fabrica externa sino cada clase concreta que extiende de 
	 * la que antes era el cliente de la fabrica
	 * 
	 * Factory Method
	 * */
	public Pizza createPizza(String item) {
		ChicagoIngredientFactory ChicIngredientFact = new ChicagoIngredientFactory();
		Pizza pizza = null;
		 if (item.equals("cheese")) {
	            pizza = new CheesePizza(ChicIngredientFact);
	            pizza.setName("New York Style Cheese Pizza");
	        } else if (item.equals("veggie")) {
	  
	            pizza = new VeggiePizza(ChicIngredientFact);
	            pizza.setName("New York Style Veggie Pizza");
	        } else if (item.equals("pepperoni")) {
	            pizza = new PepperoniPizza(ChicIngredientFact);
	            pizza.setName("New York Style Pepperoni Pizza");
	        }

		return pizza;
	}
}
