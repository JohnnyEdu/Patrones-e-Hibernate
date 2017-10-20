package AbstractFactory;

/**
 * Clase concreta de producto(producto concreto)
 * */
public class PepperoniPizza extends Pizza{

	
	/**
	 * La fabrica a la cual van a hacer referencia los ingredientes
	 * */
	public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
		super(ingredientFactory);
	}

	@Override
	public String whatPizza() {
		return "This is a cheese pizza" + name;
	}
	/**
	 * Dependiendo de la fabrica (Ingredientes de NY o de Chicago) 
	 * se va a preparar con dichos ingredientes
	 * */
	@Override
	public void prepare() {
		System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggies = ingredientFactory.createVeggies();
        pepperoni = ingredientFactory.createPepperoni();
	}
}
