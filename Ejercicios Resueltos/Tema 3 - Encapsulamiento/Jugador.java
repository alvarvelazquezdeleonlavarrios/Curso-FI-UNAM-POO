// Creación de la clase llamada Jugador.java
public class Jugador {
	
	/*** Atributos ***/
	private String nombre = "Mario";
	private int vidas = 3;
	private float velocidad_mov = 2f;
	private boolean en_suelo = true;
	private Coleccionable item_fruta = new Coleccionable("Fruta Wumpa");


	/*** Constructores ***/
	Jugador() {}

	Jugador(String nombre) {
		this.nombre = nombre;
	}


	/*** Métodos ***/
	// Función que permite mover al jugador
	private void mover(){
		System.out.println(nombre + " se ha movido con una velocidad de " + velocidad_mov);
	}

	// Función que permite al jugador saltar
	private void saltar(){
		en_suelo = false;
		System.out.println(nombre + " ha saltado.");
	}


	/* Funciones Get para Jugador.java */
	public String getNombre(){
		return nombre;
	}

	public int getVidas(){
		return vidas;
	}

	public float getVelocidadMovimiento(){
		return velocidad_mov;
	}

	public boolean getEnSuelo(){
		return en_suelo;
	}

	public Coleccionable getItemFruta(){
		return item_fruta;
	}

}