// Clase Infectado, hereda de la clase Personaje sus m�todos.
public class Infectado extends Personaje {
	
	// Declaramos dos variables privadas boolean 
	private boolean tienePiernas=true;
	private boolean tieneBrazos=true;

	// constructor de la clase
	public Infectado() {
		// TODO Auto-generated constructor stub
		
	}

	// M�todo para saber el valor de la variable tienePiernas de un objeto de la clase Infectado.
	public boolean siTienePiernas(){
		return tienePiernas;
	}

	// M�todo para saber el valor de la variable tieneBrazos de un objeto de la clase Infectado.
	public boolean siTieneBrazos(){
		return tieneBrazos;
	}
}
