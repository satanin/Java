
public class Personaje {

	private int vida = 5; //N�mero de 0 a 10 
	public Personaje() {
		// TODO Auto-generated constructor stub
	}
	
	// M�todo para saber el valor de la variable vida de un objeto de la clase Personaje.
	public int cuantaVidaQueda(){
		return vida;
	}
	
	// M�todo para restar valor a la variable vida de un objeto de la clase Personaje.
	public void quitarVida(int cuantaVida){
		vida = vida - cuantaVida;
	}
}
