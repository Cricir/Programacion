package prueba;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Registro extends JFrame {

	private JPanel contentPane;
	private JTextField dni;
	static Registro frameInicio;
	private JPasswordField password1;
	private JPasswordField password2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frameInicio = new Registro();
					frameInicio.setVisible(true);
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
		setBounds(100, 100, 505, 346);
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
		
		dni = new JTextField();
		dni.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				if(dni.getText().length()==8) {	
					if(!dni.getText().matches("[0-9]*")) {
						JOptionPane.showMessageDialog(contentPane,"Solo Numeros", "Error Dni ",JOptionPane.ERROR_MESSAGE);
					}
				}else {
					JOptionPane.showMessageDialog(contentPane,"Dni sin letra(8 valores)", "Error Dni ",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		dni.setBounds(186, 62, 210, 20);
		dni.setColumns(10);
		contentPane.add(dni);
		
		JTextPane txtpnContrasea = new JTextPane();
		txtpnContrasea.setBounds(83, 105, 84, 20);
		txtpnContrasea.setText("Contraseña");
		txtpnContrasea.setFont(new Font("SansSerif", Font.BOLD, 12));
		txtpnContrasea.setBackground(new Color(250, 250, 210));
		contentPane.add(txtpnContrasea);
		
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
		panel_1.setLayout(null);
		
		JTextPane txtpnJuntaDeAndalucia = new JTextPane();
		txtpnJuntaDeAndalucia.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 20));
		txtpnJuntaDeAndalucia.setBackground(new Color(0, 128, 0));
		txtpnJuntaDeAndalucia.setText("Ingreso de Sesion");
		txtpnJuntaDeAndalucia.setForeground(new Color(255, 255, 255));
		txtpnJuntaDeAndalucia.setBounds(136, 4, 226, 29);
		panel_1.add(txtpnJuntaDeAndalucia);
		
		JTextPane txtpnRepiteContrasea = new JTextPane();
		txtpnRepiteContrasea.setBounds(42, 146, 125, 20);
		txtpnRepiteContrasea.setText("Repite Contraseña");
		txtpnRepiteContrasea.setFont(new Font("SansSerif", Font.BOLD, 12));
		txtpnRepiteContrasea.setBackground(new Color(250, 250, 210));
		contentPane.add(txtpnRepiteContrasea);
		
		JTextPane txtpnAccesibilidad = new JTextPane();
		txtpnAccesibilidad.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFrame frame = new Terminos();
				frame.setVisible(true);
				dispose();
			}
		});
		txtpnAccesibilidad.setBounds(220, 268, 260, 20);
		txtpnAccesibilidad.setForeground(new Color(0, 128, 0,50));
		txtpnAccesibilidad.setText("Accesibilidad          Privacidad          Normativa  ");
		txtpnAccesibilidad.setBackground(new Color(250, 250, 210));
		contentPane.add(txtpnAccesibilidad);
		
		JTextPane yaTiene = new JTextPane();
		yaTiene.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFrame frame = new prueba_Interfaz();
				frame.setVisible(true);
				dispose();
			}
		});
		yaTiene.setText("¿Aun no tienes cuenta?");
		yaTiene.setForeground(Color.LIGHT_GRAY);
		yaTiene.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 12));
		yaTiene.setBackground(new Color(250, 250, 210));
		yaTiene.setBounds(134, 197, 151, 20);
		contentPane.add(yaTiene);
		
		password1 = new JPasswordField();
		password1.setHorizontalAlignment(SwingConstants.LEFT);
		password1.setEchoChar('*');
		password1.setBounds(186, 105, 210, 20);
		contentPane.add(password1);
		
		password2 = new JPasswordField();
		password2.setHorizontalAlignment(SwingConstants.LEFT);
		password2.setEchoChar('*');
		password2.setBounds(186, 146, 210, 20);
		contentPane.add(password2);
		
		btnIngresar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			if(password1.getPassword().length==0 || dni.getText().equals("") || password2.getPassword().length==0 || password1.getPassword().equals(password2.getPassword())) {
				if(dni.getText().length()!=8) {
					JOptionPane.showMessageDialog(contentPane,"DNI sin letra (maximo 8 caracteres)", "Error ",JOptionPane.ERROR_MESSAGE);
				}
				if(password1.getPassword().equals(password2.getPassword())) {
					JOptionPane.showMessageDialog(contentPane,"Las contraseñas introducidas no son iguales", "Error ",JOptionPane.ERROR_MESSAGE);
				}
			}else {
				JOptionPane.showMessageDialog(contentPane,"Todo Correcto", "Correcto ",JOptionPane.INFORMATION_MESSAGE);
				 final Comprobacion comprobar = new Comprobacion();
				 if ( comprobar.Comprobar(dni.getText(), password1.getText())) {
					 JFrame frame = new PaginaComprobar();
					 frame.setVisible(true);
					 dispose();
				}else {
					JOptionPane.showMessageDialog(contentPane,"El usuario no es correcto", "Error ",JOptionPane.ERROR_MESSAGE);
				}
			
			}
			}
		});
	}
}
