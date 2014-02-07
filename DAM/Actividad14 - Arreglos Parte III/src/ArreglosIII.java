import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;


public class ArreglosIII {

	public static void main(String[] args) {
		
		boolean fin=false;
			while (fin==false){
				// Voy a usar un Scanner para hacerlo un poco interactivo.
				Scanner respuesta = new Scanner(System.in);
				System.out.println("Bienvenido al generador de mapas, introduce la opci�n deseada:");
				System.out.println("1: Crear un nuevo mapa autom�ticamente.");
				System.out.println("2: Crear un nuevo mapa introduciendo los par�metros.");
				System.out.print("Respuesta:");
				int x = respuesta.nextInt();
				
				if(x==1){
					System.out.println("Has seleccionado la opci�n 1");
					// creo un mapa sin par�metros, los saca directamente de la clase
					Mapa miMapa = new Mapa();
					
					// relleno el mapa con 1's donde toca
					miMapa.rellenarMapa();
					// Imprimo el mapa por consola
					miMapa.imprimeMapa();	
					fin =true;
				}else if(x==2){
					System.out.println("Has seleccionado la opci�n 2");
					System.out.println("Introduce el tama�o del mapa, para que quede \"bien\"); ");
					System.out.println("se recomiendan tama�os del tipo m�ltipo de 4+1, por ejemplo:5,9,13,17,21,25... ");
					System.out.println("Introduce el tama�o deseado: ");
					System.out.print("Primero el n�mero de filas:");
					int filas = respuesta.nextInt();
					System.out.println("El mapa tendr� :" +filas+ " filas");
					System.out.print("Ahora el n�mero de columnas:");
					int columnas = respuesta.nextInt();
					System.out.println("El mapa tendr� :" +columnas+ " columnas");
					
					// creo un mapa pas�ndole par�metros
					Mapa miMapa2 = new Mapa(filas,columnas);
					
					// relleno el mapa con 1's donde toca
					miMapa2.rellenarMapa();
					// Imprimo el mapa por consola
					miMapa2.imprimeMapa();
					System.out.println("Quieres guardar el mapa en un fichero?\n 1: Si\n 2: No \n :");
					x = respuesta.nextInt();
					if(x==1){
						
					}
					fin = true;
					
				}else 
					System.out.println("Esa opci�n no es correcta, try again!");
			}
	}
}
