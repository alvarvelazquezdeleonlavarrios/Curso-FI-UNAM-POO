// Creación de la clase llamada Arma.java
class Arma{

	// Variable entera
	int balas = 32;

	// Declaración de la función principal del programa
	public static void main(String[] args){

		/* -------- Ejercicio #3.1 ----------
		Compila y ejecuta este programa. Contesta la pregunta que viene abajo.
		*/

		// Crea dos referencias de tipo arma y un objeto también de tipo Arma
		Arma arma_1 = new Arma();
		Arma arma_2 = arma_1;

		System.out.println("\n------- Antes de modificar la variable entera --------");
		System.out.println("Balas de arma_1: " + arma_1.balas);
		System.out.println("Balas de arma_2: " + arma_2.balas);

		arma_2.balas = 25;

		System.out.println("\n------- Después de modificar la variable entera --------");
		System.out.println("Balas de arma_1: " + arma_1.balas);
		System.out.println("Balas de arma_2: " + arma_2.balas);

		/*Pregunta #1.- Luego de modificar la cantidad de balas desde arma_2, verás que tanto
		para arma_1 como para arma_2 se imprime el mismo valor. ¿Por qué sucede esto? 
		¿Se supone que se crearon dos objetos del mismo tipo, o qué está ocurriendo?
		Explica a detalle debajo de este comentario
		*/



		/* -------- Ejercicio #3.2 ----------
		Crea una nueva función void llamada "disparar()" y prográmala de tal manera que el arma_1
		"dispare" una ráfaga de 7 balas y que muestre la cantidad de balas que aún le quedan
		(operación de resta).

		Descomenta la línea de código de abajo para ejecutar dicha acción de disparar el arma_1
		y corroborar tu resultado
		*/

		//arma_1.disparar();
	}


}