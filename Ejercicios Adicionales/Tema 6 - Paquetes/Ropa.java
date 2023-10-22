public class Ropa extends Producto {

	/** Atributos de un Ropa **/
	private String parte_del_cuerpo;


	/** Constructores de Ropa.java **/
	public Ropa(){}

	public Ropa(String nombre, int precio, String parte_del_cuerpo){
		super(nombre, precio);
		this.parte_del_cuerpo = parte_del_cuerpo;
	}


	/** Métodos de un producto **/

	public void consultarInformacion() {
		super.consultarInformacion();
		System.out.println("Parte del cuerpo: " + parte_del_cuerpo);
	}

}