package AbstractFactory;
/**
 * Fabrica de pizzas 
 * */
public class NYPizzaStore extends PizzaStore{

	/**
	 * Este es el metodo principal de creacion para el factory method
	 * No se ocupa una fabrica externa sino cada clase concreta que extiende de 
	 * la que antes era el cliente de la fabrica
	 * 
	 * Factory Method evolucion a Abstract Factory debido a PizzaIngredientFactory
	 * */
	public Pizza createPizza(String item) {
		NYIngredientFactory ingredientFactory = new NYIngredientFactory();
		Pizza pizza = null;
		 if (item.equals("cheese")) {
	            pizza = new CheesePizza(ingredientFactory);
	            pizza.setName("New York Style Cheese Pizza");
	        } else if (item.equals("veggie")) {
	  
	            pizza = new VeggiePizza(ingredientFactory);
	            pizza.setName("New York Style Veggie Pizza");
	        } else if (item.equals("pepperoni")) {
	            pizza = new PepperoniPizza(ingredientFactory);
	            pizza.setName("New York Style Pepperoni Pizza");
	        }

		return pizza;
	}
}
