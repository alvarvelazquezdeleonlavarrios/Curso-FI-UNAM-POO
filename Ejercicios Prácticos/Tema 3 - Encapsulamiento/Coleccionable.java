// Creación de la clase llamada Coleccionable.java 
public class Coleccionable {
	
	/*** Atributos ***/
	public String nombre = "Fruta Wumpa";
	float velocidad_giro = 1.5f;
	private int valor = 1;


	/*** Constructores ***/
	public Coleccionable() {}

	public Coleccionable(String nombre) {
		this.nombre = nombre;
	}


	/*** Métodos ***/
	// Permite al objeto coleccionable girar sobre su propio eje
	private void girar() {
		System.out.println("Este objeto está rotando sobre su propio eje.");
	}

}