public class Koopa extends Enemigo {

	/*** Constructores ***/
	Koopa() {
		nombre = "Koopa";
	}


	/*** Métodos ***/
	// Permite al Koopa "hablar"
	void dialogar() {
		System.out.println("Soy un Koopa.");
	}


	/* ---- Función para el Ejercicio #3.2.1 y #3.2.2 ----
	@Override
	void saltar() {
		System.out.println("Koopa a saltado");
	}
	*/
	
}