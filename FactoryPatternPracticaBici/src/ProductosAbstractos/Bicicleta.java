package ProductosAbstractos;

public abstract class Bicicleta {
	public Cuadro cuadro;
	public Rueda[] ruedas;
	
	public Bicicleta(Cuadro cuadro,Rueda[] ruedas) {
		this.cuadro = cuadro;
		this.ruedas = ruedas;
	}
	public abstract String verBici();
	
}
