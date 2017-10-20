package Fabricas;

import java.util.ArrayList;

import ProductosAbstractos.Accesorio;
import ProductosAbstractos.Cuadro;
import ProductosAbstractos.Rueda;
import ProductosConcretos.CuadroBMX;
import ProductosConcretos.RuedaBMX;

public class FabricaComponentesBMX extends FabricaComponentes{

	@Override
	public Cuadro crearCuadro() {
		return new CuadroBMX();
	}

	@Override
	public Rueda crearRueda() {
		return new RuedaBMX();
	}

	@Override
	public ArrayList<Accesorio> crearAccesorios() {
		ArrayList<Accesorio> accesorios = new ArrayList<>();
		return accesorios;
	}

}
