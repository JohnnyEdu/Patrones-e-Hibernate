import Fabricas.FabricaBMX;
import Fabricas.FabricaBicicletas;
import Fabricas.FabricaMTB;
import ProductosAbstractos.Bicicleta;

public class Cliente {
	public static void main(String[] args) {
		FabricaBicicletas fabrica = new FabricaBMX();
		Bicicleta biciBmx = fabrica.crearBicicleta();
		System.out.println(biciBmx.verBici());
		FabricaBicicletas fabricaMTB = new FabricaMTB();
		Bicicleta bixiMtb = fabricaMTB.crearBicicleta();
		System.out.println(bixiMtb.verBici());
	}
	
	
}
