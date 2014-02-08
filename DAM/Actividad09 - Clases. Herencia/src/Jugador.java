// Clase Jugador que hereda los métodos de la clase Personaje mediante la palabra especial extends + nombre de la clase a heredar.
public class Jugador extends Personaje {

	// declaración de la variable armas.
	private int armas;
	
	// constructor
	public Jugador() {
	
	}

	// Método para añadir valor a la variable armas de la clase Jugador.
	public void anyadirArma(int n){
		
		armas = armas + n;
		
	}
	
	// Método para conocer el valor actual de la variable armas de la clase Jugador.
	public int cuantasArmasTiene(){
		return armas;
	}
}
