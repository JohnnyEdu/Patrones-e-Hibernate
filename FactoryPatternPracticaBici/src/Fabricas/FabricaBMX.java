package Fabricas;

import ProductosAbstractos.Bicicleta;
import ProductosAbstractos.Rueda;
import ProductosConcretos.BicicletaBMX;

public class FabricaBMX extends FabricaBicicletas{
	FabricaComponentes fabricaComponentesBMX = new FabricaComponentesBMX();

	public Bicicleta crearBicicleta() {
		System.out.println("Bicicleta BMX");
		System.out.println("Ensamblando cuadro");
		cuadro = fabricaComponentesBMX.crearCuadro();
		System.out.println("Ensamblando ruedas");
		rueda = fabricaComponentesBMX.crearRueda();
		Rueda[]ruedas = new Rueda[2];
		ruedas[0] = rueda;
		ruedas[1] = rueda;
		System.out.println("Agregando accesorios");
		accesorios = fabricaComponentesBMX.crearAccesorios();
		Bicicleta biciBmx = new BicicletaBMX(cuadro,ruedas);
		return biciBmx;
	}

	
}
