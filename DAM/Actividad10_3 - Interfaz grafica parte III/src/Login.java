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
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Toolkit;


public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	/**
	 * Create the frame.
	 */
	public Login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Mis Documentos\\Copy\\Programaci\u00F3n\\Workspaces\\Actividad10_3\\images\\Dota2ClanLogo.png"));
		setFont(new Font("Consolas", Font.PLAIN, 12));
		setTitle("Ventana de Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblJugador = new JLabel("Jugador 1");
		lblJugador.setBounds(152, 31, 59, 14);
		contentPane.add(lblJugador);
		
		JLabel lblJugador_1 = new JLabel("Jugador 2");
		lblJugador_1.setBounds(152, 66, 59, 14);
		contentPane.add(lblJugador_1);
		
		JLabel lblJugador_2 = new JLabel("Jugador 3");
		lblJugador_2.setBounds(152, 104, 59, 14);
		contentPane.add(lblJugador_2);
		
		textField = new JTextField();
		textField.setBounds(221, 28, 174, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(221, 63, 174, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(221, 101, 174, 20);
		contentPane.add(textField_2);
		
		JButton btnGuardar = new JButton("Salvar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnGuardar.setBounds(194, 169, 89, 23);
		contentPane.add(btnGuardar);
		
		JButton btnResetear = new JButton("Descartar");
		btnResetear.setBounds(306, 169, 89, 23);
		contentPane.add(btnResetear);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\Mis Documentos\\Copy\\Programaci\u00F3n\\Workspaces\\Actividad10_3\\images\\avatar_cuadrado.png"));
		lblNewLabel.setBounds(13, 104, 129, 141);
		contentPane.add(lblNewLabel);
	}
}
