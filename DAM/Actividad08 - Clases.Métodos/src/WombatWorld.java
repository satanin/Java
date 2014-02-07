/*
 * ACT1: Métodos para obtener variables
 * Continuando con la estructura que teníamos en el PROC05 donde teníamos:
 * Clase con el nombre Wombat
 * atributo, public int leavesEaten;
 * atributo, public int nombre;
 * Clase con el nombre WombatWorld
 * Teniendo como bibliografía el libro Como programar en JAVA (capítulo 3):
 * Convertiremos los atributos leavesEaten y nombre en privados:
 * atributo, private int leavesEaten;
 * atributo, private int nombre;
 * En el constructor de Wombat (public void Wombat()), inicializaremos las variables:
 * leavesEaten=0;
 * nombre =”Lo que querais”
 * ¿Desde la clase principal (WombatWorld), podemos ahora imprimir leavesEaten y nombre?
 * Crearemos dos nuevos métodos en la clase Wombat para obtener los valores de los dos atributos ( Como programar en JAVA , página 84):
 * public int obtenerLeavesEaten(), este método devolverá leavesEaten a través de return.
 * public String obtenerNombre(), este método devolverá nombre a través de return.
 * En la clase WombatWorld:
 * Crearemos una variable de tipo integer variableInt y otra de tipo String variableStr
 * Crearemos una nueva instancia de Wombat
 * Almacenaremos en variableInt lo que devuelva obtenerLeavesEaten
 * Almacenaremos en variableStrlo que devuelva obtenerNombre
 * Imprimiremos ambas variables
 *
 *ACT2: Métodos para establecer variables
 *Siguiendo la misma bibliografía que en el apartado anterior
 *Crearemos dos nuevos métodos en la clase Wombat para establecer los valores de los dos atributos ( Como programar en JAVA , página 84):
 *public void establecerLeavesEaten(int leaves), este método almacenará el valor de leaves en leavesEaten.
 *public void establecerNombre(String cadena), este método almacenará el valor de cadena en nombre.
 *En la clase WombatWorld:
 *Antes de utilizar obtenerXXXXX, utilizaremos los dos métodos establecerXXXXX
 *
 *ACT3: Modificar constructor
 *Por último modificaremos el constructor de Wombat, para que reciba una cadena de texto e inicializa la variable nombre.
 * 
 */

//Creamos la clase WombatWorld con el método main que se ejecutará de forma automática.

public class WombatWorld {

	public static void main(String[] args) {
		
		
		int variableInt=0;
		String variableStr;
		
		// Aquí crearemos un nuevo objeto de la clase Wombat.
		Wombat w = new Wombat("Antonio");
		
		System.out.println("Hemos creado un nuevo objeto de clase wombat y su atributo nombre es: "+w.getNombreWombat());
		
		// Asignamos a nuestra variable leavesEaten, un nuevo valor a través del método setLeavesEaten.
		w.setLeavesEaten(10);
		
		// Asignamos a nuestro objeto w un nuevo nombre a través del método setNombreWombat.
		w.setNombreWombat("Pepito");
		
		System.out.println("Le hemos cambiado el nombre a nuestro objeto w de clase wombat y ahora se llama :"+w.getNombreWombat());
		
		// Asignamos a variableInt el valor de leavesEaten a través del método getLeavesEaten.
		variableInt = w.getLeavesEaten();

		// Asignamos a variableStr el valor de nombre a través del método getNombreWombat.
		variableStr = w.getNombreWombat();
		
		// Estructura de control. si varableInt es menor o igual a 0, Imprimimos en pantalla "No ha comido nada".
		if (variableInt<=0){
			System.out.println("No ha comido nada");
	    // Si ha comido más de 0, Imprimimos el número total de hojas comidas.
		} else if(variableInt>0){
			System.out.println("Ha comido \""+variableInt+"\" hojas");
		}
		
		/* Tanto la estructura de control como la orden System funcionan también utilizando directamente el método del objeto no son necesarias las 
		 * variables variableInt y variableStr, para poder trabajar con los valores de nombre y leavesEaten, aquí dejo un ejemplo de la estructura
		 * sin utilizar variableInt.
		 * if (w.getleavesEaten<=0){
		 * System.out.println("No ha comido nada");
		 * } else if(w.getleavesEaten>0){
		 * System.out.println("Ha comido \""+w.getleavesEaten+"\" hojas");
		 * }
		*/
		
		
		// Con el objeto creado, podemos ir usando métodos de la clase Wombat, usaremos "leavesEaten" y "nombre"
		 System.out.println("Nuestro Wombat se ha comido de momento: "+variableInt+" hojas.");
		 System.out.println("Nuestro Wombat se llama: "+variableStr+".");
		
		/* Aquí dejo como se haría lo mismo sin utilizar las variables variableInt y variableStr utilizando directamente el método adecuado.
		 * System.out.println("Nuestro Wombat se ha comido de momento: "+w.getLeavesEaten()+" hojas.");
		 * System.out.println("Nuestro Wombat se llama: "+w.getNombreWombat()+".");
		*/
		 
	}

}
