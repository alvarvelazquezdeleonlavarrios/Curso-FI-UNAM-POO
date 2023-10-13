public class Principal1 {
	
	public static void main(String[] args) {

		Enemigo mi_enemigo = new Goomba();
		System.out.println("El nombre del enemigo actual es: " + mi_enemigo.nombre);

		/* -------- Ejercicio #1.1 ----------
		Debajo de este comentario, agrega las líneas de código necesarias para que ahora,
		la referencia "mi_enemigo" apunte a un nuevo objeto (instancia) de tipo Koopa 
		e imprima su nombre en pantalla
		*/




		/* -------- Ejercicio #1.2 ----------
		Descomenta la siguiente línea de código y vuelve a compilar esta clase.
		Cuando intentes volver a compilar verás que te dará un error. Responde:
		- ¿por qué sucede esto?
		*/

		// Goomba goomba = new Koopa();



		/* -------- Ejercicio #1.3 ----------
		Vuelve a comentar la línea de código anterior.

		Descomenta la siguiente línea de código y vuelve a compilar esta clase.
		Nuevamente, cuando intentes volver a compilar verás que te dará un error. Responde:
		- ¿por qué sucede esto?
		*/

		//Goomba mi_goomba = new Enemigo();



		/* -------- Ejercicio #1.4 ----------
		Vuelve a comentar la línea de código anterior.

		Ahora descomenta la siguiente línea de código y vuelve a compilar esta clase.
		Responde:
		- ¿Compilará este programa?
		- En caso de que compile, ejecutalo y ¿será correcto o dará error durante ejecución?
		  Explica el por qué.
		*/

		//Goomba mi_goomba = (Goomba) new Enemigo();


		/* -------- Ejercicio #1.5 ----------
		Vuelve a comentar la línea de código anterior.

		Ahora descomenta la siguiente línea de código y vuelve a compilar esta clase.
		Responde:
		- ¿Compilará este programa?
		- En caso de que compile, ejecutalo y ¿será correcto o dará error durante ejecución?
		  Explica el por qué.
		*/

		//Koopa mi_koopa = (Koopa) mi_enemigo;

	}
}