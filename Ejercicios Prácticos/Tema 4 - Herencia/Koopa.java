public class Koopa extends Enemigo {

	/*** Constructores ***/
	Koopa(){
		nombre = "Koopa";
		vida = 40f;
	}


	/*** Métodos ***/
	// Permite al Koopa rodar
	void rodar(){
		System.out.println(nombre + " está rodando.");
	}

}