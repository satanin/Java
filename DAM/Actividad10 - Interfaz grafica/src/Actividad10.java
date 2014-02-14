/* A partir del ejercicio de la página 465, que podemos probar, lo que nosotros vamos a realizar es un programa mucho más sencillo:
 * solicitaremos los nombres del Jugador 1, y el nombre del Jugador 2 los almacenaremos en dos variables diferentes mostraremos por 
 * pantalla Jugador 1: XXXXXXX , Jugador 2: XXXXXXXXX 
 */

// Importamos JOptionPane
import javax.swing.JOptionPane;

public class Actividad10 {
	
	public static void main(String[] args) {
		
		// Asignamos a la variable jugador1 el valor generado a partir del método ShowImputDialog del objeto JOptionPane
		String jugador1 = JOptionPane.showInputDialog("Introduce el nombre del jugador 1");
		// Asignamos a la variable jugador2 el valor generado a partir del método ShowImputDialog del objeto JOptionPane
		String jugador2 = JOptionPane.showInputDialog("Introduce el nombre del jugador 2");
		
		// Mostramos en pantalla con otro método del objeto JOptionPane el valor de las variables jugador 1 y jugador 2.
		JOptionPane.showMessageDialog(null,"El nombre del jugador 1 es: "+jugador1+" y el nombre del jugador 2 es: "+jugador2);
		
		
	}

}
