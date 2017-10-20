package practicasunaj.metodologias.SimpleFactory;


/**
 * Cliente de la factory (abstracto o cliente padre)
 * */
public abstract class PizzaStore {
	SimplePizzaFactory factory ;
	
	public PizzaStore(SimplePizzaFactory factory) {
		this.factory = factory;
		}
	public Pizza orderPizza(String type){
		Pizza pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	};
	public Pizza createPizza(String type){
		Pizza pizza = factory.createPizza(type);
		return pizza;
	};
}
