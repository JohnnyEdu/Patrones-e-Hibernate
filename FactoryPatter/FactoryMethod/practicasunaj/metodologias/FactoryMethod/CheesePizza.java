package practicasunaj.metodologias.FactoryMethod;

/**
 * Clase concreta de producto(producto concreto)
 * */
public class CheesePizza extends Pizza{

	@Override
	public String whatPizza() {
		return "This is a cheese pizza";
	}
}
