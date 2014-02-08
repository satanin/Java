import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
import java.util.Formatter;


public class Interfaz extends JFrame {

	private JPanel contentPane;
	private JTextField campoNumero;
	// creo el buffer Formatter con nombre salida.
	private Formatter salida;
	// defino aqui campoTexto y campoTextoError para poder acceder desde el evento del botónot
	private JTextArea campoTexto;
	private JTextArea campoTextoError;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz frame = new Interfaz();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 240, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIntroduceUnNmero = new JLabel("Introduce un n\u00FAmero");
		lblIntroduceUnNmero.setBounds(10, 11, 128, 14);
		contentPane.add(lblIntroduceUnNmero);
		
		campoNumero = new JTextField();
		campoNumero.setBounds(10, 25, 204, 20);
		contentPane.add(campoNumero);
		campoNumero.setColumns(10);
		
		JLabel lblIntroduceUnTexto = new JLabel("Introduce un texto");
		lblIntroduceUnTexto.setBounds(10, 56, 128, 14);
		contentPane.add(lblIntroduceUnTexto);
		
		// creo el elemento al principio para que se pueda acceder desde el evento del botón.
		
		campoTexto = new JTextArea();
		campoTexto.setBounds(10, 73, 204, 70);
		contentPane.add(campoTexto);
		
		JLabel lblMensajes = new JLabel("Mensajes:");
		lblMensajes.setBounds(10, 183, 128, 14);
		contentPane.add(lblMensajes);
		
		campoTextoError = new JTextArea();
		campoTextoError.setEditable(false);
		campoTextoError.setBounds(10, 197, 204, 48);
		contentPane.add(campoTextoError);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// Intentamos crear el archivo prueba.txt
				try{
				salida = new Formatter("prueba.txt");
				
				// Imprimimos el mensaje de éxito
				campoTextoError.setText("El archivo se ha creado con éxito");
				
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
					campoTextoError.setText("Ha habido un error");
				}
				
				// Ahora vamos a guardar lo que haya en campoNumero y en campoTexto dentro del archivo 
				// con la siguiente instrucción. Pongo 2 strings %s%s y le pongo el \n para que cambie
				// de línea.
				salida.format("%s\n%s", campoNumero.getText(),campoTexto.getText());
				salida.close();
			}
		});
		btnNewButton.setBounds(125, 154, 89, 23);
		contentPane.add(btnNewButton);
		

	}
}
