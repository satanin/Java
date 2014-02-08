// Clase Jugador que hereda los m�todos de la clase Personaje mediante la palabra especial extends + nombre de la clase a heredar.
public class Jugador extends Personaje {

	// declaraci�n de la variable armas.
	private int armas;
	
	// constructor
	public Jugador() {
	
	}

	// M�todo para a�adir valor a la variable armas de la clase Jugador.
	public void anyadirArma(int n){
		
		armas = armas + n;
		
	}
	
	// M�todo para conocer el valor actual de la variable armas de la clase Jugador.
	public int cuantasArmasTiene(){
		return armas;
	}
}
