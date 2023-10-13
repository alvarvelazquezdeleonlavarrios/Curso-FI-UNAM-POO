public class Goomba extends Enemigo {

	/*** Constructores ***/
	Goomba() {
		nombre = "Goomba";
	}


	/*** Métodos ***/
	// Permite al Goomba "hablar"
	void dialogar() {
		System.out.println("Soy un Goomba.");
	}


	@Override
	void mover(){
		super.mover();
		System.out.println("Goomba se está moviendo");
	}

}