package AbstractFactory;

import Ingredientes.Cheese;
import Ingredientes.Dough;
import Ingredientes.Garlic;
import Ingredientes.MarinaraSauce;
import Ingredientes.MozarellaCheese;
import Ingredientes.Onion;
import Ingredientes.Pepperoni;
import Ingredientes.PlumTomatoSauce;
import Ingredientes.ReggianoChesse;
import Ingredientes.Sauce;
import Ingredientes.SlicedPepperoni;
import Ingredientes.ThinCrustDough;
import Ingredientes.Veggies;

public class ChicagoIngredientFactory implements PizzaIngredientFactory {
	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		return new MozarellaCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies[]veggies = {new Garlic(),new Onion()};
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}


}
