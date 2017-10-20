package ProductosConcretos;

import ProductosAbstractos.Bicicleta;
import ProductosAbstractos.Cuadro;
import ProductosAbstractos.Rueda;

public class BicicletaBMX extends Bicicleta{
	public BicicletaBMX(Cuadro cuadro,Rueda[] ruedas) {
		super(cuadro, ruedas);
	}
	@Override
	public String verBici() {
		return "Bicicleta BMX" + "Ruedas: "+ruedas + "Cuadro : "+ cuadro;
	}
	
}
