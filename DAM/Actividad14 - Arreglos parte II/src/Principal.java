import java.awt.EventQueue;


public class Principal {

	public static void main(String[] args) {
		// Aquí intentamos crear la ventana de la aplicación
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


