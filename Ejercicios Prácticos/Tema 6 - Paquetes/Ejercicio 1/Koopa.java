package mivideojuego.entidades.hostiles;

public class Koopa extends Enemigo {

	/*** Atributos ***/
	float fuerza_salto = 1.2f;


	/*** Constructores ***/
	public Koopa() {
		nombre = "Koopa";
		salud = 40f;
		fuerza_salto = 1.3f;
	}

	public Koopa(String nombre) {
		this.nombre = nombre;
		salud = 40f;
		fuerza_salto = 1.3f;
	}


	/*** Métodos ***/

	// Permite al koopa saltar
	public void saltar() {
		System.out.println(nombre + " está saltando con una fuerza de " + fuerza_salto);
	}

	// Muestra en pantalla las características de este koopa
	@Override
	public void imprimirAtributos() {
		super.imprimirAtributos();
		System.out.println("Fuerza de salto: " + fuerza_salto);
	}
}


/* ------- Ejercicio 1.1.4 ----------
	Escribe, debajo de estos comentarios, el comando que utilizaste para generar 
	el ejecutable de esta clase y el paquete en cuestión (será importante para después)
*/
