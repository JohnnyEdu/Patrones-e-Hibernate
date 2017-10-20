package practicasunaj.metodologias.SimpleFactory;
/**
 * Producto
 * */
public abstract class Pizza {
	void prepare(){
		System.out.println("Preparing pizza");
	};
	void bake(){
		System.out.println("Baking pizza");
	};
	void cut(){
		System.out.println("Cutting pizza in square slices");
	};
	void box(){
		System.out.println("Boxing pizza");
	};

	public abstract String whatPizza();
}
