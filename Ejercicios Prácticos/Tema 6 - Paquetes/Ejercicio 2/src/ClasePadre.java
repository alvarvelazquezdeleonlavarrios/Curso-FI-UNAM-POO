package encapsulamiento.paquete01;

public class ClasePadre {

   /*** Métodos ***/

   public void metodoPublico(){
      System.out.println("Función pública");
   }

   protected void metodoProtegido(){
      System.out.println("Función protegida");
   }

   void metodoSinModificador(){
      System.out.println("Función sin modificador");
   }

   private void metodoPrivado(){
      System.out.println("Función privada");
   }


   // Función principal de esta clase
   public static void main(String arg[]){
      ClasePadre referencia = new ClasePadre();

      /* ------------- Ejercicio #2.1.1 -------------
      De los 4 métodos con diferente modificador de alcance, creados desde la ClasePadre.java,
      escribe debajo de estos comentarios las líneas de código para llamar a las funciones
      que creas que se puedan acceder desde esta clase.
      */



      /* ------------- Ejercicio #2.1.2 -------------
      Escribe debajo de estos comentarios el comando que utilizaste para compilar el código
      de esta clase
      */



      /* ------------- Ejercicio #2.1.3 -------------
      Escribe debajo de estos comentarios el comando que utilizaste para ejecutar la función
      principal de esta clase
      */
   }
}