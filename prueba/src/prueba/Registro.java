package prueba;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Registro extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registro frame = new Registro();
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
	public Registro() {
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 504, 346);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 250, 210));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(10, 203, 139, 92);
		lblNewLabel_1.setIcon(new ImageIcon(Registro.class.getResource("/imagenes/images-removebg-preview (1).png")));
		contentPane.add(lblNewLabel_1);
		
		JTextPane txtpnDni = new JTextPane();
		txtpnDni.setBounds(128, 62, 31, 20);
		txtpnDni.setText("DNI");
		txtpnDni.setFont(new Font("SansSerif", Font.BOLD, 12));
		txtpnDni.setBackground(new Color(250, 250, 210));
		contentPane.add(txtpnDni);
		
		textField = new JTextField();
		textField.setBounds(186, 62, 210, 20);
		textField.setColumns(10);
		contentPane.add(textField);
		
		JTextPane txtpnContrasea = new JTextPane();
		txtpnContrasea.setBounds(83, 105, 84, 20);
		txtpnContrasea.setText("Contraseña");
		txtpnContrasea.setFont(new Font("SansSerif", Font.BOLD, 12));
		txtpnContrasea.setBackground(new Color(250, 250, 210));
		contentPane.add(txtpnContrasea);
		
		textField_1 = new JTextField();
		textField_1.setBounds(186, 104, 210, 20);
		textField_1.setColumns(10);
		contentPane.add(textField_1);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.setBounds(291, 192, 105, 30);
		btnIngresar.setForeground(Color.WHITE);
		btnIngresar.setFont(new Font("SansSerif", Font.PLAIN, 11));
		btnIngresar.setBackground(new Color(0, 128, 0));
		contentPane.add(btnIngresar);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 36, 490, 4);
		panel.setBackground(new Color(0, 100, 0));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 488, 40);
		panel_1.setBackground(new Color(0, 128, 0));
		contentPane.add(panel_1);
		
		JTextPane txtpnRepiteContrasea = new JTextPane();
		txtpnRepiteContrasea.setBounds(42, 146, 125, 20);
		txtpnRepiteContrasea.setText("Repite Contraseña");
		txtpnRepiteContrasea.setFont(new Font("SansSerif", Font.BOLD, 12));
		txtpnRepiteContrasea.setBackground(new Color(250, 250, 210));
		contentPane.add(txtpnRepiteContrasea);
		
		textField_2 = new JTextField();
		textField_2.setBounds(186, 146, 210, 20);
		textField_2.setColumns(10);
		contentPane.add(textField_2);
		
		JTextPane txtpnAccesibilidad = new JTextPane();
		txtpnAccesibilidad.setBounds(220, 268, 260, 20);
		txtpnAccesibilidad.setForeground(new Color(0, 128, 0,50));
		txtpnAccesibilidad.setText("Accesibilidad          Privacidad          Normativa  ");
		txtpnAccesibilidad.setBackground(new Color(250, 250, 210));
		contentPane.add(txtpnAccesibilidad);
	}
}
