package ProductosConcretos;

import ProductosAbstractos.Bicicleta;
import ProductosAbstractos.Cuadro;
import ProductosAbstractos.Rueda;

public class BicicletaMTB extends Bicicleta{

	public BicicletaMTB(Cuadro cuadro, Rueda[] ruedas) {
		super(cuadro, ruedas);
	}
	@Override
	public String verBici() {
		return "Bicicleta MTB" + "Ruedas: "+ruedas + "Cuadro : "+ cuadro;
	}
}
