package encapsulamiento.paquete02;
import encapsulamiento.paquete01.ClasePadre;

public class ClaseHijaDiferentePaquete extends ClasePadre{

	// Función principal de esta clase
  public static void main(String arg[]){
  	ClaseHijaDiferentePaquete referencia = new ClaseHijaDiferentePaquete();

  	/* ------------- Ejercicio #2.4.1 -------------
		De los 4 métodos con diferente modificador de alcance, creados desde la ClasePadre.java,
    escribe debajo de estos comentarios las líneas de código para llamar a las funciones
    que creas que se puedan acceder desde esta clase.
  	*/

    referencia.metodoPublico();
    referencia.metodoProtegido();
    //referencia.metodoSinModificador();
    //referencia.metodoPrivado();


  	/* ------------- Ejercicio #2.4.2 -------------
    Escribe debajo de estos comentarios el comando que utilizaste para compilar el código
    de esta clase
    */


    /** Desde la carpeta "src": 
    >> javac -cp ..\bin -d ..\bin ClaseHijaDiferentePaquete.java **/


    /* ------------- Ejercicio #2.4.3 -------------
    Escribe debajo de estos comentarios el comando que utilizaste para ejecutar la función
    principal de esta clase
    */


    /** Desde la carpeta "src": 
    >> java -cp ..\bin encapsulamiento.paquete02.ClaseHijaDiferentePaquete **/

  }
}