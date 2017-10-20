package AbstractFactory;

import java.util.ArrayList;

import Ingredientes.*;

/**
 * Producto
 *Se reemplazan los atributos String por otros objetos producto
 *(Producto de productos)
 * */
public abstract class Pizza {
	 String name;
	    protected PizzaIngredientFactory ingredientFactory;
	    protected Dough dough;
	    protected Sauce sauce;
	    protected Veggies veggies[];
	    protected Cheese cheese;
	    protected Pepperoni pepperoni;
	    /**
		  * Las pizzas se preparan igual, pero con ingredientes diferentes para cada Store.
		  * Pizza de queso lleva lo mismo (masa,salsa,queso) pero con diferentes tipos de masa, salsa y queso.
		  * */
	    public Pizza(PizzaIngredientFactory ingredientFactory){
	        this.ingredientFactory = ingredientFactory;
	    }
	    /**
	     * Preparacion diferente dependiendo de la factory de pizza
	     * */
	    public abstract void prepare();
	 
	    public void bake() {
	        System.out.println("Bake for 25 minutes at 350");
	    }
	 
	    public void cut() {
	        System.out.println("Cutting the pizza into diagonal slices");
	    }
	 
	    public void box() {
	        System.out.println("Place pizza in official PizzaStore box");
	    }
	 
	    public void setName(String name) {
	        this.name = name;
	    }
	 
	    public String getName() {
	        return name;
	    }
		 
	public abstract String whatPizza();
}
