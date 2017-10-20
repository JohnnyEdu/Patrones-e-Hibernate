package AbstractFactory;

/**
 * Clase concreta de producto(producto concreto)
 * */
public class VeggiePizza extends Pizza{

	
	/**
	 * La fabrica a la cual van a hacer referencia los ingredientes
	 * */
	public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
		super(ingredientFactory);
	}

	@Override
	public String whatPizza() {
		return "This is a cheese pizza" + name;
	}

	@Override
	public void prepare() {
		System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggies = ingredientFactory.createVeggies();
	}
}
