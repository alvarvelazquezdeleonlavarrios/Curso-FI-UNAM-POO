package mivideojuego.armas;

public class ArmaLargoAlcance {

	/*** Atributos ***/
	String nombre;
	int balas_actuales;
	int balas_inventario;


	/*** Constructores ***/
	public ArmaLargoAlcance() { }

	public ArmaLargoAlcance(String nombre, int balas_actuales, int balas_inventario) { 
		this.nombre = nombre;
		this.balas_actuales = balas_actuales;
		this.balas_inventario = balas_inventario;
	}


	/*** Métodos ***/

	// Función programada para el ejercicio 1.2.4
	public void imprimirAtributos() {
		System.out.println("\n------------- Arma de Largo Alcance ---------------");
		System.out.println("Nombre: " + nombre);
		System.out.println("Balas actuales: " + balas_actuales);
		System.out.println("Balas en el inventario: " + balas_inventario);
	}

}


/* ------- Ejercicio 1.1.5 ----------
	Escribe, debajo de estos comentarios, el comando que utilizaste para generar 
	el ejecutable de esta clase y el paquete en cuestión (será importante para después)
*/

/** >> javac -cp . -d . ArmaLargoAlcance.java **/
