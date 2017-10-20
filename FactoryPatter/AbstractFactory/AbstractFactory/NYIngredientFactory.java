package AbstractFactory;

import Ingredientes.Cheese;
import Ingredientes.Dough;
import Ingredientes.Garlic;
import Ingredientes.MarinaraSauce;
import Ingredientes.Onion;
import Ingredientes.Pepperoni;
import Ingredientes.ReggianoChesse;
import Ingredientes.Sauce;
import Ingredientes.SlicedPepperoni;
import Ingredientes.ThinCrustDough;
import Ingredientes.Veggies;

public class NYIngredientFactory implements PizzaIngredientFactory {
	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoChesse();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies[]veggies = {new Onion(),new Garlic()};
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}


}
