
public class Actividad7 {

	public static void main(String[] args) {
		// Iniciamos la variable contador de tipo byte con valor 0
		byte contador = 0;
		
		// Imprimimos por pantalla el valor actual de contador, que es 0.
		System.out.println("Inicio del programa \"contador\" ahora es: "+contador);
		
		// Iniciamos un while para aumentar el valor de contador a 28, ponemos < para que no entre cuando ya valga 28.
		while (contador<=28){

			// Imprimimos por pantalla el valor de contador mientras la vamos incrementando.
			System.out.println("Incrementando \"contador\" con el primer while: "+contador);
			
			// Incrementamos el valor de contador.
			contador++;
		}
		// Imprimimos por pantalla el valor de contador para comprobar que realmente vale lo que queremos después del while.
		System.out.println("Terminado el while, el valor de contador ahora es: "+contador);
		
		// Decrementamos el valor de la variable contador hasta 15. 
		for (contador=28;contador>15;contador--){
		
			// Imprimimos el valor de la variable contador para ver como va decreciendo dentro del "for".
			System.out.println("Decrementando \"contador\" con el bucle for: "+contador);
			}
		// Imprimimos por pantalla el valor de contador para comprobar que realmente vale lo que queremos después del for.
		System.out.println("Terminado el bucle for el valor de \"contador\" ahora es :"+contador);
		
		// Con el do...while incrementamos la variable contador de 2 en 2 hasta que valga 127.
		do {
			// Incrementamos el valor de contador de 2 en dos.
			contador += 2;
			
			/* contador = (byte)(contador+2); -> Esta es la forma que estaba usando y he tenido que castear byte porque sino daba error.
			* la dejo aquí reflejada pero utilizando la otra forma "contador += 2;" y no me ha hecho falta castear,creo que es más correcta.
			*
			* Como tenía dudas por no haber casteado finalmente byte, he utilizado esta asignación para comprobar que contador todavía era 
			* byte después de la suma y que no se había cambiado de tipo forma automática. Lo dejo aquí reflejado como curiosidad. Lo que he 
			* hecho es quitar el comentario y ver que java me daba un error al intentar asignar el valor 500 a una variable tipo byte. */
			// contador = 500;
			 			
			// Imprimimos el valor de contador mientras va incrementando para ver que lo hace correctamente.
			System.out.println("Incrementando \"contador\" con do...while: "+contador);
			
		}while (contador<127); // Condición para salir del "do".
		
		// Imprimimos el valor final de la variable contador.
		System.out.println("Finalizado el programa \"contador\" ahora vale: "+contador);
	}

}
