/* Vamos a reproducir el escenario de GreenFoot llamado �wombat�. Teniendo como bibliograf�a el libro Como programar en JAVA 
 * (cap�tulo 3) y La biblia de JAVA (cap�tulo 4) 
 * Abriremos GreenFoot con el escenario wombat �Cual es la estructura de clases del escenario?
 * Abriremos Eclipse:Crearemos un nuevo proyecto llamado Wombat
 * Crearemos una nueva clase que contenga el m�todo �main� y que se llame WombatWorld
 * Crearemos otra clase que no contenga el m�todo main pero s� que haremos click sobre �constructors from superclass� y
 * que se llame Wombat 
 * Siguiendo con la analog�a con GreenFoot:
 * En el escenario de GreenFoot �c�mo poniamos un nuevo wombat en el escenario?
 * Ahora vamos a realizar lo mismo en nuestro proyecto de Eclipse. A partir de la documentaci�n Como programar en JAVA 
 * (p�g. 78 y 79) Debemos crear un nuevo Wombat en WombatWorld (new Wombat()) 
 */

//Creamos la clase WombatWorld con el m�todo main que se ejecutar� de forma autom�tica.

public class WombatWorld {

	public static void main(String[] args) {
		
		
		int hojasComidas=0;
		
		// Aqu� crearemos un nuevo objeto de la clase Wombat.
		Wombat w = new Wombat();
		
		// Asignamos a nuestra variable hojasComidas, el valor leavesEaten de nuestro nuevo objeto de la clase Wombat.
		hojasComidas=w.leavesEaten;
		
		// Estructura de control. si hojasComidas es menor o igual a 0, Imprimimos en pantalla "No ha comido nada".
		if (hojasComidas<=0){
			System.out.println("No ha comido nada");
			// Si ha comido m�s de 0, Imprimimos el n�mero total de hojas comidas.
		} else if(hojasComidas>0){
			System.out.println("Ha comido \""+hojasComidas+"\" hojas");
		}
			
		
		
		// Con el objeto creado, podemos ir usando m�todos de la clase Wombat, usaremos "leavesEaten" y "nombre"
		 System.out.println("Nuestro Wombat se ha comido de momento: "+w.leavesEaten+" hojas.");
		 System.out.println("Nuestro Wombat se llama: "+w.nWombat+".");
		 
	}

}
