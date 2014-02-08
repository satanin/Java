import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class fileopener extends JFrame {

	private JPanel contentPane;
	private JTextField File;
	private JTextField fileName;
	private JTextField filePath;
	private JTextField fileSize;

	/**
	 * Create the frame.
	 */
	public fileopener() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 354, 168);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("File");
		lblNewLabel.setBounds(5, 5, 24, 14);
		contentPane.add(lblNewLabel);
		
		File = new JTextField();
		File.setBounds(60, 2, 229, 20);
		contentPane.add(File);
		File.setColumns(10);
		
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Creo una variable int para comparar el resultado con lo que devuelva abrir.showOpenDialog(abrir);
				int test;

				// Creo un nuevo objeto de tipo JFileChooser
				JFileChooser abrir = new JFileChooser();
				
				// Asigno a text el resultado de abrir.showOpenDialog(abrir);
				test = abrir.showOpenDialog(abrir);
				
				// Si el resultado es igual a Approve_option, es decir que se ha seleccionado un archivo  entro al "if".
				if(test == JFileChooser.APPROVE_OPTION){
					// Creo un objeto File con el nombre de archivo que me pasa abrir.getSelectedFile().getName(). 
					File mifile = new File(abrir.getSelectedFile().getName());
					// Cambio el texto del JTextField "filePath" y le asigno el path al nuevo archivo.
					filePath.setText(mifile.getAbsolutePath());
					
					// Cambio el texto del JTextField "fileName" y File y les asigno el nombre del fichero seleccionado
					fileName.setText(mifile.getName());
					File.setText(mifile.getName());
					
					// creo una variable float para almacenar el resultado de abrir.getSelectedFile().length().
					// abrir.getSelectedFile().length() es un long pero de esta forma lo convierto directamente 
					// en float para no perder decimales al procesarlo. No he descubierto porque no puedo usar
					// mifile.length() para esto, si lo uso el tamaño lo toma siempre como 0.
					float theSize = abrir.getSelectedFile().length();

					// Ahora lo divido por 1024 para convertir el resultado en KB y lo vuelvo a dividir por 1024 para convertirlo en MB.
					theSize = (theSize/1024)/1024;
					// Redondeo la variable para que salgan sólo 2 decimales y así favorecer a su lectura.
					theSize = round.rounder(theSize,2);
					// esto son pruebas que he ido haciendo.
					// System.out.println((abrir.getSelectedFile().length()));
					// System.out.println((abrir.getSelectedFile().length())/1024);
					
					// Actualizo el texto de JTextField "fileSize" y le añado las unidades para que se comprenda mejor.
					fileSize.setText((Float.toString(theSize))+"MB");
					
				// En caso de que no se seleccione ningún archivo escribimos esto en el JTextField File.	
				}else File.setText("Operación Cancelada");
					
				
				
			}
		});
		btnNewButton.setBounds(299, 1, 29, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblFilename = new JLabel("FileName");
		lblFilename.setBounds(5, 35, 46, 14);
		contentPane.add(lblFilename);
		
		fileName = new JTextField();
		fileName.setEditable(false);
		fileName.setColumns(10);
		fileName.setBounds(60, 33, 229, 20);
		contentPane.add(fileName);
		
		filePath = new JTextField();
		filePath.setEditable(false);
		filePath.setColumns(10);
		filePath.setBounds(60, 64, 229, 20);
		contentPane.add(filePath);
		
		fileSize = new JTextField();
		fileSize.setEditable(false);
		fileSize.setColumns(10);
		fileSize.setBounds(60, 93, 229, 20);
		contentPane.add(fileSize);
		
		JLabel lblPath = new JLabel("Path");
		lblPath.setBounds(5, 67, 46, 14);
		contentPane.add(lblPath);
		
		JLabel lblSize = new JLabel("Size");
		lblSize.setBounds(5, 96, 46, 14);
		contentPane.add(lblSize);
	}
}
