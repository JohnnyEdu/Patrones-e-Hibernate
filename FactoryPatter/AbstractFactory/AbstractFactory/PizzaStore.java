package AbstractFactory;

/**
 * Padre de las fabricas que implementa los metodos que no son de creacion
 * Las hijas, implementan el metodo de creacion de un producto 
 * */

public abstract class PizzaStore {
	/**
	 * En factory method, el orderPizza sigue haciendo lo mismo
	 * */
	Pizza orderPizza(String type){
		Pizza pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	};
	/**
	 * El metodo creador cambia para ser implementado por cada clase hija de PizzaStore
	 * en el simpleFactory se ipmlementaba directamente en la clase padre llamando al factory correspondiente
	 * 
	 * Factory method
	 * */
	
	abstract Pizza createPizza(String type);
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
}
