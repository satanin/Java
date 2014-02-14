
public class mundo {

	public static void main(String[] args) {
		
		// Creamos un nuevo objeto de la clase Infectado
		Infectado paquito = new Infectado();
		
		// Creamos un nuevo objeto de la clase Jugador
		Jugador raul = new Jugador();
		
		
		// Imprimimos en pantalla el valor de la vida del objeto paquito de la clase Infectado.
		System.out.println("A nuestro infectado le queda "+paquito.cuantaVidaQueda()+ " de vida.");
		
		// Le quitamos 2 de vida al objeto paquito de la clase infectado a trav�s del m�todo quitarVida heredado de la clase Personaje
		paquito.quitarVida(2);
		
		// Imprimimos el valor de la vida del objeto paquito despu�s de haber utilizado el m�todo quitarVida. 
		System.out.println("El infectado tiene :"+paquito.cuantaVidaQueda()+" vida");
		
		// A�adimos un arma al objeto raul de la clase Jugador mediante el m�todo anyadirArma. 
		raul.anyadirArma(1);
		
		// Imprimimos por pantalla el valor de armas a trav�s del m�todo cuantasArmasTiene. 
		System.out.println("El jugador tiene :"+raul.cuantasArmasTiene()+" armas");
	}

}
