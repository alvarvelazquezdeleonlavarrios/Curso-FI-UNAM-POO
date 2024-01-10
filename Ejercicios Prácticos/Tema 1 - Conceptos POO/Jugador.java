// Creación de la clase llamada Jugador.java
class Jugador{
	
	// Declaración de la función principal del programa
	public static void main(String[] args){

		/* -------- Ejercicio #2 ----------
		Antes de ejecutar este programa, analiza todo este código y
		responde a las siguientes preguntas que vienen en los comentarios
		*/

		// Nuevo objeto de tipo Jugador
		Jugador jugador_1 = new Jugador();
		System.out.println("\n---------------------------------------");
		System.out.println("Contenido de jugador_1: " + jugador_1);

		// Nuevo objeto de tipo Jugador
		Jugador jugador_2 = new Jugador();
		System.out.println("Contenido de jugador_2: " + jugador_2);


		// La referencia "jugador_1" apunta al objeto contenido en "jugador_2"
		/* Pregunta #1.- ¿Qué valor contiene la referencia "jugador_1"? */
		jugador_1 = jugador_2;
		System.out.println("\n---------------------------------------");
		System.out.println("Contenido de jugador_1: " + jugador_1);
		System.out.println("Contenido de jugador_2: " + jugador_2);


		// La referencia "jugador_2" apunta al objeto contenido en "jugador_1"
		/* Pregunta #2.- ¿Qué valor contiene la referencia "jugador_2"? */
		jugador_2 = jugador_1;
		System.out.println("\n---------------------------------------");
		System.out.println("Contenido de jugador_1: " + jugador_1);
		System.out.println("Contenido de jugador_2: " + jugador_2);


		/* Pregunta #3.- Pregunta capciosa... si hay algún objeto de tipo Jugador que ya no 
		esté contenido en alguna de las dos referencias, ¿dicho objeto de tipo Jugador 
		seguirá almacenado en la memoria de la computadora?
		*/
	}

}