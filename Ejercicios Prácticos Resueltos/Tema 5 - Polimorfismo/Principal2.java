public class Principal2 {

	public static void main(String[] args) {

		Enemigo mi_enemigo = new Enemigo();

		/* -------- Ejercicio #2.1.1 ----------
		Descomenta estas tres líneas de código, compila y ejecuta. Responde: ¿dará error o no? ¿por qué?
		*/

		Enemigo enemigo_aux = (Enemigo) mi_enemigo;
		enemigo_aux.dialogar();
		System.out.println("--------------------------------\n");
		/* Funciona porque la referencia de tipo Enemigo está apuntando a un objeto de tipo Enemigo.
		En este caso, no era necesario colocar el casting de forma explícita porque tanto la
		referencia como el objeto son del mismo tipo de dato. */



		/* -------- Ejercicio #2.1.2 ----------
		Vuelve a comentar las tres líneas de código anteriores

		Ahora descomenta estas tres líneas de código, compila y ejecuta. Responde: ¿dará error o no? ¿por qué?
		*/

		//Goomba goomba_aux = (Goomba) mi_enemigo;
		//goomba_aux.dialogar();
		//	System.out.println("--------------------------------\n");
		/* No funciona porque, en tiempo de ejecución, lo que contiene la referencia "mi_enemigo"
		es un objeto de tipo Enemigo, mas no un Goomba. Si se intenta realizar la conversión
		entre tipos de datos, un Enemigo NO es un tipo específico de la clase Goomba. */



		/* -------- Ejercicio #2.1.2 ----------
		Vuelve a comentar las tres líneas de código anteriores

		Ahora descomenta estas tres líneas de código, compila y ejecuta. Responde: ¿dará error o no? ¿por qué?
		*/

		//Koopa koopa_aux = (Koopa) mi_enemigo;
		//koopa_aux.dialogar();
		//	System.out.println("--------------------------------\n");
		/* No funciona porque, en tiempo de ejecución, lo que contiene la referencia "mi_enemigo"
		es un objeto de tipo Enemigo, mas no un Koopa. Si se intenta realizar la conversión
		entre tipos de datos, un Enemigo NO es un tipo específico de la clase Koopa. */



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
		if (enemigo instanceof Goomba){
			Goomba mi_goomba = (Goomba) enemigo;
			mi_goomba.dialogar();
		}
		else if (enemigo instanceof Koopa){
			Koopa mi_koopa = (Koopa) enemigo;
			mi_koopa.dialogar();
		}
		else {
			enemigo.dialogar();
		}

	}

}
