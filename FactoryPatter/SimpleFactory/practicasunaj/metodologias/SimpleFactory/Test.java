package practicasunaj.metodologias.SimpleFactory;

public class Test {
 public static void main(String[] args) {
	 System.err.println("<<<<SimpleFactory >>>>");
	SimplePizzaFactory fabricaDePizzas = new SimplePizzaFactory();
	PizzaStore localPizzas = new NYPizzaStore(fabricaDePizzas);
	Pizza pizza = localPizzas.orderPizza("Queso");
	System.out.println(pizza.whatPizza());
}
}
