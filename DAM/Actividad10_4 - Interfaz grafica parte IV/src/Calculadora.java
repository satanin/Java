import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;


public class Calculadora extends JFrame {
	private JTextField numero1;
	private JTextField numero2;
	private JTextField resultado;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Calculadora() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Mis Documentos\\Copy\\Programaci\u00F3n\\Workspaces\\Actividad10_4\\images\\calculator-1.png"));
		setFont(new Font("Consolas", Font.PLAIN, 11));
		setTitle(" SimpleCalc");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 285, 210);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setLayout(null);
		
		numero1 = new JTextField();
		numero1.setBounds(22, 34, 86, 20);
		numero1.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(numero1);
		numero1.setColumns(10);
		
		numero2 = new JTextField();
		numero2.setBounds(152, 34, 86, 20);
		numero2.setHorizontalAlignment(SwingConstants.CENTER);
		numero2.setColumns(10);
		getContentPane().add(numero2);
		
		
		/* Botón sumar aquí le meteremos un nuevo evento que sume los números introducidos en numero1 y numero2.
		 * Como son String los parseamos a float para que no de error si alguien pone decimales y luego los volvemos a convertir a
		 * String para poderlos mostrar en el Textfield que se llama resultado. Hacemos lo mismo con el botón resta y multiplicación.
		 */
		
		JButton sumar = new JButton("+");
		sumar.setBounds(22, 65, 49, 23);
		sumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Utilizamos try para probar si el código que tenemos dentro de las llaves funciona correctamente o arroja alguna excepción
				try {
					
					resultado.setText(String.valueOf(Float.parseFloat(numero1.getText())+Float.parseFloat(numero2.getText())));
					
				/* Utilizamos catch y ponemos el tipo de error que se arroja al intentar ejecutar el código con parámetros incorrectos y
				 * establecemos la acción que se realizará cuando esto ocurra, en mi caso pondré un mensaje de error.*/
				}catch(NumberFormatException excepcion){
					resultado.setText("Sólo números por favor   ");
				}
			}
		});
		getContentPane().add(sumar);
		
		JButton restar = new JButton("-");
		restar.setBounds(77, 65, 49, 23);
		restar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// Utilizamos try para probar si el código que tenemos dentro de las llaves funciona correctamente o arroja alguna excepción
				try{
				
					resultado.setText(String.valueOf(Float.parseFloat(numero1.getText())-Float.parseFloat(numero2.getText())));
					
				/* Utilizamos catch y ponemos el tipo de error que se arroja al intentar ejecutar el código con parámetros incorrectos y
				 * establecemos la acción que se realizará cuando esto ocurra, en mi caso pondré un mensaje de error.*/
				}catch(NumberFormatException excepcion){
					resultado.setText("Sólo números por favor    ");
				}
			}
		});
		getContentPane().add(restar);
		
		JButton multiplicar = new JButton("*");
		multiplicar.setBounds(189, 65, 49, 23);
		multiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Utilizamos try para probar si el código que tenemos dentro de las llaves funciona correctamente o arroja alguna excepción
				try {
					
					resultado.setText(String.valueOf(Float.parseFloat(numero1.getText())*Float.parseFloat(numero2.getText())));
					
				/* Utilizamos catch y ponemos el tipo de error que se arroja al intentar ejecutar el código con parámetros incorrectos y
				 * establecemos la acción que se realizará cuando esto ocurra, en mi caso pondré un mensaje de error.*/
				}catch(NumberFormatException excepcion){
					
					resultado.setText("Sólo números por favor     ");
				}
			}
		});
		getContentPane().add(multiplicar);
		
		JButton Division = new JButton("/");
		Division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// Utilizamos try para probar si el código que tenemos dentro de las llaves funciona correctamente o arroja alguna excepción
				try{
					
					resultado.setText(String.valueOf(Float.parseFloat(numero1.getText())/Float.parseFloat(numero2.getText())));
					
				/* Utilizamos catch y ponemos el tipo de error que se arroja al intentar ejecutar el código con parámetros incorrectos y
				 * establecemos la acción que se realizará cuando esto ocurra, en mi caso pondré un mensaje de error.*/					
				}catch(NumberFormatException excepcion){
					resultado.setText("Sólo números por favor      ");
				}
			}
		});
		Division.setBounds(134, 65, 49, 23);
		contentPane.add(Division);
		
		resultado = new JTextField();
		resultado.setBounds(22, 135, 216, 20);
		resultado.setFont(new Font("Consolas", Font.PLAIN, 11));
		resultado.setHorizontalAlignment(SwingConstants.RIGHT);
		getContentPane().add(resultado);
		resultado.setColumns(10);
		
		JLabel lblNmero = new JLabel("N\u00FAmero1");
		lblNmero.setBounds(22, 11, 86, 14);
		lblNmero.setForeground(Color.WHITE);
		lblNmero.setHorizontalAlignment(SwingConstants.CENTER);
		lblNmero.setFont(new Font("Consolas", Font.PLAIN, 11));
		getContentPane().add(lblNmero);
		
		JLabel lblNmero_1 = new JLabel("N\u00FAmero2");
		lblNmero_1.setBounds(152, 9, 86, 14);
		lblNmero_1.setForeground(Color.WHITE);
		lblNmero_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNmero_1.setFont(new Font("Consolas", Font.PLAIN, 11));
		getContentPane().add(lblNmero_1);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setBounds(91, 116, 79, 14);
		lblResultado.setFont(new Font("Consolas", Font.PLAIN, 11));
		lblResultado.setForeground(Color.WHITE);
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblResultado);
		

	}
}
