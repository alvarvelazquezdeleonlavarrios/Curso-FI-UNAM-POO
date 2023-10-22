public class Producto {

	/** Atributos de un Producto **/
	protected String nombre;
	protected int precio;


	/** Constructores de Producto.java **/
	public Producto(){}

	public Producto(String nombre, int precio){
		this.nombre = nombre;
		this.precio = precio;
	}


	/** Métodos de un producto **/

	public void consultarInformacion() {
		System.out.println("--------Producto: " + nombre + " ------------");
		System.out.println("Precio: $" + precio);
	}

}