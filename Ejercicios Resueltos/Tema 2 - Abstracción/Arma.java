// Identificador de clase --> Arma
class Arma {
	
	/*Atributos de la clase Arma*/
	String nombre;
	int balas_actuales, balas_inventario;

	/*Constructor predeterminado de la clase Arma*/
	Arma(){}

	/*Métodos de la clase Arma*/
	
	void disparar(int balas_a_restar){
		balas_actuales -= balas_a_restar;
	}

	void recargar(int balas_a_restar){
		balas_inventario -= balas_a_restar;
		balas_actuales += balas_a_restar;
	}

}
