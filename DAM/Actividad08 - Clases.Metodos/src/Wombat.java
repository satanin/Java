
//Creamos la clase Wombat.
public class Wombat {

	// declaramos dos variables poniendo la palabra reservada "private" y no serán accesibles directamente desde fuera de la clase.
	private int leavesEaten;
	private String nombre;

	
	
	// Constructor de la clase Wombat
	public Wombat(String n) {
		// Asignar el valor 0 a la variable "leavesEaten" y un nombre a nuestro Wombat usando la variable nWombat.
		leavesEaten = 0;
		nombre = n;
	}
	
	// Método para establecer el número de hojas comidas
	public void setLeavesEaten(int leaves){
		leavesEaten = leaves;
	}
	
	// Método para establecer el nombre.
	public void setNombreWombat(String n){
		nombre = n;
	}
	
	// Método para saber el valor de leavesEaten
	public int getLeavesEaten(){
		
		return leavesEaten;
		
	}
	
	// Método para saber el valor de nombre.
	public String getNombreWombat(){
		
		return nombre;
		
	}

}
