/*
 * ACT1: M�todos para obtener variables
 * Continuando con la estructura que ten�amos en el PROC05 donde ten�amos:
 * Clase con el nombre Wombat
 * atributo, public int leavesEaten;
 * atributo, public int nombre;
 * Clase con el nombre WombatWorld
 * Teniendo como bibliograf�a el libro Como programar en JAVA (cap�tulo 3):
 * Convertiremos los atributos leavesEaten y nombre en privados:
 * atributo, private int leavesEaten;
 * atributo, private int nombre;
 * En el constructor de Wombat (public void Wombat()), inicializaremos las variables:
 * leavesEaten=0;
 * nombre =�Lo que querais�
 * �Desde la clase principal (WombatWorld), podemos ahora imprimir leavesEaten y nombre?
 * Crearemos dos nuevos m�todos en la clase Wombat para obtener los valores de los dos atributos ( Como programar en JAVA , p�gina 84):
 * public int obtenerLeavesEaten(), este m�todo devolver� leavesEaten a trav�s de return.
 * public String obtenerNombre(), este m�todo devolver� nombre a trav�s de return.
 * En la clase WombatWorld:
 * Crearemos una variable de tipo integer variableInt y otra de tipo String variableStr
 * Crearemos una nueva instancia de Wombat
 * Almacenaremos en variableInt lo que devuelva obtenerLeavesEaten
 * Almacenaremos en variableStrlo que devuelva obtenerNombre
 * Imprimiremos ambas variables
 *
 *ACT2: M�todos para establecer variables
 *Siguiendo la misma bibliograf�a que en el apartado anterior
 *Crearemos dos nuevos m�todos en la clase Wombat para establecer los valores de los dos atributos ( Como programar en JAVA , p�gina 84):
 *public void establecerLeavesEaten(int leaves), este m�todo almacenar� el valor de leaves en leavesEaten.
 *public void establecerNombre(String cadena), este m�todo almacenar� el valor de cadena en nombre.
 *En la clase WombatWorld:
 *Antes de utilizar obtenerXXXXX, utilizaremos los dos m�todos establecerXXXXX
 *
 *ACT3: Modificar constructor
 *Por �ltimo modificaremos el constructor de Wombat, para que reciba una cadena de texto e inicializa la variable nombre.
 * 
 */

//Creamos la clase WombatWorld con el m�todo main que se ejecutar� de forma autom�tica.

public class WombatWorld {

	public static void main(String[] args) {
		
		
		int variableInt=0;
		String variableStr;
		
		// Aqu� crearemos un nuevo objeto de la clase Wombat.
		Wombat w = new Wombat("Antonio");
		
		System.out.println("Hemos creado un nuevo objeto de clase wombat y su atributo nombre es: "+w.getNombreWombat());
		
		// Asignamos a nuestra variable leavesEaten, un nuevo valor a trav�s del m�todo setLeavesEaten.
		w.setLeavesEaten(10);
		
		// Asignamos a nuestro objeto w un nuevo nombre a trav�s del m�todo setNombreWombat.
		w.setNombreWombat("Pepito");
		
		System.out.println("Le hemos cambiado el nombre a nuestro objeto w de clase wombat y ahora se llama :"+w.getNombreWombat());
		
		// Asignamos a variableInt el valor de leavesEaten a trav�s del m�todo getLeavesEaten.
		variableInt = w.getLeavesEaten();

		// Asignamos a variableStr el valor de nombre a trav�s del m�todo getNombreWombat.
		variableStr = w.getNombreWombat();
		
		// Estructura de control. si varableInt es menor o igual a 0, Imprimimos en pantalla "No ha comido nada".
		if (variableInt<=0){
			System.out.println("No ha comido nada");
	    // Si ha comido m�s de 0, Imprimimos el n�mero total de hojas comidas.
		} else if(variableInt>0){
			System.out.println("Ha comido \""+variableInt+"\" hojas");
		}
		
		/* Tanto la estructura de control como la orden System funcionan tambi�n utilizando directamente el m�todo del objeto no son necesarias las 
		 * variables variableInt y variableStr, para poder trabajar con los valores de nombre y leavesEaten, aqu� dejo un ejemplo de la estructura
		 * sin utilizar variableInt.
		 * if (w.getleavesEaten<=0){
		 * System.out.println("No ha comido nada");
		 * } else if(w.getleavesEaten>0){
		 * System.out.println("Ha comido \""+w.getleavesEaten+"\" hojas");
		 * }
		*/
		
		
		// Con el objeto creado, podemos ir usando m�todos de la clase Wombat, usaremos "leavesEaten" y "nombre"
		 System.out.println("Nuestro Wombat se ha comido de momento: "+variableInt+" hojas.");
		 System.out.println("Nuestro Wombat se llama: "+variableStr+".");
		
		/* Aqu� dejo como se har�a lo mismo sin utilizar las variables variableInt y variableStr utilizando directamente el m�todo adecuado.
		 * System.out.println("Nuestro Wombat se ha comido de momento: "+w.getLeavesEaten()+" hojas.");
		 * System.out.println("Nuestro Wombat se llama: "+w.getNombreWombat()+".");
		*/
		 
	}

}
