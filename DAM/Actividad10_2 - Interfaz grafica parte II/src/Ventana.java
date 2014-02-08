import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.FlowLayout;

public class Ventana extends JFrame {

	public Ventana() {
		// TODO Auto-generated constructor stub
		JLabel etiqueta1 = new JLabel();
		JLabel etiqueta2 = new JLabel();
		
		setLayout(new FlowLayout());
		
		etiqueta1.setText("Primera Etiqueta");
		etiqueta2.setText("Segunda Etiqueta");
		
		add(etiqueta1);
		add(etiqueta2);
		
		
		
	}

}
