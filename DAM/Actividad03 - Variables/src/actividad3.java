/* PARTE 1
 * En un programa en Java queremos almacenar la siguiente información de la forma más óptima, cada vez que creemos una variable, 
 * pondremos un comentario y después imprimiremos por pantalla usando System.out.println(). OJO, definiremos todas las variables 
 * a utilizar inicializándolas a un valor, y después les asignaremos el valor solicitado:
 * La letra ‘P’
 * El número 31.200
 * El número pi
 * El valor falso
 * Un contador de 0 a 20 personas.
 * 
 * PARTE 2
 * En el mismo programa que anteriormente hemos creado los ejemplos de tipos de datos. Realizaremos las siguientes conversiones 
 * (PRIMERO CREAREMOS UNAS VARIABLES DE ESE TIPO Y DESPUÉS LAS CONVERTIREMOS):
 * Una conversión de short a integer
 * Una conversion de byte a integer
 * 
 * PARTE 3
 * ¿Cómo se define una constante en Java? La palabra clave para hacerlo es final. En el mismo código ejemplo anterior se creará 
 * una constante de cualquier tipo.
*/

public class actividad3 {
	
	public static void main(String[] args) {
		
		// PARTE 1
		
		// Inicializamos las variables con diferente valor al especificado, les asignaremos el valor después y las mostraremos en pantalla.
		
		// Variable char (utilizamos char puesto que sólo necesitamos un caracter)
		
		char letra = 'a';
		
		// Variable short (utilizamos short puesto que el número 31200 está dentro de su rango)
		
		short unNumero = 0;
		
		// Varliable float (para el número pi utilizamos float, pero si se necesitara mucha precisión podríamos utilizar double)
		
		float numeroPi = 0.00f;
		
		// Variable boolean (para almacenar valores de Verdadero/Falso utilizamos el tipo boolean)
		
		boolean valor = false;
		
		// Variable byte utilizamos este tipo porque es óptima para guardar este rango de valores.
		
		byte contador = 0;
		
		// Vamos a asignar los valores adecuados a cada variable.
		
		// Ahora cambiamos el valor de la variable y la imprimimos por pantalla
		
		// Imprimimos el valor actual de la variable letra
		System.out.println("La variable \"letra\" tiene el valor \""+letra+"\". Es una variable de tipo \"char\".");
		
		// Cambiamos el valor de la variable char 'letra' que valía 'a' y le asignamos valor 'P'.
		System.out.println("Cambiando el valor de la variable \"letra\".");
		letra = 'P';
		
		// Imprimimos el nuevo valor de la variable letra
		System.out.println("Ahora la variable \"letra\" tiene el valor "+letra+".");
		
		
		System.out.println("-----------------------------------------");
		
		// Ahora cambiamos el valor de la variable unNúmero y la imprimiremos por pantalla
		
		// Imprimimos el valor actual de la variable unNumero
		
		System.out.println("El valor actual de la variable \"unNumero\" es \""+unNumero+"\". Es una variable de tipo \"short\"");
		
		// Asignamos a la variable unNumero el nuevo valor
		System.out.println("Cambiando el valor de la variable \"unNumero\".");
		unNumero = 31200;
		
		//Imprimimos por pantalla el nuevo valor de la variable unNumero
		System.out.println("Ahora la variable \"unNumero\" tiene el valor \""+unNumero+"\".");
		
		System.out.println("-----------------------------------------");
		
		// Ahora cambiamos el valor de la variable numeroPi y la imprimiremos por pantalla
		
		// Imprimimos el valor actual de la variable numeroPi
		
		System.out.println("El valor actual de la variable \"numeroPi\" es \""+numeroPi+"\". Es una variable de tipo \"float\"");
		
		// Asignamos a la variable numeroPi el nuevo valor
		System.out.println("Cambiando el valor de la variable \"numeroPi\".");
		numeroPi = 3.14159265359f;
		
		// Imprimimos por pantalla el nuevo valor de la variable numeroPi
		System.out.println("Ahora la variable \"numeroPi\" tiene el valor \""+numeroPi+"\".");
		
		System.out.println("-----------------------------------------");
		
		// Ahora cambiamos el valor de la variable valor y la imprimiremos por pantalla
		
		// Imprimimos el valor actual de la variable valor
		
		System.out.println("El valor actual de la variable \"valor\" es \""+valor+"\". Es una variable de tipo \"float\"");
		
		// Asignamos a la variable valor el nuevo valor
		System.out.println("Cambiando el valor de la variable \"valor\".");
		valor = false;
		
		// Imprimimos por pantalla el nuevo valor de la variable valor
		System.out.println("Ahora la variable \"valor\" tiene el valor \""+valor+"\".");
		
		System.out.println("-----------------------------------------");
		
		// Ahora cambiamos el valor de la variable contador y la imprimiremos por pantalla
		
		// Imprimimos el valor inicial de la variable contador
		
		System.out.println("El valor inicial de la variable \"contador\" es \""+contador+"\". Es una variable de tipo \"byte\"");
		
		// Asignamos a la variable contador el nuevo valor
		System.out.println("Incrementando el valor de la variable \"contador\" con un bucle for.");
				
		for (contador = 0; contador<20; contador++){
					
			System.out.println("El valor actual de la variable \"contador\" es \""+contador+"\".");
		}
		
		System.out.println("El valor actual de la variable \"contador\" es \""+contador+"\".");
				
		// Imprimimos por pantalla el nuevo contador de la variable contador
		System.out.println("Ahora la variable \"contador\" tiene el valor \""+contador+"\".");
	
		System.out.println("-----------------------------------------");
		
		
		// PARTE 2
		/* creamos variables y las inicializamos, hay dos formas de hacer la conversión la forma automática y mediante el
		 * casteo de la variable. Como tanto short como byte se pueden convertir de forma automática a int, voy a hacer también
		 * la conversión mediante casteo. 
		 */
		
		
		// Variable short unShort
		short unShort = 31200;
		
		// Variable byte unByte
		byte unByte = 127;
		
		// Mostramos en pantalla el valor de la variable unShort que es de tipo short
		
		System.out.println("El valor de la variable \"unShort\" es \""+unShort+"\". Variable de tipo \"short\".");
		
		/* Al ser short e int formatos compatibles y ser int de mayor rango que short, java puede convertir de forma
		 * automática la variable.
		 */
		int newInt1 = unShort;
		// Imprimimos por pantalla la nueva variable almacenada de tipo  int.
		System.out.println("El valor de la variable \"newInt1\" es \""+newInt1+"\". Variable de tipo \"int\" convertida de forma automática por el compilador.");
		
		// convertimos la variable unShort en int mediante el casteo de la variable.
		int newInt2 = (int) unShort;
		
		// Imprimimos por pantalla la nueva variable almacenada de tipo  int.
		System.out.println("El valor de la variable \"newInt2\" es \""+newInt2+"\". Variable de tipo \"int\" convertida desde una variable short mediante casteo.");
		
		System.out.println("-----------------------------------------");
		
		// Mostramos en pantalla el valor de la variable unByte que es de tipo byte
		System.out.println("El valor de la variable \"unByte\" es \""+unByte+"\". Variable de tipo \"byte\".");
		
		/* Al ser byte e int formatos compatibles y ser int de mayor rango que byte, java puede convertir de forma
		 * automática la variable.
		 */
		int newInt3 = unByte;
		
		// Imprimimos por pantalla la nueva variable almacenada de tipo int.
		System.out.println("El valor de la variable \"newInt3\" es \""+newInt3+"\". Variable de tipo \"int\" convertida de forma automática por el compilador.");
		
		// convertimos la variable unByte en int mediante el casteo de la variable.
		int newInt4 = (int) unByte;
		
		// Imprimimos por pantalla la nueva variable almacenada de tipo int.
		System.out.println("El valor de la variable \"newInt4\" es \""+newInt4+"\". Variable de tipo \"int\" convertida desde una variable byte mediante casteo.");
		
		System.out.println("-----------------------------------------");
		
		// PARTE 3
		// crear una constante en Java con final
		
		// Utilizamos la palabra reservada final delante de la creación de la variable para convertirla en una constante.
		final float pi = 3.141592F;
		
		// Mostramos el valor de la variable por pantalla.
		System.out.println("El valor de la variable \"pi\" es \""+pi+"\" y no puede ser modificado ya que se ha definido como constante usando \"final float = 3.141592\" .");
		// constante = 1; 
		
		/* Si descomentamos la linea anterior, el código dará un error y no se podrá ejecutar debido a que una variable 
		 * precedida de la palabra final no se le pueden asignar nuevos valores.
		 */

		
		
		
				
	}

}

