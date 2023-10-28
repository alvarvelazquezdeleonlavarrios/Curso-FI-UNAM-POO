package mivideojuego.entidades.hostiles;

public class Enemigo {

	/*** Atributos ***/
	protected String nombre = "Enemigo";
	protected float salud = 10f;
	protected float velocidad_movimiento = 0.5f;


	/*** Constructores ***/
	public Enemigo() { }


	/*** Métodos ***/

	// Permite al enemigo moverse en la "escena"
	public void moverse() {
		System.out.println(nombre + " se está moviendo con una velocidad de " + velocidad_movimiento);
	}

	// Muestra en pantalla las características de este enemigo
	public void imprimirAtributos() {
		System.out.println("\n--------- " + nombre + " ----------");
		System.out.println("Salud: " + salud);
		System.out.println("Velocidad de movimiento: " + velocidad_movimiento);
	}

}


/* ------- Ejercicio 1.1.2 ----------
	Escribe, debajo de estos comentarios, el comando que utilizaste para generar 
	el ejecutable de esta clase y el paquete en cuestión (será importante para después)
*/

/** >> javac -cp . -d . Enemigo.java **/
