// Definición de la clase hija "PlatoEntrada.java"
public class PlatoEntrada extends Platillo {

	/** Constructores de la clase PlatoEntrada.java **/
	PlatoEntrada() {}

	PlatoEntrada(String nombre, int precio) {
		super(nombre, precio);
	}

	/** Métodos de la clase PlatoEntrada.java **/

	void funcionPlatoEntrada() {
		System.out.println(nombre + " llamó a la función propia de un plato de entrada.");
	}

}