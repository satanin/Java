import java.util.Arrays;


public class ManejandoObjetos {
	// Declaración de Variables
	private String objetos[];
	private int numObjetos=10;
	
	// Constructor 1
	public ManejandoObjetos() {
		objetos = new String[numObjetos];
		Arrays.fill(objetos, null);
	}
	// Constructor 2
	public ManejandoObjetos(int i){
		objetos = new String[i];
	}
	// Método para resetear el contenido del arreglo
	public void rellenarObjetos(){
		Arrays.fill(objetos, null);
	}
	// Método para rellenar el arreglo con una string que le pasamos por parámetros
	public void rellenarObjetos(String relleno){
		Arrays.fill(objetos, relleno);
	}
	// Método para colocar una cadena en una posición concreta del arreglo.
	public void colocarObjeto(int i, String s){
		objetos[i] = s;
	}
	// Método para imprimir el Arreglo por consola
	public void imprimirObjetos(){
		for(int i=0;i<objetos.length;i++){
			System.out.println("Esto es lo que hay en la posición "+i+" de nuestro arreglo: "+objetos[i]);
		}
	}
	// Método que devuelve el arreglo para poder imprimirlo en la ventana de la aplicación.
	public String[] devolverObjetos(){
		return objetos;		
	}
}
