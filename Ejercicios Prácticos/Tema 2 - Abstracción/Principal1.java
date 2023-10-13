// Creación de la clase llamada Principal.java
/*** Principal1 --> Identificador de clase ***/
class Principal1 {
	
	/*** Métodos de la clase "Principal1" ***/
	// Función principal del programa
	public static void main(String[] args) {

		// Nuevo objeto de tipo Jugador
		Jugador jugador_1 = new Jugador("Mario");
		jugador_1.vidas = 3;

		// Imprime en pantalla los atributos del jugador 1 y lo hace realizar algunas acciones
		System.out.println("\n--------- Propiedades Jugador 1 --------------");
		System.out.println("Nombre del jugador 1: " + jugador_1.nombre);
		System.out.println("Vidas del jugador 1: " + jugador_1.vidas);
		System.out.println("Velocidad de movimiento del jugador 1: " + jugador_1.velocidad_mov);
		System.out.println("¿En el suelo jugador 1?: " + jugador_1.en_suelo);
		System.out.println("");
		jugador_1.mover();
		jugador_1.saltar();


		/* -------- Ejercicio #1 ----------
		Debajo de estos comentarios, crea un nuevo objeto de tipo Jugador 
		que tenga las siguientes caracterísitcas:
			- Que su nombre sea "Luigi"
			- Que tenga 5 vidas
			- Que su velocidad de movimiento sea 2.7
			- Que se mueva
			- Que salte

		Las características anteriormente mencionadas debes imprimirlas en pantalla
		para corroborar que tu código sea correcto
		*/

	}
}