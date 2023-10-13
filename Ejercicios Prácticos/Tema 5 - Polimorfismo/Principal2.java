public class Principal2 {

	public static void main(String[] args) {

		Enemigo mi_enemigo = new Enemigo();

		/* -------- Ejercicio #2.1.1 ----------
		Descomenta estas tres líneas de código, compila y ejecuta. Responde: ¿dará error o no? ¿por qué?
		*/

		//Enemigo enemigo_aux = (Enemigo) mi_enemigo;
		//enemigo_aux.dialogar();
		//System.out.println("--------------------------------\n");



		/* -------- Ejercicio #2.1.2 ----------
		Vuelve a comentar las tres líneas de código anteriores

		Ahora descomenta estas tres líneas de código, compila y ejecuta. Responde: ¿dará error o no? ¿por qué?
		*/

		//Goomba goomba_aux = (Goomba) mi_enemigo;
		//goomba_aux.dialogar();
		//System.out.println("--------------------------------\n");



		/* -------- Ejercicio #2.1.2 ----------
		Vuelve a comentar las tres líneas de código anteriores

		Ahora descomenta estas tres líneas de código, compila y ejecuta. Responde: ¿dará error o no? ¿por qué?
		*/

		//Koopa koopa_aux = (Koopa) mi_enemigo;
		//koopa_aux.dialogar();
		//System.out.println("--------------------------------\n");



		/* -------- Ejercicio #2.2 ----------
		En los ejercicios anteriores vemos que, en tiempo de ejecución, programar el casting explícito
		nos genera errores en ciertos casos.

		Por otro lado, notarás que en el siguiente bloque de código se está llamando a la función
		"funcionInstanceOf" recibiendo como parámetro cada tipo de enemigo que existe 
		(Goomba, Koopa y "genérico").

		Este ejercicio consiste en que tú programes la función "funcionInstanceOf" que se encuentra hasta el
		final de este programa para que, dependiendo el tipo de enemigo que se ingresó como parámetro, 
		haga uso de la función "dialogar" como se intentó en los ejercicios anteriores.
		*/

		Enemigo nuevo_enemigo = new Enemigo();
		Goomba nuevo_goomba = new Goomba();
		Koopa nuevo_koopa = new Koopa();

		funcionInstanceOf(nuevo_enemigo);		// La función recibe a un enemigo genérico
		funcionInstanceOf(nuevo_goomba);		// La función recibe a un Goomba (un tipo de enemigo)
		funcionInstanceOf(nuevo_koopa);			// La función recibe a un Koopa (otro tipo de enemigo)
	}


	static void funcionInstanceOf(Enemigo enemigo){

		/*Aquí va el código para el Ejercicio #2.2*/

	}

}