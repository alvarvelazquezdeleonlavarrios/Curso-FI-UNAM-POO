public class Goomba extends Enemigo {

	/*** Atributos ***/
	float vida_maxima = 20f;


	/*** Constructores ***/
	Goomba(){
		nombre = "Goomba";
		vida = 20f;
	}

	/*** Métodos ***/
	// Permite al Goomba correr
	void correr(){
		System.out.println(nombre + " está corriendo.");
	}

}