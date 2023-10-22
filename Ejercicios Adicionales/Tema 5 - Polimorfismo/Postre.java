// Definición de la clase hija "Postre.java"
public class Postre extends Platillo {

	/** Constructores de la clase Postre.java **/
	Postre() {}

	Postre(String nombre, int precio) {
		super(nombre, precio);
	}

	/** Métodos de la clase Postre.java **/

	void funcionPostre() {
		System.out.println(nombre + " llamó a la función propia de un postre.");
	}

}