public class Principal {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ManejandoPalabras m=new ManejandoPalabras();
        
        //Muestro el contenido de los dos atributos
        System.out.println(m.palabra);
        System.out.println(m.longitudPalabra);
        
        //Modifico los valores
        m.palabra="Modifico el valor";
        m.longitudPalabra=10;
        
        //Muestro el contenido de los dos atributos despues de la modificación
        System.out.println(m.palabra);
        System.out.println(m.longitudPalabra);
        
    }

}