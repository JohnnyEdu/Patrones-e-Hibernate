package practicasunaj.metodologias.SimpleFactory;
/**
 * Fabrica de pizzas
 * */
public class SimplePizzaFactory {
	public Pizza createPizza(String type){
		//aca habiendo una clase concreta por cada tipo de pizza se instancian.
		return new CheesePizza();
	}
}
