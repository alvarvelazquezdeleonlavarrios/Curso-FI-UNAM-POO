package mivideojuego.armas;

public class ArmaCortoAlcance {

	/*** Atributos ***/
	String nombre;
	int durabilidad;
	int puntos_ataque;


	/*** Constructores ***/
	public ArmaCortoAlcance() { }

	public ArmaCortoAlcance(String nombre, int durabilidad, int puntos_ataque) { 
		this.nombre = nombre;
		this.durabilidad = durabilidad;
		this.puntos_ataque = puntos_ataque;
	}


	/*** Métodos ***/

	// Función programada para el ejercicio 1.2.4
	public void imprimirAtributos() {
		System.out.println("\n------------- Arma de Corto Alcance ---------------");
		System.out.println("Nombre: " + nombre);
		System.out.println("Durabilidad: " + durabilidad);
		System.out.println("Puntos de ataque: " + puntos_ataque);
	}

}


/* ------- Ejercicio 1.1.6 ----------
	Escribe, debajo de estos comentarios, el comando que utilizaste para generar 
	el ejecutable de esta clase y el paquete en cuestión (será importante para después)
*/

/** >> javac -cp . -d . ArmaCortoAlcance.java **/
