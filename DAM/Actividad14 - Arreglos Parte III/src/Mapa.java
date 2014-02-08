import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Formatter;


public class Mapa {
int mapa[][];
int i=17;
int j=17;
int e,h;
Formatter salida;
	
	// constructor que crea un arreglo directamente con el tamaño que venia en la especificación
	public Mapa(){
		mapa = new int[i][j];	
	}
	// constructor al que se le pueden pasar parámetros para crear el arreglo.
	public Mapa(int e, int h) {
		mapa = new int[e][h];		
		
	}
	// Relleno el arreglo con 0's
	public void resetearMapa(){
		Arrays.fill(mapa, 0);
	}
	
	public void rellenarMapa(){
		System.out.println("Mapa.length: "+mapa[e].length);
		// Aquí relleno el mapa que tengo con las "reglas" que se han pasado en la especificación de la práctica
		for(int x=0;x<mapa.length;x++){
			for(int y=0;y<mapa[e].length;y++){
				if ((x==0)||(x==(mapa.length-1)||(x%4==0)||(y==0)||(y%4==0)||(y==(mapa[e].length-1)))){
					mapa[x][y]=1;
					
					
				}
			}
		}
		
	}
	// Método para sacar el arreglo por consola.
	public void imprimeMapa(){
		System.out.print("Vamos a imprimir el mapa: ");
		System.out.println("tiene "+mapa.length+" filas y "+mapa[e].length+" columnas" );
		// Bucle que recorre las filas del arreglo.
		for(int x=0;x<mapa.length;x++){
			// Chorrada que hago para que no se descuadre al sacarlo por consola
			String y;
			if(x<10){
				y="0"+x;
			}else {
				y=Integer.toString(x);
			}
			System.out.print("Fila "+y+":");
			// Bucle que recorre cada columna
			for(int z=0;z<mapa[x].length;z++){
				System.out.print("["+mapa[x][z]+"]");
			}
			System.out.println("");
		}		
	}
	public void guardaMapa(){
		try{
			salida = new Formatter("mapa.txt");
			
			// Imprimimos el mensaje de éxito
			System.out.println("El archivo se ha creado con éxito");
			
			}// fin de try
			// Hacemos el primer catch, con la excepción de seguridad.
			catch (SecurityException securityException){
				// imprimimos el mensaje de error por consola
				System.err.println("No tiene acceso de escritura a este archivo");
				System.exit(1);
			}//fin de catch
			// Segundo catch con la excepción de archivo no encontrado.
			catch (FileNotFoundException fileNotFoundException){
				// Imprimimos mensaje de error por consola
				System.err.println("Error al crear el archivo.");
				System.exit(1);
			}//fin de catch
			catch(Exception e){
				// para cualquier otra excepción enviamos un mensaje de texto al campoTextoError
				// informando del problema.
				System.err.println("Ha habido un error");
			}
			for(int x=0;x<mapa.length;x++){
				for(int y=0;y<mapa.length;y++){
					
				}
			}
			salida.format("%s");
			salida.close();
	}
}
