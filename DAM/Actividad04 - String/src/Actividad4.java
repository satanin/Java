/* ACTIVIDAD 4
 * Crearemos una variable de tipo String con valor “Programacion” y que se llame nombre.
 * Crearemos una variable del tipo char que se llame Inicial
 * Crearemos otra variable de tipo entero y que ese llame longitud.
 * Crearemos una variable de tipo String con valor “” que se llame modificacion
 * A partir de esas variables:
 * Imprimiremos la cadena
 * Almacenaremos la longitud de la variable nombre en la variable longitud.
 * Imprimiremos longitud
 * Almacenaremos la inicial en la variable inicial
 * Imprimiremos la varable inicia.
 * Convertiremos a mayúsculas la variable nombre y la almacenaremos en modificacion.
 * Imprimiremos modificacion
 */

public class Actividad4 {
	
	public static void main(String[] args) {
		
		// Creamos la variable nombre con el valor "Programacion".
		String nombre = "Programacion";

		// Creamos la variable Inicial de tipo char
		char Inicial;
		
		// Creamos la variable longitud de tipo int.
		int longitud;
		
		// Creamos la variable modificación con valor ""
		String modificacion = "";
		
		// Imprimimos la cadena almacenada en la variable nombre.
		System.out.println("La variable nombre tiene almacenada la cadena "+nombre+".");
		
		// Almacenamos la longitud de la variable nombre en la variable longitud
		longitud=nombre.length();
		
		// Imprimimos la longitud de la variable
		System.out.println("La cadena ("+nombre+") tiene una longitud de "+longitud);
		
		// Almacenamos la inicial en la variable inicial
		Inicial = nombre.charAt(0);
		
		// Imprimimos la variable Inicial
		System.out.println("La letra inicial de la cadena es "+Inicial+".");
		
		// Convertimos a mayúsculas la variable nombre y la almacenamos en la variable modificacion
		System.out.println("Convirtiendo a mayúsculas la cadena almacenada en \"nombre\" y almacenándola en la variable modificacion.");
		modificacion = nombre.toUpperCase();
		
		// Ahora imprimimos en pantalla la variable modificacion
		System.out.println("La variable modificación ahora guarda la cadena "+modificacion+".");
		
		
		
	}

}
