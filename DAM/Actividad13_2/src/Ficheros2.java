import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException; 
import java.util.Scanner;
import java.io.*;


public class Ficheros2 extends JPanel {
	private JTextField campoNumero;
	private JTextArea campoTexto;
	private Formatter salida;
	

	/**
	 * Create the panel.
	 */
	public Ficheros2() {
		setLayout(null);
		
		JLabel lblNumero = new JLabel("Numero");
		lblNumero.setBounds(10, 26, 46, 14);
		add(lblNumero);
		
		campoNumero = new JTextField();
		campoNumero.setBounds(66, 23, 219, 20);
		add(campoNumero);
		campoNumero.setColumns(10);
		
		campoTexto = new JTextArea();
		campoTexto.setBounds(66, 65, 219, 60);
		add(campoTexto);
		
		JLabel lblTexto = new JLabel("Texto");
		lblTexto.setBounds(10, 70, 46, 14);
		add(lblTexto);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					salida = new Formatter("prueba.txt");
		
				}
				catch(SecurityException securityException){
					
					System.err.println("no tiene permisos para escribir aqui");
					System.exit('1');
				}
				catch (FileNotFoundException fileNotFoundException){
					
					System.err.println("No se encuentra el archivo");
					System.exit('1');
				}
			
				salida.format("%s\n%s", campoNumero.getText(), campoTexto.getText());
			}
		});
		btnNewButton.setBounds(214, 136, 71, 23);
		add(btnNewButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 188, 275, 39);
		add(textArea);
		
		JLabel lblNewLabel = new JLabel("Mensaje Error");
		lblNewLabel.setBounds(10, 171, 78, 14);
		add(lblNewLabel);
		


	}
}
