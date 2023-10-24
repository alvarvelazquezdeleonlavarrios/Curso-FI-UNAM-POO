public class Enemigo {
	
	/*** Atributos ***/
	String nombre;
	float vida;
	
	private float tiempo_reaparicion_actual = 0f;
	float vida_maxima = 50f;


	/*** Métodos ***/
	// Permite al enemigo moverse
	void mover() {
		System.out.println(nombre + " se está moviendo.");
	}

}
