import java.awt.EventQueue;


public class Principal {

	public static void main(String[] args) {
		// Aqu� intentamos crear la ventana de la aplicaci�n
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interfazArreglos frame = new interfazArreglos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}


