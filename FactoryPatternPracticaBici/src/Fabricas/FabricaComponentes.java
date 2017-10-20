package Fabricas;

import java.util.ArrayList;

import ProductosAbstractos.Accesorio;
import ProductosAbstractos.Cuadro;
import ProductosAbstractos.Rueda;

public abstract class FabricaComponentes {
	public abstract Cuadro crearCuadro();
	public abstract Rueda crearRueda();
	public abstract ArrayList<Accesorio> crearAccesorios();

}
