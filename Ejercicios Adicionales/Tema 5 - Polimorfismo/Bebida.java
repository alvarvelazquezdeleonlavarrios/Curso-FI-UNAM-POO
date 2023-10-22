// Definición de la clase hija "Bebida.java"
public class Bebida extends Platillo {

	/** Constructores de la clase Bebida.java **/
	Bebida() {}

	Bebida(String nombre, int precio) {
		super(nombre, precio);
	}

	/** Métodos de la clase Bebida.java **/

	void funcionBebida() {
		System.out.println(nombre + " llamó a la función propia de una bebida.");
	}

}