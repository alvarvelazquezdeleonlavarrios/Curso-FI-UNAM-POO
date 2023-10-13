// Creación de la clase llamada Programa.java
class Programa{

	// Declaración de la función principal del programa
	public static void main(String[] args){

		/* -------- Ejercicio #1 ----------
		Antes de ejecutar este programa, analiza todo este código y 
		responde a las siguientes preguntas que vienen en los comentarios
		*/

		// Nuevo objeto de tipo String
		String texto_1 = new String("Hola");
		System.out.println("\n---------------------------------------");
		System.out.println("Valor de texto_1: " + texto_1);

		// Nuevo objeto de tipo String
		String texto_2 = new String("Soy Estudiante");
		System.out.println("Valor de texto_2: " + texto_2);


		// La referencia "texto_1" apunta al objeto contenido en "texto_2"
		/* Pregunta #1.- ¿Qué valor contiene la referencia "texto_1"? */
		texto_1 = texto_2;
		System.out.println("\n---------------------------------------");
		System.out.println("Valor de texto_1: " + texto_1);
		System.out.println("Valor de texto_2: " + texto_2);


		// La referencia "texto_2" apunta al objeto contenido en "texto_1"
		/* Pregunta #2.- ¿Qué valor contiene la referencia "texto_2"? */
		texto_2 = texto_1;
		System.out.println("\n---------------------------------------");
		System.out.println("Valor de texto_1: " + texto_1);
		System.out.println("Valor de texto_2: " + texto_2);


		/* Pregunta #3.- Pregunta capciosa... si hay algún texto que ya no esté contenido
		en alguna de las dos referencias, ¿dicho objeto de tipo String seguirá almacenado
		en la memoria de la computadora?
		*/
	}

}