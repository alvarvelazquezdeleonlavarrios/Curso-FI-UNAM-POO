// Definición de la clase padre "Platillo.java"
public class Platillo {

	/** Atributos de la clase Platillo.java **/
	String nombre;
	int precio;


	/** Constructores de la clase Platillo.java **/
	Platillo() {}

	Platillo(String nombre, int precio) {
		this.nombre = nombre;
		this.precio = precio;
	}


	/** Métodos de la clase Platillo.java **/

	void imprimirInformacion(){
		System.out.println(nombre + " es un PLATILLO GENÉRICO con un precio de $" + precio);
	}

	void funcionPlatillo(){
		System.out.println(nombre + " llamó a la función propia de un platillo genérico.");
	}

}