public class Principal1 {
	
	public static void main(String[] args) {

		Enemigo mi_enemigo = new Goomba();
		System.out.println("El nombre del enemigo actual es: " + mi_enemigo.nombre);

		/* -------- Ejercicio #1.1 ----------
		Debajo de este comentario, agrega las líneas de código necesarias para que ahora,
		la referencia "mi_enemigo" apunte a un nuevo objeto (instancia) de tipo Koopa 
		e imprima su nombre en pantalla
		*/

		mi_enemigo = new Koopa();
		System.out.println("El nombre del enemigo actual es: " + mi_enemigo.nombre);
		


		/* -------- Ejercicio #1.2 ----------
		Descomenta la siguiente línea de código y vuelve a compilar esta clase.
		Cuando intentes volver a compilar verás que te dará un error. Responde:
		- ¿por qué sucede esto?
		*/

		// Goomba goomba = new Koopa();
		/* Da error porque, si bien, tanto Goomba como Koopa son enemigos particulares,
		un objeto de clase Koopa no es un tipo específico de la clase Goomba. */



		/* -------- Ejercicio #1.3 ----------
		Vuelve a comentar la línea de código anterior.

		Descomenta la siguiente línea de código y vuelve a compilar esta clase.
		Nuevamente, cuando intentes volver a compilar verás que te dará un error. Responde:
		- ¿por qué sucede esto?
		*/

		// Goomba mi_goomba = new Enemigo();
		/* Da error porque no se está indicando que el objeto generado es uno de
		tipo Goomba. Dicho de otra forma: un Enemigo NO es un tipo específico de Goomba*/



		/* -------- Ejercicio #1.4 ----------
		Vuelve a comentar la línea de código anterior.

		Ahora descomenta la siguiente línea de código y vuelve a compilar esta clase.
		Responde:
		- ¿Compilará este programa?
		- En caso de que compile, ejecutalo y ¿será correcto o dará error durante ejecución?
		  Explica el por qué.
		*/

		// Goomba mi_goomba = (Goomba) new Enemigo();
		/* Da error porque en tiempo de ejecución se está generando un objeto de tipo Enemigo
		(enemigo "genérico"), mas no un objeto de tipo Goomba. */


		/* -------- Ejercicio #1.5 ----------
		Vuelve a comentar la línea de código anterior.

		Ahora descomenta la siguiente línea de código y vuelve a compilar esta clase.
		Responde:
		- ¿Compilará este programa?
		- En caso de que compile, ejecutalo y ¿será correcto o dará error durante ejecución?
		  Explica el por qué.
		*/

		Koopa mi_koopa = (Koopa) mi_enemigo;
		System.out.println("El nombre del enemigo actual es: " + mi_koopa.nombre);
		/* Funciona porque previamente, durante la ejecución, la referencia mi_enemigo
		ya estaba conteniendo (apuntando) a un objeto de tipo Koopa. */

	}
}
