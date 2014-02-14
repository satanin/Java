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
import java.util.Arrays;


public class Examen extends JFrame {
	// Declaro algunas variables que voy a necesitar
	// Creo los dos arrays que me pide el enunciado de tamaño 10 y la variable que almacenará el número de mesas. 
	private float totalGastadoMesa[] = new float[10];
	private int totalComensales[] = new int[10];
	private int mesas = 0;
	// Declaro estas dos variables que me ayudarán a almacenar el número total de comensales y el importe total gastado 
	// para realizar cálculos
	private int comensalesAhora = 0;
	private float totalGastadoAhora = 0f;


	private JPanel contentPane;
	private JTextField numComensales;
	private JTextField totalGastado;
	private JTextField textField;
	// creo aquí estos 2 JLabel en vez de dentro de Examen para poder acceder a ellos desde dentro de los botones.
	private JLabel labelIngresos;
	private JLabel labelPersonas;

	/**
	 * Create the frame.
	 */
	public Examen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 439, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumeroComensales = new JLabel("Numero comensales");
		lblNumeroComensales.setBounds(10, 25, 144, 14);
		contentPane.add(lblNumeroComensales);
		
		numComensales = new JTextField();
		numComensales.setBounds(164, 22, 86, 20);
		contentPane.add(numComensales);
		numComensales.setColumns(10);
		
		JLabel lblTotalGastado = new JLabel("Total gastado");
		lblTotalGastado.setBounds(10, 59, 144, 14);
		contentPane.add(lblTotalGastado);
		
		totalGastado = new JTextField();
		totalGastado.setBounds(164, 56, 86, 20);
		contentPane.add(totalGastado);
		totalGastado.setColumns(10);
		
		JLabel lblTotalPersonas = new JLabel("Total personas");
		lblTotalPersonas.setBounds(10, 110, 95, 14);
		contentPane.add(lblTotalPersonas);
		
		JLabel lblTotalIngresos = new JLabel("Total ingresos");
		lblTotalIngresos.setBounds(10, 146, 95, 14);
		contentPane.add(lblTotalIngresos);
		
		labelPersonas = new JLabel("0");
		labelPersonas.setBounds(220, 110, 46, 14);
		contentPane.add(labelPersonas);
		
		labelIngresos = new JLabel("0");
		labelIngresos.setBounds(220, 146, 46, 14);
		contentPane.add(labelIngresos);
		
		textField = new JTextField();
		textField.setBounds(10, 224, 403, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("calcular ticket medio");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// me creo una variable de tipo float para almacenar la media de ticket.
				float media;
				// calculo la media utilizando el importe total que tengo almacenado en totalGastadoAhora y lo divido por
				// el número total de mesas que tengo almacenado en la variable mesas. Casteo a float para que el resultado sea float.
				media = totalGastadoAhora/(float)mesas;
				// Actualizo el textField para que aparezca el importe de la media
				textField.setText(String.valueOf(media));
			}
		});
		btnNewButton_1.setBounds(10, 190, 403, 23);
		contentPane.add(btnNewButton_1);
		

		
		JButton btnNewButton = new JButton("Guardar ticket mesa");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Meto todo dentro de un try para evitar que el programa deje de ejecutarse por un error
				try{
					// compruebo que el número de mesas sea menor o igual a 10
					if(mesas<10){
						// Utilizo la variable mesas como índice de la última posición usada del vector e inserto el número de comensales y el importe
						// gastado en los vectores correspondientes.				
						totalComensales[mesas] = Integer.valueOf(numComensales.getText());
						totalGastadoMesa[mesas] = Float.valueOf(totalGastado.getText());
						
						// Incremento el número total de comensales que tengo en el local en la variable comensalesAhora
						comensalesAhora = comensalesAhora + Integer.valueOf(numComensales.getText());
						// Actualizo la etiqueta labelPersonas con el número total de comensales.
						labelPersonas.setText(Integer.toString(comensalesAhora));
						// Incremento el importe total de los tickets en la variable totalGastadoAhora
						totalGastadoAhora = totalGastadoAhora + Float.valueOf(totalGastado.getText());
						// Actualizo la etiqueta labelIngresos con el importe total de los tickets
						labelIngresos.setText(Float.toString(totalGastadoAhora));
						// por último incremento el número de mesas
						mesas++;
						// saco por consola el número de mesas que hay ahora en el local.
						System.out.println("Hay "+mesas+ " mesas en el local");
						
						// Si hay más de 10 mesas saco este mensaje por consola, el if no es necesario 100%
					}else if(mesas>=10){
						
						System.out.println("Hay demasiadas mesas en el local");
						
					}
					
				// Si se produce alguna excepción la capturo y muestro el error "ha habido un error" por consola.	
				}catch (Exception e){
					System.out.println("ha habido un error");
				}
			}
		});
		btnNewButton.setBounds(260, 21, 153, 54);
		contentPane.add(btnNewButton);
		

	}
	
	// método devolverComensales
	private int[] devolverComensales (){
		return totalComensales;
	}
	// método devolverGastado
	private float[] devolverGastado(){
		return totalGastadoMesa;
	}
	// método para resetear los arrays y el resto de atributos
	private void resetear(){
		Arrays.fill(totalComensales, 0);
		Arrays.fill(totalGastadoMesa, 0);
		mesas = 0;
		comensalesAhora = 0;
		totalGastadoAhora = 0;
		
		
	}
}
