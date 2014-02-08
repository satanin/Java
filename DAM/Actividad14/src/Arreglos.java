
public class Arreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creamos nuestro arreglo de tamaño 10 y de tipo int.
		int numero[]=new int[10];
		
		// para rellenar el arreglo usamos un bucle for. 
		for(int i=0;i<10;i++){
			
			// Aqui asignamos a cada elemento del arreglo un valor random usando el método random del objeto Math
			// como esa función calcula un doble entre 0 y 1, multiplicamos el resultado por 10 que es el número
			// más alto que queremos conseguir. Como el número mínimo que queremos conseguir es un 1, le sumamos
			// 1 para evitar que salga el 0. 			
			numero[i] = 1 + (int)(Math.random()*(10));
			
			// Imprimimos el valor por pantalla.
			System.out.println("Se ha almacenado en la posicion "+i+", el número "+numero[i]);
			

		}
		
	}

}
