package practicasunaj.metodologias.SimpleFactory;
/**
 * Cliente concreto de la factory
 * */
public class NYPizzaStore extends PizzaStore{
	
	public NYPizzaStore(SimplePizzaFactory factory) {
		super(factory);
	}
}
