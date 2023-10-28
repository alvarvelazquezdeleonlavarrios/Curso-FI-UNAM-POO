package mivideojuego.entidades.hostiles;

public class Goomba extends Enemigo {

	/*** Atributos ***/
	float velocidad_correr = 1.4f;


	/*** Constructores ***/
	public Goomba() {
		nombre = "Goomba";
		salud = 20f;
		velocidad_movimiento = 0.9f;
	}

	public Goomba(String nombre) {
		this.nombre = nombre;
		salud = 20f;
		velocidad_movimiento = 0.9f;
	}


	/*** Métodos ***/

	// Permite al goomba correr
	public void correr() {
		System.out.println(nombre + " está corriendo a una velocidad de " + velocidad_correr);
	}

	// Muestra en pantalla las características de este goomba
	@Override
	public void imprimirAtributos() {
		super.imprimirAtributos();
		System.out.println("Velocidad de correr: " + velocidad_correr);
	}

}


/* ------- Ejercicio 1.1.3 ----------
	Escribe, debajo de estos comentarios, el comando que utilizaste para generar 
	el ejecutable de esta clase y el paquete en cuestión (será importante para después)
*/

/** >> javac -cp . -d . Goomba.java **/
