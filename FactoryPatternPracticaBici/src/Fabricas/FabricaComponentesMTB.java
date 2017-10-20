package Fabricas;

import java.util.ArrayList;

import ProductosAbstractos.Accesorio;
import ProductosAbstractos.Cuadro;
import ProductosAbstractos.Rueda;
import ProductosConcretos.CuadroMTB;
import ProductosConcretos.Pegatina;
import ProductosConcretos.RuedaMTB;

public class FabricaComponentesMTB extends FabricaComponentes{

	@Override
	public Cuadro crearCuadro() {
		return new CuadroMTB();
	}

	@Override
	public Rueda crearRueda() {
		return new RuedaMTB();
	}

	@Override
	public ArrayList<Accesorio> crearAccesorios() {
		Pegatina pegatina = new Pegatina();
		ArrayList<Accesorio> accesorios = new ArrayList<>();
		accesorios.add(pegatina);
		return accesorios;
	}

}
