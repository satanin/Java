import java.util.Arrays;


public class ManejandoObjetos {
	// Declaraci�n de Variables
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
	// M�todo para resetear el contenido del arreglo
	public void rellenarObjetos(){
		Arrays.fill(objetos, null);
	}
	// M�todo para rellenar el arreglo con una string que le pasamos por par�metros
	public void rellenarObjetos(String relleno){
		Arrays.fill(objetos, relleno);
	}
	// M�todo para colocar una cadena en una posici�n concreta del arreglo.
	public void colocarObjeto(int i, String s){
		objetos[i] = s;
	}
	// M�todo para imprimir el Arreglo por consola
	public void imprimirObjetos(){
		for(int i=0;i<objetos.length;i++){
			System.out.println("Esto es lo que hay en la posici�n "+i+" de nuestro arreglo: "+objetos[i]);
		}
	}
	// M�todo que devuelve el arreglo para poder imprimirlo en la ventana de la aplicaci�n.
	public String[] devolverObjetos(){
		return objetos;		
	}
}
