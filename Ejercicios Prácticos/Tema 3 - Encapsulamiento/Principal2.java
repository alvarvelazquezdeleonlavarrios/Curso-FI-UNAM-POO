// Creación de la clase llamada Principal2.java
public class Principal2 {

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
	}
}

/* -------- Ejercicio #2 ----------
	Una vez que hayas realizado las actividades del primer ejercicio, ahora realiza lo
	siguiente:

	1.- El código principal de esta clase es el mismo que el del ejercicio anterior, por lo que ya sabes
	que si intentas compilarlo así como viene te dará errores debido al alcance de los atributos en Jugador.java
	Entonces, ¿cómo poder consultar los atributos de la clase Jugador, cuando estos son de alcance
	privado?
	Escribe el código necesario en la clase Jugador.java y haz las correcciones correspondientes
	en este código principal


	2.- Luego de que hayas logrado realizar la actvidad anterior, ahora haz la suposición de que en el
	programa se requiere modificar el valor de los atributos del jugador, pero sin cambiar el alcance de
	las mismas (es decir, sin comprometer su seguridad).
	Por lo tanto, ¿cómo modificamos las variables que tiene el jugador si modificar el alcance
	actual de las mismas?
	Escribe el código necesario en la clase Jugador.java y agrega las líneas correspondientes
	en este código principal.

*/