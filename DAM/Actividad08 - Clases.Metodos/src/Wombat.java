
//Creamos la clase Wombat.
public class Wombat {

	// declaramos dos variables poniendo la palabra reservada "private" y no ser�n accesibles directamente desde fuera de la clase.
	private int leavesEaten;
	private String nombre;

	
	
	// Constructor de la clase Wombat
	public Wombat(String n) {
		// Asignar el valor 0 a la variable "leavesEaten" y un nombre a nuestro Wombat usando la variable nWombat.
		leavesEaten = 0;
		nombre = n;
	}
	
	// M�todo para establecer el n�mero de hojas comidas
	public void setLeavesEaten(int leaves){
		leavesEaten = leaves;
	}
	
	// M�todo para establecer el nombre.
	public void setNombreWombat(String n){
		nombre = n;
	}
	
	// M�todo para saber el valor de leavesEaten
	public int getLeavesEaten(){
		
		return leavesEaten;
		
	}
	
	// M�todo para saber el valor de nombre.
	public String getNombreWombat(){
		
		return nombre;
		
	}

}
