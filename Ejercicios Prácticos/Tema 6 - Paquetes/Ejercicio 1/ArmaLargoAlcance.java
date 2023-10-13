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

}


/* ------- Ejercicio 1.1.5 ----------
	Escribe, debajo de estos comentarios, el comando que utilizaste para generar 
	el ejecutable de esta clase y el paquete en cuestión (será importante para después)
*/
