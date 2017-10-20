package Fabricas;

import java.util.ArrayList;

import ProductosAbstractos.Accesorio;
import ProductosAbstractos.Bicicleta;
import ProductosAbstractos.Cuadro;
import ProductosAbstractos.Rueda;

public abstract class FabricaBicicletas {
	Cuadro cuadro;
	Rueda rueda;
	ArrayList<Accesorio>accesorios = new ArrayList<Accesorio>();
	
	public abstract Bicicleta crearBicicleta();
	

}
