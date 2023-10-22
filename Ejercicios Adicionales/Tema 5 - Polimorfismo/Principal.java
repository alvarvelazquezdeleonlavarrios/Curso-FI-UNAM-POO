public class Principal {
	
	// Función principal del programa a ejecutar
	public static void main(String[] args) {

		/* ---------- Ejercicio #1 ------------
			Para estas actividades, vamos a suponer que ahora nos encontramos diseñando sistema
			digital de órdenes para un restaurante. En dicho restaurante, catalogan cada uno de sus
			platillos en cuatro tipos: platillo de entrada, plato fuerte, postre y bebida.

			Teniendo eso encuenta, en un primer escenario llega desde una de las mesas del
			restaurante una orden en donde se indica que los clientes pidieron 7 platillos:
			2 platos de entrada, 2 platos fuertes, 1 postre, 1 bebida y 1 platillo genérico.

			Cada uno de los platillos recibidos desde la orden cuentan con las siguientes
			características:

			- Plato de entrada #1 --> Sopa de fideos ($50)
			- Plato de entrada #2 --> Crema de elote ($55)
			- Plato fuerte #1 --> Flautas de pollo ($145)
			- Plato fuerte #2 --> Hamburguesa de pescado ($122)
			- Bebida --> Jarra con agua de melón ($48)
			- Postre --> Pastel de chocolate (rebanada) ($78)
			- Platillo Genérico --> Lechuga ($20)

			Realiza lo siguiente:
			1.- Mediante el arreglo de platillos declarado debajo de este comentario, genera cada
			uno de los tipos de platillos solicitados desde la orden y almacénalos en dicho arreglo.
			Recomiendo para esta actividad que hagas uso de una sentencia "for" y dentro de este una
			sentencia "switch-case" para poder generar cada tipo de platillo solicitado.

			Escribe las líneas de código correspondientes a esta actividad debajo de este comentario.
			Compila para corroborar que no haya errores de programación.

			¡OJO!: Para esta actividad todavía no se debe imprimir la información de cada platillo
			en pantalla.
		*/

		// Arreglo de referencias que apuntan a objetos de tipo Platillo y "derivados".
		Platillo[] orden_platillos = new Platillo[7];



		/* ---------- Ejercicio #2 ----------
			Una vez que hayas podido generar cada uno de los distintos tipos de platillos solicitados,
			ahora analiza el siguiente escenario:

			Notarás que en la clase Platillo.java hay declarada una función llamada
			"imprimirInformacion()" que muestra en pantalla el nombre, el precio y el tipo de platillo.
			Sin embargo, dicha información está codificada de tal forma que siempre imprima que
			el platillo es de tipo GENÉRICO.

			Por lo tanto:

			1.- ¿Qué es lo que debes hacer para que cada tipo de platillo imprima en pantalla, 
			precisamente, el tipo de platillo que es? ¡MUCHO OJO! Esta actividad debes realizarla
			de tal manera que siempre se llame a la función "imprimirInformacion()" de Platillo.java

			2.- Ahora sí, imprime en pantalla la información correspondiente a cada platillo 
			de la orden. Nuevamente, apoyate en el uso de una sentencia "for" para 
			acceder a cada referencia del arreglo.
		*/




		/* ---------- Ejercicio #3 ----------
			Finalmente, también podrás apreciar que en esta misma clase Principal.java, hasta abajo
			se encuentra una función estática llamada "llamarFuncionesEspeciales()" y recibe como
			parámetro un arreglo de objetos de tipo Platillo.

			Por otro lado, notarás que existe una función propia para cada uno de los	tipos de platillo.

			Realiza lo siguiente:
			1.- Agrega el código correspondiente en la función "llamarFuncionesEspeciales()" de este
			código, de tal manera que, dependiendo el tipo de platillo que se esté analizando, llame
			a su función propia. En ese caso, ¿qué es lo que debes hacer?
		*/

		llamarFuncionesPropias(orden_platillos);
	}


	public static void llamarFuncionesPropias(Platillo[] arreglo_platillos) {

	}
}