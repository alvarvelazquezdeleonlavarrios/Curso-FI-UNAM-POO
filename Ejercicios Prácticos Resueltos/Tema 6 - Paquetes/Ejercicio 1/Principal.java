package mivideojuego;

// Ejercicio 1.2.2 --> Importa las clases de este paquete en concreto (Jugador.class)
import mivideojuego.entidades.*;

// Ejercicio 1.2.3 --> Importa las clases de este paquete en concreto (Enemigo, Goomba y Koopa.class)
import mivideojuego.entidades.hostiles.*;

// Ejercicio 1.2.4 --> Importa las clases de este paquete en concreto (ArmaLargoAlcance y ArmaCortoAlcance.class)
import mivideojuego.armas.*;


public class Principal {

	public static void main(String[] args){
		
		/* --------- Ejercicio 1.2.1 -----------
			Así como viene este código, compila esta clase de tal manera que, al igual que
			con las otras clases, genere el ejecutable en su respectivo paquete.

			Escribe debajo de este comentario el comando que utilizaste para generar el
			ejecutable y el paquete.
		*/

		/** >>javac -cp . -d . Principal.java **/


		/* --------- Ejercicio 1.2.2 -----------
			Luego de que hayas comprobado que se haya generado el ejecutable dentro del paquete
			haz lo siguiente:

			Crea un nuevo objeto de tipo Jugador con las siguientes características:
			- Nombre: Super Mario
			Imprime todos sus atributos

			Importante: ¡¡ Ten en cuenta que, para que funcione esta actividad, debes importar 
			la clase correspondiente desde el paquete en donde se encuentra !!
		*/

		Jugador mi_jugador = new Jugador("Super Mario");
		mi_jugador.imprimirPropiedades();


		/* --------- Ejercicio 1.2.3 -----------
			Crea dos nuevos enemigos: uno de tipo Goomba y otro de tipo Koopa. A continuación, cada
			uno debe tener las siguientes características:

			Goomba:
			- Nombre: Goomba Ultra
			- Ejecute la acción de moverse
			- Ejecute la acción de correr
			- Muestre sus atributos en pantalla

			Koopa:
			- Nombre: Koopa Poderoso
			- Ejecute la acción de saltar
			- Muestre sus atributos en pantalla

			Importante: ¡¡ Ten en cuenta que, para que funcione esta actividad, debes importar 
			las clases correspondientes desde el paquete en donde se encuentran !!
		*/

		Goomba mi_goomba = new Goomba("Goomba Ultra");
		mi_goomba.moverse();
		mi_goomba.correr();
		mi_goomba.imprimirAtributos();

		Koopa mi_koopa = new Koopa("Koopa Poderoso");
		mi_koopa.saltar();
		mi_koopa.imprimirAtributos();


		/* --------- Ejercicio 1.2.4 -----------
			Finalmente, crea dos nuevas armas: una de largo alcance (ArmaLargoAlcance.java)
			y otra de corto alcance (ArmaCortoAlcance.java). Cada una de estas con las 
			siguientes características:

			Arma de largo alcance:
			- Nombre: Rifle de Francotirador
			- Balas actuales: 8
			- Balas en el inventario: 12
			- Imprimir sus atributos en pantalla


			Arma de corto alcance:
			- Nombre: Hacha de Hierro
			- Durabilidad: 25
			- Puntos de ataque: 4
			- Imprimir sus atributos en pantalla

			Importante #1: ¡¡ Ten en cuenta que, para que funcione esta actividad, debes importar 
			las clases correspondientes desde el paquete en donde se encuentran !!

			Importante #2: En esta ocasión, para mostrar los atributos de cada arma en pantalla,
			deberás de programar la función correspondiente en cada una de las clases.
		*/

		ArmaLargoAlcance mi_arma_largo_alcance = new ArmaLargoAlcance("Rifle de Francotirador", 8, 12);
		mi_arma_largo_alcance.imprimirAtributos();

		ArmaCortoAlcance mi_arma_corto_alcance = new ArmaCortoAlcance("Hacha de Hierro", 25, 4);
		mi_arma_corto_alcance.imprimirAtributos();


		/* Respuesta: antes de ejecutar este código principal, primero se tuvieron que volver a
		compilar las clases ArmaLargoAlcance y ArmaCortoAlcance.java

		Luego, se volvió a compilar la clase de este código principal con el comando del ejercicio
		1.2.1

		Finalmente, para ejecutar este código principal se utiliza el comando:
		>> java -cp . mivideojuego.Principal

		(Dicho archivo, "Principal.class", se encuentra dentro de la carpeta (paquete) "mivideojuego")
		*/

	}

}