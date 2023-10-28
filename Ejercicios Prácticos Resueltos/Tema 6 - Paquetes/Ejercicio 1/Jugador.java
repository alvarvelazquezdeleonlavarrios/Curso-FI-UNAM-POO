package mivideojuego.entidades;

public class Jugador {

	/*** Atributos ***/
	String nombre = "";
	int vidas = 3;
	float velocidad_movimiento = 2f;


	/*** Constructores ***/
	public Jugador() {
		nombre = "Jugador";
	}

	public Jugador(String nombre) {
		this.nombre = nombre;
	}


	/*** Métodos ***/

	public void imprimirPropiedades(){
		System.out.println("\n------------- Jugador ---------------");
		System.out.println("Nombre: " + nombre);
		System.out.println("Vidas: " + vidas);
		System.out.println("Velocidad de Movimiento: " + velocidad_movimiento);
	}

}


/* ------- Ejercicio 1.1.1 ----------
	Escribe, debajo de estos comentarios, el comando que utilizaste para generar 
	el ejecutable de esta clase y el paquete en cuestión (será importante para después)
*/

/** >> javac -cp . -d . Jugador.java **/
