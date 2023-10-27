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
	void dialogar(int vidas) { 
		/*Tu código aquí*/
		System.out.println("Soy un enemigo genérico que tiene " + vidas + " vidas");
	}

	void dialogar(String nombre) { 
		/*Tu código aquí*/ 
		System.out.println("Soy un enemigo genérico y me llamo " + nombre);
	}

	void dialogar(int vidas, String nombre) { 
		/*Tu código aquí*/	
		System.out.println("Soy un enemigo genérico, me llamo " + nombre + " y tengo " + vidas + " vidas.");
	}


	void mover(){
		System.out.println("Este enemigo se está moviendo");
	}


	void saltar() {
		System.out.println("El enemigo ha saltado");
	}

}
