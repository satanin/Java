import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;

import javax.swing.JScrollBar;
import javax.swing.JScrollPane;


public class interfazArreglos extends JFrame {

	private JPanel contentPane;
	private JTextField tamanyo;
	private JTextField cadenaRelleno;
	private JTextField cadenaColocar;
	private JTextField posicionColocar;
	private JTextArea textArea;
	// Aquí defino el objeto arreglo para poder trabajar con él.
	private ManejandoObjetos arreglo = new ManejandoObjetos();
	private JButton btnImprimir;
	// He añadido el contenedor JScrollPane para que se pueda hacer Scroll
	private final JScrollPane scrollPane = new JScrollPane();


	/**
	 * Launch the application.
	 */
	// Esto lo he copiado a la clase main

	/**
	 * Create the frame.
	 */
	public interfazArreglos() {
		addWindowListener(new WindowAdapter() {
			@Override
			// Aquí he añadido el evento WindowOpened para poner unas instrucciones.
			public void windowOpened(WindowEvent arg0) {
				String[] misObjetos = arreglo.devolverObjetos();
				textArea.setText("Se ha creado un vector automáticamente de tamaño "+misObjetos.length+"\n");
				// Uso el método append para no resetear el contenido de textArea.
				textArea.append(
						"puedes realizar las siguientes operaciones: \n"
						+ "- Cambiar el tamaño con el botón Tamaño\n"
						+ "- Colocar una cadena en una determinada posición\n"
						+ "- Rellenar todo el vector con una cadena.");
			}
		});
		setTitle("Operaciones con arreglos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnResetear = new JButton("Resetear");
		btnResetear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				arreglo.rellenarObjetos();
			}
		});
		btnResetear.setBounds(385, 11, 89, 23);
		contentPane.add(btnResetear);
		
		JButton btnTamao = new JButton("Tama\u00F1o");
		btnTamao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					// Aquí lo que hago es asignar a mi objeto arreglo el tamaño que define el usuario en el campo tamanyo, 
					// luego saco por pantalla un mensaje e imprimo por consola el nuevo arreglo.
					arreglo = new ManejandoObjetos(Integer.parseInt(tamanyo.getText()));
					textArea.setText("Se ha creado un arreglo de tamaño"+tamanyo.getText());
					arreglo.imprimirObjetos();
				}catch(NumberFormatException numberFormatException){
					textArea.setText("Ese tamaño no es correcto");
				}
			}
		});
		btnTamao.setBounds(10, 11, 89, 23);
		contentPane.add(btnTamao);
		
		tamanyo = new JTextField();
		tamanyo.setBounds(109, 11, 57, 23);
		contentPane.add(tamanyo);
		tamanyo.setColumns(10);
		
		JButton btnRellenar = new JButton("Rellenar");
		btnRellenar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Aquí relleno mi arreglo con la cadena que le pasamos en el campo cadenaRelleno.
				// luego saco por consola el arreglo.
				arreglo.rellenarObjetos(cadenaRelleno.getText());
				textArea.setText("El vector ha sido rellenado, presiona Imprimir para verlo en pantalla");
				arreglo.imprimirObjetos();
			}
		});
		btnRellenar.setBounds(176, 11, 89, 23);
		contentPane.add(btnRellenar);
		
		cadenaRelleno = new JTextField();
		cadenaRelleno.setToolTipText("contenido");
		cadenaRelleno.setBounds(275, 11, 100, 23);
		contentPane.add(cadenaRelleno);
		cadenaRelleno.setColumns(10);
		
		JButton btnColocar = new JButton("Colocar");
		btnColocar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Aquí obtengo mi arreglo para poder usar su método length para mostrarlo cuando se produce un error 
				String[] misObjetos = arreglo.devolverObjetos();
				// Intento colocar una cadena que obtengo de cadenaColocar en la posición posicionColocar.
				try{
					arreglo.colocarObjeto(Integer.parseInt(posicionColocar.getText()), cadenaColocar.getText() );
					textArea.setText("Se ha colocado la cadena: "+cadenaColocar.getText()+" en la posición: "+posicionColocar.getText());
				}
				// Si no se especifica una posición sale este error.
				catch (NumberFormatException numberFormatException){
					textArea.setText("Debes especificar la posición en la que quieres que vaya tu cadena");
				}
				// Si la posición especificada no existe muestro este error
				catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
					textArea.setText("Has especificado una posición que no existe.\n Tu vector dispone de las posiciones de: 0 a "+(misObjetos.length-1));
				}
				
			}
		});
		btnColocar.setBounds(10, 43, 89, 23);
		contentPane.add(btnColocar);
		
		cadenaColocar = new JTextField();
		cadenaColocar.setToolTipText("contenido");
		cadenaColocar.setBounds(109, 44, 199, 23);
		contentPane.add(cadenaColocar);
		cadenaColocar.setColumns(10);
		
		posicionColocar = new JTextField();
		posicionColocar.setToolTipText("Posicion");
		posicionColocar.setBounds(318, 44, 57, 23);
		contentPane.add(posicionColocar);
		posicionColocar.setColumns(10);
		
		btnImprimir = new JButton("Imprimir");
		btnImprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Imprimo el contenido del arreglo
				textArea.setText("Este es el contenido del vector en estos momentos \n");
				// Para poder imprimir el arreglo por pantalla necesito asignarlo a un arreglo que creo con los datos del arreglo que ya existe.
				String[] misObjetos = arreglo.devolverObjetos();
				// Bucle para imprimir por pantalla los items de mi arreglo.
				for (int i=0;i<misObjetos.length;i++){
					textArea.append(i+" : "+ misObjetos[i]+"\n");
				}
				// Imprimo por consola también los items de mi arreglo usando el método creado para ello.
				arreglo.imprimirObjetos();
			}
		});
		btnImprimir.setBounds(385, 43, 89, 23);
		contentPane.add(btnImprimir);
		scrollPane.setViewportBorder(null);
		scrollPane.setBounds(10, 77, 464, 122);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setEditable(false);
		textArea.setToolTipText("Mensajes del Sistema");
	}
}
