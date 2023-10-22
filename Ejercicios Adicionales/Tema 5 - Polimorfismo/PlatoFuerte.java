// Definición de la clase hija "PlatoFuerte.java"
public class PlatoFuerte extends Platillo {

	/** Constructores de la clase PlatoFuerte.java **/
	PlatoFuerte() {}

	PlatoFuerte(String nombre, int precio) {
		super(nombre, precio);
	}

	/** Métodos de la clase PlatoFuerte.java **/

	void funcionPlatoFuerte() {
		System.out.println(nombre + " llamó a la función propia de un plato fuerte.");
	}

}