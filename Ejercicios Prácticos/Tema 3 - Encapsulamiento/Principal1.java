// Creación de la clase llamada Principal1.java
public class Principal1 {
	
	// Función principal del programa
	public static void main(String[] args) {

		// Crea un nuevo objeto de tipo Jugador
		Jugador jugador_1 = new Jugador("Mario");

		// Imprime en pantalla los atributos del jugador 1 y lo hace realizar algunas acciones
		System.out.println("\n--------- Propiedades Jugador 1 --------------");
		System.out.println("Nombre del jugador 1: " + jugador_1.nombre);
		System.out.println("Vidas del jugador 1: " + jugador_1.vidas);
		System.out.println("Velocidad de movimiento del jugador 1: " + jugador_1.velocidad_mov);
		System.out.println("¿En el suelo jugador 1?: " + jugador_1.en_suelo);
		System.out.println("Objeto en el inventario: " + jugador_1.item_fruta.nombre);
		System.out.println("");
		jugador_1.mover();
		jugador_1.saltar();
	}
}


/* -------- Ejercicio #1 ----------
	Compila primero (así como viene) la clase Jugador.java y después esta clase Principal1.java. 
	Luego ejecuta el archivo Principal1.class. Responde las siguintes preguntas:

	1.- Así como viene el código de esta función principal, ¿imprimirá en pantalla la información
	contenida en el Jugador 1? Explica el por qué del resultado.



	2.- En caso de que este programa haya podido imprimir en pantalla la información del Jugador 1,
	implica que los atributos y métodos de Jugador.java se encuentran en riesgo ante posibles Hackers. 
	¿Qué tendrías que hacer para que no puedan acceder a dicha información?
		
	Realiza las modificaciones correspondientes en Jugador.java y vuelve a compilar dicha clase.



	3.- Una vez realizadas las modificaciones correspondientes en Jugador.java, realiza alguna de
	siguientes acciones: ya sea que intentes ejecutar	de nuevo este programa principal, 
	o bien, que lo vuelvas a compilar.

	En cualquier caso, ¿se ejecutará este programa o imprimirá errores en la pantalla?
	Si imprime errores en pantalla, responde: ¿por qué sucede esto?

*/
