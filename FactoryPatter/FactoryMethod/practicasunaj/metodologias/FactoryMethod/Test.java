package practicasunaj.metodologias.FactoryMethod;

import javax.sound.midi.SysexMessage;

public class Test {
 public static void main(String[] args) {
	System.err.println("<<<<<Factory method>>>>");
	PizzaStore localPizzas = new NYPizzaStore();
	Pizza pizza = localPizzas.orderPizza("cheese");
	System.out.println(pizza.whatPizza());
}
}
