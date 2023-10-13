// "Creación del programa a ejecutar"
class Programa2{

	// Declaración de la función principal del programa
	public static void main(String[] args) {

		// Funciones propias de Java que imprimen en pantalla 
		// el valor que retorna cada función
		System.out.println("\n---------------------------------------");
		System.out.println("Retorno de bool: " + retornarBooleano() );
		System.out.println("Retorno de char: " + retornarCaracter() );
		System.out.println("Retorno de int: " + retornarNumeroEntero() );
		System.out.println("Retorno de float: " + retornarNumeroReal() );
		System.out.println("Retorno de String: " + retornarTexto() );
		System.out.println("---------------------------------------\n");
	}

	// Declaración de funciones
	/* ¡Dato Importante!: "Las funciones declaradas debajo de este comentario tienen la palabra clave 
	static, la cual permite que sean funciones propias de la CLASE (el tiempo de vida de las funciones 
	es igual al tiempo de ejecución del programa), evitando crear OBJETOS".

	¿¡CLASE!? ¿¡OBJETO!? --> Se verá en el siguiente tema
	*/

	static boolean retornarBooleano(){
		return false;
	}

	static char retornarCaracter(){
		return 'A';
	}

	static int retornarNumeroEntero(){
		return 22;
	}

	static float retornarNumeroReal(){
		return 8.5f;
	}

	static String retornarTexto(){
		return "Hola Mundo";
	}

	/* -------- Ejercicio ----------
	Modifica el valor de retorno de cada una de las funciones de retorno
	declaradas previamente para que ahora impriman en pantalla la siguiente
	información de acuerdo al tipo de dato que retorne cada función:
		- retornarBooleano --> Tu estado escolar (regular = true, irregular = false)
		- retornarCaracter --> Primera letra de tu apellido paterno
		- retornarNumeroEntero --> La cantidad de materias que has cursado hasta el momento en la carrera
		- retornarNumeroReal --> Tu promedio escolar actual
		- retornarTexto --> Tu nombre completo [Nombre(s)    Ap. Paterno    Ap. Materno]
	*/

}