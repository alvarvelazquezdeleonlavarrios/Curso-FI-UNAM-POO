public class Principal2 {

	public static void main(String[] args){

		// Crea un nuevo objeto de tipo Goomba
		Goomba goomba = new Goomba();
		System.out.println("n--------- Propiedades del Goomba ---------");
		System.out.println("Nombre: " + goomba.nombre);
		System.out.println("Vida: " + goomba.vida);

		// Crea un nuevo objeto de tipo Koopa
		Koopa koopa = new Koopa();
		System.out.println("n--------- Propiedades del Koopa ---------");
		System.out.println("Nombre: " + koopa.nombre);
		System.out.println("Vida: " + koopa.vida);


		/* -------- Ejercicio #2.1 ----------
		Como puedes observar en el bloque de código anterior, se crean dos objetos nuevos: un Goomba y
		un Koopa. Cada uno de estos posee una misma propiedad (atributo) pero con diferente valor.

		Para este ejercicio, realiza lo siguente: modifica la propiedad de vida para cada objeto de
		acuerdo a lo siguiente:
			- Goomba ---> 13.5 puntos de vida
			- Koopa ---> 27.4 puntos de vida

		Escribe el código necesario debajo de este comentario para modificar dichos valores e 
		imprimirlos en pantalla. Compila y ejecuta.
		*/

		goomba.vida = 13.5f;
		koopa.vida = 27.4f;

		System.out.println("\n--------------------------------");
		System.out.println("Nueva vida de Goomba: " + goomba.vida);
		System.out.println("Nueva vida de Koopa: " + koopa.vida);
		System.out.println("--------------------------------\n");


		/* -------- Ejercicio #2.2 ----------
		Descomenta las siguientes líneas de código. Vuelve a compilar y ejecutar. Analiza y contesta:
		- ¿Por qué tanto Goomba como Koopa pueden realizar la acción "Mover", si dicha función
		no la tienen declarada dentro de sus respectivas clases?
		*/

		System.out.println("\n------- Acciones de Goomba --------");
		goomba.mover();
		goomba.correr();

		System.out.println("\n------- Acciones de Koopa --------");
		koopa.mover();
		koopa.rodar();



		/* -------- Ejercicio #2.3 ----------
		Descomenta las siguientes líneas de código y vuelve a compilar.

		Cuando intentes compilar, notarás que te saldrán errores en la pantalla. 
		Responde: 
			- ¿Por qué sucede esto?
			- ¿hay herencia desde la clase padre (Enemigo.java), o qué está ocurriendo?
		*/

		goomba.rodar();
		koopa.correr();

	}

}
