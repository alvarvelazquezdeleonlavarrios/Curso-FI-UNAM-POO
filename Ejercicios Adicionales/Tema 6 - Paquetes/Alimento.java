public class Alimento extends Producto {

	/** Atributos de un Alimento **/
	private String fecha_expiracion;


	/** Constructores de Alimento.java **/
	public Alimento(){}

	public Alimento(String nombre, int precio, String fecha_expiracion){
		super(nombre, precio);
		this.fecha_expiracion = fecha_expiracion;
	}


	/** Métodos de un producto **/

	public void consultarInformacion() {
		super.consultarInformacion();
		System.out.println("Fecha de expiracion: " + fecha_expiracion);
	}

}