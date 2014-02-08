/* Vamos a reproducir el escenario de GreenFoot llamado “wombat”. Teniendo como bibliografía el libro Como programar en JAVA 
 * (capítulo 3) y La biblia de JAVA (capítulo 4) 
 * Abriremos GreenFoot con el escenario wombat ¿Cual es la estructura de clases del escenario?
 * Abriremos Eclipse:Crearemos un nuevo proyecto llamado Wombat
 * Crearemos una nueva clase que contenga el método “main” y que se llame WombatWorld
 * Crearemos otra clase que no contenga el método main pero sí que haremos click sobre “constructors from superclass” y
 * que se llame Wombat 
 * Siguiendo con la analogía con GreenFoot:
 * En el escenario de GreenFoot ¿cómo poniamos un nuevo wombat en el escenario?
 * Ahora vamos a realizar lo mismo en nuestro proyecto de Eclipse. A partir de la documentación Como programar en JAVA 
 * (pág. 78 y 79) Debemos crear un nuevo Wombat en WombatWorld (new Wombat()) 
 */

//Creamos la clase WombatWorld con el método main que se ejecutará de forma automática.

public class WombatWorld {

	public static void main(String[] args) {
		
		
		int hojasComidas=0;
		
		// Aquí crearemos un nuevo objeto de la clase Wombat.
		Wombat w = new Wombat();
		
		// Asignamos a nuestra variable hojasComidas, el valor leavesEaten de nuestro nuevo objeto de la clase Wombat.
		hojasComidas=w.leavesEaten;
		
		// Estructura de control. si hojasComidas es menor o igual a 0, Imprimimos en pantalla "No ha comido nada".
		if (hojasComidas<=0){
			System.out.println("No ha comido nada");
			// Si ha comido más de 0, Imprimimos el número total de hojas comidas.
		} else if(hojasComidas>0){
			System.out.println("Ha comido \""+hojasComidas+"\" hojas");
		}
			
		
		
		// Con el objeto creado, podemos ir usando métodos de la clase Wombat, usaremos "leavesEaten" y "nombre"
		 System.out.println("Nuestro Wombat se ha comido de momento: "+w.leavesEaten+" hojas.");
		 System.out.println("Nuestro Wombat se llama: "+w.nWombat+".");
		 
	}

}
