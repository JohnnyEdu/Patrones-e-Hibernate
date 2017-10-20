package AbstractFactory;

import Ingredientes.Cheese;
import Ingredientes.Dough;
import Ingredientes.Pepperoni;
import Ingredientes.Sauce;
import Ingredientes.Veggies;

public interface PizzaIngredientFactory {
	public Dough createDough();
	public Sauce createSauce();  
	public Cheese createCheese(); 
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni(); 
}

