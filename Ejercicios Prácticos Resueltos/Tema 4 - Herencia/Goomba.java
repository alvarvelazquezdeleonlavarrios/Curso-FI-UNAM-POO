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

	// Imprime la vida máxima de un Goomba y la de un Enemigo "genérico"
	void imprimirVidaMaxima() {
		System.out.println("\n-----------------------------");
		System.out.println("Vida Maxima de Goomba: " + vida_maxima);
		System.out.println("Vida Maxima de Enemigo: " + super.vida_maxima);
		System.out.println("----------------------------\n");
	}

}
