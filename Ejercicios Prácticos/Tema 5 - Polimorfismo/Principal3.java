public class Principal3 {

	public static void main(String[] args) {

		/* -------- Ejercicio #3.1 (Sobrecarga de métodos) ----------

		Notarás que en la clase Enemigo.java, además de la función "dialogar" (sin parámetros), existen otras
		tres funciones con el mismo nombre pero con diferentes argumentos o parámetros.

		En la clase Enemigo, escribe el código necesario para que se imprima en pantalla el valor de el o los
		argumentos de la función (procura que sea fácil de identificar a qué parámetro se hace referencia
		durante la impresión).

		Compila de nuevo la clase Enemigo.java. Por otra parte, compila y ejecuta este código Principal3-java
		para cerciorar tu trabajo.
		*/

		Enemigo mi_enemigo = new Enemigo();

		System.out.println("\n-----Sobrecarga del método dialogar()------");
		mi_enemigo.dialogar();
		mi_enemigo.dialogar(15);
		mi_enemigo.dialogar("Bowser");
		mi_enemigo.dialogar(6, "King Boo");
		System.out.println("-------------------------------------------\n");




		/* -------- Ejercicio #3.2.1 (Sobreescritura de métodos) ----------
		En la clase Koopa.java notarás que hay una función comentada llamada "saltar". Descoméntala.

		Ahora, vuelve a compilar la clase Koopa.java y contesta:
		- ¿compila o dará error?
		- Si da error, ¿por qué sucede eso?
		*/



		/* -------- Ejercicio #3.2.2 (Sobreescritura de métodos) ----------
		Una vez realizado el ejercicio anterior, ahora te pedire que hagas lo siguiente:
		  - En Enemigo.java, declara una nueva función llamada "saltar" --> void saltar() {}
		  (No es necesario que escribas código en dicha función)
		  - Vuelve a compila Enemigo.java
		  - Vuelve a compilar Koopa.java

		Luego de que hayas hecho los puntos anteriores, notarás que en ambos casos compila correctamente.
		Descomenta las siguientes tres líneas de código. Vuelve a compilar y ejecutar este código.

		Responde:
		- ¿qué se imprime en pantalla?
		- ¿se está sobreescribiendo la función heredada de Enemigo.java?
		*/

		//Enemigo otro_enemigo = new Koopa();
		//otro_enemigo.saltar();
		//System.out.println("-------------------------------------------\n");


		/* -------- Ejercicio #3.2.3 (Sobreescritura de métodos) ----------
		Notarás que en las clases Enemigo.java y Goomba.java hay una función llamada "mover" --> void mover()

		También notarás que la función en Goomba.java procura sobreescribir la función heredada de Enemigo.java.
		Sin embargo, cuando descomentes las siguientes dos líneas de código notarás que imprime tanto
		el texto de Goomba como en texto de Enemigo.

		Preguntas... un poco capciosas:
		  - ¿hay sobreescritura del método?
		  - En este caso, ¿qué está realizando la palabra "super" declarada desde la función en Goomba.java?
		*/

		//Goomba otro_goomba = new Goomba();
		//otro_goomba.mover();

	}

}