// Creación de la clase llamada Jugador.java 
/*** Jugador --> Identificador de clase ***/
class Jugador {

	/*** Atributos de la clase "Jugador" ***/
	String nombre = "Mario";
	int vidas = 3;
	float velocidad_mov = 2f;
	boolean en_suelo = true;


	/*** Constructores de la clase "Jugador" ***/
	// Constructor predeterminado
	Jugador() {}

	// Constructor personalizado
	Jugador(String nombre) {
		this.nombre = nombre;
	}


	/*** Métodos de la clase "Jugador" ***/
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