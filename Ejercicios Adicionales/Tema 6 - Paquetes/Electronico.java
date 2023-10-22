public class Electronico extends Producto {

	/** Atributos de un Electronico **/
	private String pais_origen;


	/** Constructores de Electronico.java **/
	public Electronico(){}

	public Electronico(String nombre, int precio, String pais_origen){
		super(nombre, precio);
		this.pais_origen = pais_origen;
	}


	/** Métodos de un producto **/

	public void consultarInformacion() {
		super.consultarInformacion();
		System.out.println("Pais de Origen: " + pais_origen);
	}

}