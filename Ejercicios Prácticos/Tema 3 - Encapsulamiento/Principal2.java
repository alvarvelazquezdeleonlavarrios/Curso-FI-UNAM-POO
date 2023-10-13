// Creación de la clase llamada Principal2.java
public class Principal2 {

	public static Jugador jugador;

	// Función principal del programa
	public static void main(String[] args) {

		// Crea un nuevo objeto de tipo Jugador
		jugador = new Jugador();


		/* -------- Ejercicio #2 ----------
		Realiza las actividades que se indican en los siguientes comentarios en orden consecutivo.
		*/

		/* --- Ejercicio 2.1.1 ---
			Primero compila las clases Coleccionable.java y Jugador.java. Luego compila esta 
			clase Principa2.java e inteta ejecutarla. Responde: ¿compila? ¿qué imprime en pantalla?
		*/
		
		System.out.println("\n--------- Ejercicio 2.1 ------------");
		System.out.println("Coleccionable #1 del jugador: " + jugador.item_fruta.nombre);


		/* --- Ejercicio 2.1.2 ---
			Una vez realizado el ejercicio anterior, descomenta la siguiente línea de código. Vuélve a
			compilar esta clase. Responde: ¿cómpila? ¿qué imprime en pantalla? En caso de que de error,
			¿por qué sucede?
		*/
		
		// System.out.println("Coleccionable #2 del jugador: " + jugador.item_moneda.nombre);


		/* --- Ejercicio 2.2 ---
			Una vez realizado el ejercicio anterior, vuelve a comentar esa línea de código y
			ahora descomenta las siguientes líneas de código. Vuélve a compilar esta clase.
			Responde: ¿cómpila? ¿ahora qué imprime en pantalla? ¿qué está sucediendo?
		*/

		System.out.println("\n--------- Ejercicio 2.2 ------------");
		//System.out.println("Coleccionable #1 del jugador: " + jugador.item_fruta.nombre);
		//System.out.println("Coleccionable #2 del jugador: " + jugador.getItemMoneda().nombre);


		/* --- Ejercicio 2.3 ---
			Como habrás notado, en la clase Coleccionable.java, hay un atributo privado llamado "valor".
			
			Te pediré que, dentro de este código principal, imprimas el "valor" de los dos coleccionables
			(fruta y moneda) que posee el jugador, pero sin modificar su alcance privado. Para ello,
			primero debes "crear el método GET para poder leer el contenido de dicho atributo".

			Crea dicha función en la clase Coleccionable.java
		*/

		System.out.println("\n--------- Ejercicio 2.3 ------------");
		/** Escribe aquí el código para el ejercicio #2.3 **/


		/* --- Ejercicio 2.4 ---
			Una vez que hayas logrado leer el contenido de la variable privada desde aquí, ahora deberás
			modificar el "valor" de los dos coleccionables (fruta y moneda) del jugador, cumpliendo con
			lo siguiente:
				- item_fruta = 8
				- item_moneda.valor = 5

			¡Recuerda! NO debes modificar el alcance privado. Por lo tanto, debes crear la función SET
			correspondiente en la clase Coleccionable.java

			Vuelve a imprimir dichos valores para corroborar que se haya modificado el 
			"valor" de cada coleccionable
		*/

		System.out.println("\n--------- Ejercicio 2.4 ------------");
		/** Escribe aquí el código para el ejercicio #2.4 **/

	}

}