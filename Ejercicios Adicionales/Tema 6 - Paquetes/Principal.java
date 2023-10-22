public class Principal {
	
	public static void main(String[] args) {

		/* ---------- Ejercicio #1 ------------
			Nuevamente, supongamos que regresamos (más o menos...) al escenario de la
			tienda de abarrotes o supermercado del Tema 1.

			Ahora nos comentan que en el sistema informático de la tienda se realizaron algunas
			modificaciones y que ahora cada producto de la tienda se encuentra clasificado en
			tres tipos:
				- Alimento.java				--> Todo aquello que se puede comer
				- Electronico.java		--> Dispositivos como laptops, celulares, etc.
				- Ropa.java						--> Toda vestimenta para las personas

			Adicionalmente, no explican que dichas clases deben tener un nivel estricto de
			organización, de tal manera que cada código ejecutable se encuentre empaquetado
			(en carpetas) de la siguiente manera:

			---> tienda
				--> sistema
					* Principal.java

				---> productos
					* Producto.java

					---> alimentos
						* Alimento.java

					---> electronicos
						* Electronico.java

					---> ropa
						* Ropa.java

			Teniendo en cuenta la estructura previamente señalada:

			1.- ¿Qué es lo que debes hacer para que cada código se genere en su respectivo paquete? 
			Realiza las modificaciones pertinentes en cada uno de los códigos de las clases.

			¡NOTA IMPORTANTE!: Notarás que las clases hijas Alimento, Electronico y Ropa hacen 
			referencia a su clase padre Producto, pero esta última se encuentra en un paquete aparte. 
			Por lo tanto:

			2.-¿Qué es lo que también debes declarar en las clases hijas para que puedan utilizar
			los contructores de la clas padre?

			3.- Una vez que hayas agregado el código correspondiente a cada clase, compila cada
			una de ellas de tal manera que se generen los paquetes (y obviamente... el paquete
			principal). También compila esta clase principal con el comando ncesario.
		*/



		/* ---------- Ejercicio #2 ------------
			Una vez que hayas logrado generar el paquete correspondiente, ahora se nos pide que
			realicemos lo siguiente.

			* Generar un nuevo objeto de tipo Alimento con las siguientes propiedades:
				- Nombre: "Manzana"
				- Precio: 25
				- Fecha de expiración: "25 de diciembre de 2023"  <--(texto)

			* Generar un nuevo objeto de tipo Ropa con las siguientes propiedades:
				- Nombre: "Gorro de Santa Claus"
				- Precio: 110
				- Parte del cuerpo: "Cabeza"  <--(texto)


			Antes de que vayas a crear referencias de cada uno de los tipos de producto en 
			este código principal, analiza:

			1.- ¿Estará bien declararlos así como viene el código de esta clase, o será que debas
			"agregar" algo más al inicio de este código para poder utilizar a las otras clases?
			Ten en cuenta que los ejecutables de las clases se encuentran en su respectivo paquete

			2.- Vuelve a compilar esta clase Principal para cersiorarte de que no haya errores y,
			ahora sí, ejecútala con el comando correspondiente.

			Escribe las líneas de código debajo de este comentario para generar los productos
			solicitados.

			¡OJO!: Utiliza los constructores que ya vienen definidos en cada clase para
			inicializar a los nuevos objetos que generes.
		*/




		/* ---------- Ejercicio #3 ------------
			Finalmente, si lograste generar los productos de tipo alimento y ropa solicitados en
			el ejercicio anterior. Ahora:

			1.- Para ambos productos, consulta la información que poseen. Para ello, existe una
			función declarada que se llama "consultarInformacion()".

			Escribe las líneas de código necesarias debajo de este comentario. Vuelve a compilar
			y a ejecutar esta clase.
		*/




	}

}