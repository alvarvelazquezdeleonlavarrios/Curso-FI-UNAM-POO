public class Enemigo {

	/*** Atributos ***/
	String nombre;

	/*** Constructores ***/
	Enemigo() {}

	/*** Métodos ***/
	// Permite al enemigo "hablar"
	void dialogar() {
		System.out.println("Soy un enemigo genérico.");
	}


	/* --- Funciones para el Ejercicio #3.1 --- */
	void dialogar(int vidas) { /*Tu código aquí*/ }

	void dialogar(String nombre) { /*Tu código aquí*/ }

	void dialogar(int vidas, String nombre) { /*Tu código aquí*/	}


	void mover(){
		System.out.println("Este enemigo se está moviendo");
	}

}