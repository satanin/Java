import java.awt.EventQueue;


public class Actividad12 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Modificamos el main de la clase fileopener para que se abra a partir de aquí la ventana.
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fileopener frame = new fileopener();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
					}
			}
		});
	}
}


