import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;

import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;


public class ConversorInterface extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField inputValue;
	private JTextField binValue;
	private JTextField decValue;
	private JTextField ca1Value;
	private JTextField ca2Value;
	private JTextField smValue;
	private JTextField ieeeValue;
	private JTextField octalValue;
	private JTextField hexValue;
	private JTextField exzValue;
	private JLabel lblExz;
	private JLabel inputTypeSelected;

	/**
	 * Create the frame.
	 */
	public ConversorInterface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 328, 406);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		inputConversor  tipo = new inputConversor();
		inputValue = new JTextField();
		

		
		
		
		inputValue.addKeyListener(new KeyAdapter() {
			inputConversor miInput = new inputConversor();
			
			float userInput;
			float parteDecimal;
			int parteEntera;
			String stringParteEntera,stringParteDecimal;
			String numConverted;
				@SuppressWarnings("null")
				@Override
			public void keyReleased(KeyEvent e) {
					
					switch(tipo.consultarType())
					{
					case 0:{
								if((inputValue.getText().contains("."))|(inputValue.getText().contains(","))){
									inputTypeSelected.setText("ERROR, sólo enteros de momento");
								}else{
										inputTypeSelected.setText("");	
										binValue.setText("");
										decValue.setText("");
										hexValue.setText("");
										octalValue.setText("");
										ca1Value.setText("");
										ca2Value.setText("");
										numConverted = null;
										stringParteEntera = null;
										stringParteDecimal = null;
										
										userInput = Float.parseFloat(inputValue.getText());
										
										numConverted = null;
										parteEntera = (int) userInput;
										parteDecimal = userInput % 1.f;
										decValue.setText(inputValue.getText());
																				
										 if (parteDecimal!=0.0){
											System.out.println("Es un decimal");
										//	stringParteEntera = miInput.pasarDecABinario(parteEntera);
											stringParteDecimal = miInput.pasarFloatABinario(parteDecimal);
										//	numConverted = stringParteEntera+"."+stringParteDecimal;
											binValue.setText(Integer.toBinaryString(parteEntera)+"."+stringParteDecimal);
											
											
										}else{
											binValue.setText(Integer.toBinaryString(parteEntera));
											hexValue.setText(Integer.toHexString(parteEntera));
											octalValue.setText(Integer.toOctalString(parteEntera));
		//									String miCa1 = Integer.toBinaryString(parteEntera);
		//									for (int i=0;i<miCa1.length();i++){
		//										if (miCa1.charAt(i)="0")
		//										miCa1.replace(oldChar, newChar);
		//									}
											
										/*	System.out.println("Es un entero");
										*	stringParteEntera = miInput.pasarDecABinario(parteEntera);
										*	System.out.println("la parte entera es: "+stringParteEntera);
										*	// Actualizamos el valor convertido a Binario
										*	binValue.setText(stringParteEntera);
										*	
										*	// Actualizamos el valor convertido a Ca1.
										*	int longitud = stringParteEntera.length();
										*	String stringCa1 = stringParteEntera;
										*	for (int i=0;i<longitud;i++){
										*		
										*		char michar = stringParteEntera.charAt(i);
										*		if (michar == '0'){
										*			
										*			stringCa1.
										*		}else
										*			stringCa1.concat("0");
										*	}
										*		
										*	ca1Value.setText(stringCa1);
										*/	
									}
								}
								
								
								
								
									
								}
					}
			}
					
					
		});
		inputValue.setHorizontalAlignment(SwingConstants.RIGHT);
		inputValue.setFont(new Font("Consolas", Font.PLAIN, 11));
		inputValue.setBounds(94, 22, 208, 20);
		contentPane.add(inputValue);
		inputValue.setColumns(10);
		
		final JComboBox inputType = new JComboBox();
		inputType.setToolTipText("Entrada de Numeros Enteros");
		inputType.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if( arg0.getStateChange() == ItemEvent.SELECTED ) {
					
					inputTypeSelected.setText("");
					
					System.out.println(inputType.getSelectedIndex());
					
					// Probando si entro en cada evento. 
					int miType = 0;
					
					miType = inputType.getSelectedIndex();
					tipo.establecerType(miType);
					switch (miType)
					{
						case 0:{
							inputTypeSelected.setText("Entrada:Números Enteros");
							
							break;
						}
						case 1:{
							inputTypeSelected.setText("Entrada:Números Binarios");
							break;
						}
						case 2:{
							inputTypeSelected.setText("Entrada:Números Complemento a 1");
							break;
						}
						case 3:{
							inputTypeSelected.setText("Entrada:Números Complemento a 2");
							break;
						}
						case 4:{
							inputTypeSelected.setText("Entrada:Números Signo y Magnitud");
							break;
						}
						case 5:{
							inputTypeSelected.setText("Entrada:Números Exceso Z");
							break;
						}
						case 6:{
							inputTypeSelected.setText("Entrada:Números Hexadecimal");
							break;
						}
						case 7:{
							inputTypeSelected.setText("Entrada:Números Octal");
							break;
						}

					}
				}
			}
		});
		inputType.setModel(new DefaultComboBoxModel(new String[] {"INT", "BIN", "Ca2", "Ca1", "SM", "ExZ", "HEX", "OCT"}));
		inputType.setFont(new Font("Consolas", Font.BOLD, 11));
		inputType.setBounds(10, 22, 55, 20);
		contentPane.add(inputType);
		
		binValue = new JTextField();
		binValue.setHorizontalAlignment(SwingConstants.RIGHT);
		binValue.setEditable(false);
		binValue.setFont(new Font("Consolas", Font.PLAIN, 11));
		binValue.setColumns(10);
		binValue.setBounds(94, 56, 208, 20);
		contentPane.add(binValue);
		
		decValue = new JTextField();
		decValue.setHorizontalAlignment(SwingConstants.RIGHT);
		decValue.setEditable(false);
		decValue.setFont(new Font("Consolas", Font.PLAIN, 11));
		decValue.setColumns(10);
		decValue.setBounds(94, 87, 208, 20);
		contentPane.add(decValue);
		
		ca1Value = new JTextField();
		ca1Value.setHorizontalAlignment(SwingConstants.RIGHT);
		ca1Value.setEditable(false);
		ca1Value.setFont(new Font("Consolas", Font.PLAIN, 11));
		ca1Value.setColumns(10);
		ca1Value.setBounds(94, 118, 208, 20);
		contentPane.add(ca1Value);
		
		ca2Value = new JTextField();
		ca2Value.setHorizontalAlignment(SwingConstants.RIGHT);
		ca2Value.setEditable(false);
		ca2Value.setFont(new Font("Consolas", Font.PLAIN, 11));
		ca2Value.setColumns(10);
		ca2Value.setBounds(94, 149, 208, 20);
		contentPane.add(ca2Value);
		
		smValue = new JTextField();
		smValue.setHorizontalAlignment(SwingConstants.RIGHT);
		smValue.setEditable(false);
		smValue.setFont(new Font("Consolas", Font.PLAIN, 11));
		smValue.setColumns(10);
		smValue.setBounds(94, 180, 208, 20);
		contentPane.add(smValue);
		
		JLabel lblBin = new JLabel("BIN");
		lblBin.setFont(new Font("Consolas", Font.PLAIN, 11));
		lblBin.setHorizontalAlignment(SwingConstants.CENTER);
		lblBin.setBounds(10, 58, 55, 14);
		contentPane.add(lblBin);
		
		JLabel lblDec = new JLabel("DEC");
		lblDec.setFont(new Font("Consolas", Font.PLAIN, 11));
		lblDec.setHorizontalAlignment(SwingConstants.CENTER);
		lblDec.setBounds(10, 89, 55, 14);
		contentPane.add(lblDec);
		
		JLabel lblCa = new JLabel("Ca1");
		lblCa.setFont(new Font("Consolas", Font.PLAIN, 11));
		lblCa.setHorizontalAlignment(SwingConstants.CENTER);
		lblCa.setBounds(10, 120, 55, 14);
		contentPane.add(lblCa);
		
		JLabel lblCa_1 = new JLabel("Ca2");
		lblCa_1.setFont(new Font("Consolas", Font.PLAIN, 11));
		lblCa_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCa_1.setBounds(10, 151, 55, 14);
		contentPane.add(lblCa_1);
		
		JLabel lblSm = new JLabel("SM");
		lblSm.setFont(new Font("Consolas", Font.PLAIN, 11));
		lblSm.setHorizontalAlignment(SwingConstants.CENTER);
		lblSm.setBounds(10, 182, 55, 14);
		contentPane.add(lblSm);
		
		ieeeValue = new JTextField();
		ieeeValue.setHorizontalAlignment(SwingConstants.RIGHT);
		ieeeValue.setEditable(false);
		ieeeValue.setFont(new Font("Consolas", Font.PLAIN, 11));
		ieeeValue.setColumns(10);
		ieeeValue.setBounds(94, 211, 208, 20);
		contentPane.add(ieeeValue);
		
		octalValue = new JTextField();
		octalValue.setHorizontalAlignment(SwingConstants.RIGHT);
		octalValue.setEditable(false);
		octalValue.setFont(new Font("Consolas", Font.PLAIN, 11));
		octalValue.setColumns(10);
		octalValue.setBounds(94, 273, 208, 20);
		contentPane.add(octalValue);
		
		hexValue = new JTextField();
		hexValue.setHorizontalAlignment(SwingConstants.RIGHT);
		hexValue.setEditable(false);
		hexValue.setFont(new Font("Consolas", Font.PLAIN, 11));
		hexValue.setColumns(10);
		hexValue.setBounds(94, 304, 208, 20);
		contentPane.add(hexValue);
		
		JLabel lblIeee = new JLabel("IEEE-754");
		lblIeee.setFont(new Font("Consolas", Font.PLAIN, 11));
		lblIeee.setHorizontalAlignment(SwingConstants.CENTER);
		lblIeee.setBounds(10, 213, 55, 14);
		contentPane.add(lblIeee);
		
		JLabel lblOct = new JLabel("OCT");
		lblOct.setFont(new Font("Consolas", Font.PLAIN, 11));
		lblOct.setHorizontalAlignment(SwingConstants.CENTER);
		lblOct.setBounds(10, 275, 55, 14);
		contentPane.add(lblOct);
		
		JLabel lblHex = new JLabel("HEX");
		lblHex.setFont(new Font("Consolas", Font.PLAIN, 11));
		lblHex.setHorizontalAlignment(SwingConstants.CENTER);
		lblHex.setBounds(10, 307, 55, 14);
		contentPane.add(lblHex);
		
		exzValue = new JTextField();
		exzValue.setHorizontalAlignment(SwingConstants.RIGHT);
		exzValue.setFont(new Font("Consolas", Font.PLAIN, 11));
		exzValue.setEditable(false);
		exzValue.setColumns(10);
		exzValue.setBounds(94, 242, 208, 20);
		contentPane.add(exzValue);
		
		lblExz = new JLabel("ExZ");
		lblExz.setHorizontalAlignment(SwingConstants.CENTER);
		lblExz.setFont(new Font("Consolas", Font.PLAIN, 11));
		lblExz.setBounds(10, 244, 55, 14);
		contentPane.add(lblExz);
		
		inputTypeSelected = new JLabel("Entrada: n\u00FAmeros enteros");
		inputTypeSelected.setHorizontalAlignment(SwingConstants.CENTER);
		inputTypeSelected.setToolTipText("");
		inputTypeSelected.setBounds(10, 335, 292, 14);
		contentPane.add(inputTypeSelected);
	}
}
