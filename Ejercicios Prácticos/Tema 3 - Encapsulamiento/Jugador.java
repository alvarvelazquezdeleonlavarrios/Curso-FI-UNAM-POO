// Creación de la clase llamada Jugador.java
public class Jugador {
	
	/*** Atributos ***/
	String nombre = "Mario";
	int vidas = 3;
	float velocidad_mov = 2f;
	boolean en_suelo = true;
	Coleccionable item_fruta = new Coleccionable("Fruta Wumpa");


	/*** Constructores ***/
	Jugador() {}

	Jugador(String nombre) {
		this.nombre = nombre;
	}


	/*** Métodos ***/
	// Función que permite mover al jugador
	void mover(){
		System.out.println(nombre + " se ha movido con una velocidad de " + velocidad_mov);
	}

	// Función que permite al jugador saltar
	void saltar(){
		en_suelo = false;
		System.out.println(nombre + " ha saltado.");
	}

}