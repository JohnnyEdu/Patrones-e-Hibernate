package practicasunaj.metodologias.FactoryMethod;
/**
 * Fabrica de pizzas 
 * */
public class NYPizzaStore extends PizzaStore{

	/**
	 * Este es el metodo principal de creacion para el factory method
	 * No se ocupa una fabrica externa sino cada clase concreta que extiende de 
	 * la que antes era el cliente de la fabrica
	 * 
	 * Factory Method
	 * */
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equalsIgnoreCase("cheese")){
			pizza =  new CheesePizza();
		}
		return pizza;
	}
}
