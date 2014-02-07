
public class mundo {

	public static void main(String[] args) {
		
		// Creamos un nuevo objeto de la clase Infectado
		Infectado paquito = new Infectado();
		
		// Creamos un nuevo objeto de la clase Jugador
		Jugador raul = new Jugador();
		
		
		// Imprimimos en pantalla el valor de la vida del objeto paquito de la clase Infectado.
		System.out.println("A nuestro infectado le queda "+paquito.cuantaVidaQueda()+ " de vida.");
		
		// Le quitamos 2 de vida al objeto paquito de la clase infectado a través del método quitarVida heredado de la clase Personaje
		paquito.quitarVida(2);
		
		// Imprimimos el valor de la vida del objeto paquito después de haber utilizado el método quitarVida. 
		System.out.println("El infectado tiene :"+paquito.cuantaVidaQueda()+" vida");
		
		// Añadimos un arma al objeto raul de la clase Jugador mediante el método anyadirArma. 
		raul.anyadirArma(1);
		
		// Imprimimos por pantalla el valor de armas a través del método cuantasArmasTiene. 
		System.out.println("El jugador tiene :"+raul.cuantasArmasTiene()+" armas");
	}

}
