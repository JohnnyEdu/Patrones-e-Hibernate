package Fabricas;

import ProductosAbstractos.Bicicleta;
import ProductosAbstractos.Rueda;
import ProductosConcretos.BicicletaBMX;
import ProductosConcretos.BicicletaMTB;

public class FabricaMTB extends FabricaBicicletas{
	FabricaComponentesMTB componentesMTB = new FabricaComponentesMTB();
	public Bicicleta crearBicicleta() {
		System.out.println("Bicicleta MTB");
		System.out.println("Ensamblando cuadro");
		cuadro = componentesMTB.crearCuadro();
		System.out.println("Ensamblando ruedas");
		rueda = componentesMTB.crearRueda();
		Rueda[]ruedas = new Rueda[2];
		ruedas[0] = rueda;
		ruedas[1] = rueda;
		System.out.println("Agregando accesorios");
		accesorios = componentesMTB.crearAccesorios();
		Bicicleta biciBmx = new BicicletaMTB(cuadro,ruedas);
		return biciBmx;
	}

}
