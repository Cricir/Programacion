package prueba;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.HyperlinkListener;
import javax.swing.event.HyperlinkEvent;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import java.awt.Window.Type;
import javax.swing.ImageIcon;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.DefaultComboBoxModel;
import java.awt.Cursor;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;

public class prueba_Interfaz extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	static prueba_Interfaz framePrincipal;
	private JTextField textDNI;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					framePrincipal = new prueba_Interfaz();
					framePrincipal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public prueba_Interfaz() {
		setType(Type.UTILITY);
		setBackground(Color.WHITE);
		setTitle("Formulario de Registro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 588, 317);
		contentPane = new JPanel();
		contentPane.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		contentPane.setBackground(new Color(250, 250, 210));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpninicieSesin = new JTextPane();
		txtpninicieSesin.setForeground(new Color(255, 255, 255));
		txtpninicieSesin.setBackground(new Color(0, 128, 0));
		txtpninicieSesin.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 12));
		txtpninicieSesin.setText("¡Inicie Sesión!");
		txtpninicieSesin.setBounds(164, 11, 171, 20);
		contentPane.add(txtpninicieSesin);
		
		JTextPane yaTiene = new JTextPane();
		yaTiene.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 12));
		yaTiene.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFrame frame = new Registro();
				frame.setVisible(true);
				framePrincipal.setVisible(false);
			}
			@Override
			public void mouseEntered(MouseEvent e) {//cuando entra en su rango con el click
				yaTiene.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 13));
			}
			@Override
			public void mouseExited(MouseEvent e) {//cuando sale en su rango con el click
				yaTiene.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 12));
			}
		});
		
		yaTiene.setText("¿Ya tiene una cuenta?");
		yaTiene.setForeground(new Color(192, 192, 192));
		yaTiene.setBackground(new Color(0, 128, 0));
		yaTiene.setBounds(24, 11, 177, 20);
		contentPane.add(yaTiene);
		
		JTextPane txtpnTratamiento = new JTextPane();
		txtpnTratamiento.setBackground(new Color(250, 250, 210));
		txtpnTratamiento.setFont(new Font("SansSerif", Font.BOLD, 12));
		txtpnTratamiento.setText("Tratamiento");
		txtpnTratamiento.setBounds(128, 42, 76, 20);
		contentPane.add(txtpnTratamiento);
		
		JTextPane txtpnNombre = new JTextPane();
		txtpnNombre.setBackground(new Color(250, 250, 210));
		txtpnNombre.setFont(new Font("SansSerif", Font.BOLD, 12));
		txtpnNombre.setText("Nombre");
		txtpnNombre.setBounds(154, 69, 47, 20);
		contentPane.add(txtpnNombre);
		
		JRadioButton botonSR = new JRadioButton("Sr.");
		botonSR.setFont(new Font("SansSerif", Font.PLAIN, 12));
		
		botonSR.setBackground(new Color(250, 250, 210));
		botonSR.setBounds(222, 42, 47, 23);
		contentPane.add(botonSR);
		
		JRadioButton botonSRA = new JRadioButton("Sra.");
		botonSRA.setFont(new Font("SansSerif", Font.PLAIN, 12));
		botonSRA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(botonSR.isSelected()) {
					botonSRA.setSelected(true);
					botonSR.setSelected(false);
					
				}
			}
		});
		botonSR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(botonSRA.isSelected()) {
					botonSRA.setSelected(false);
					botonSR.setSelected(true);
					
				}
			}
		});
		
		botonSRA.setBackground(new Color(250, 250, 210));
		botonSRA.setBounds(271, 42, 64, 23);
		contentPane.add(botonSRA);
		
		JTextPane txtpnApellidos = new JTextPane();
		txtpnApellidos.setBackground(new Color(250, 250, 210));
		txtpnApellidos.setFont(new Font("SansSerif", Font.BOLD, 12));
		txtpnApellidos.setText("Apellidos");
		txtpnApellidos.setBounds(146, 100, 58, 20);
		contentPane.add(txtpnApellidos);
		
		JTextPane txtpnDireccinDeCorreo = new JTextPane();
		txtpnDireccinDeCorreo.setBackground(new Color(250, 250, 210));
		txtpnDireccinDeCorreo.setFont(new Font("SansSerif", Font.BOLD, 12));
		txtpnDireccinDeCorreo.setText("Dirección de correo electrónico");
		txtpnDireccinDeCorreo.setBounds(86, 131, 131, 20);
		contentPane.add(txtpnDireccinDeCorreo);
		
		JTextPane txtpnContrasea = new JTextPane();
		txtpnContrasea.setBackground(new Color(250, 250, 210));
		txtpnContrasea.setFont(new Font("SansSerif", Font.BOLD, 12));
		txtpnContrasea.setText("Contraseña");
		txtpnContrasea.setBounds(132, 162, 84, 20);
		contentPane.add(txtpnContrasea);
		
		JCheckBox terminos = new JCheckBox("   Aceptar Terminos");
		terminos.setFont(new Font("SansSerif", Font.PLAIN, 11));
		terminos.setBackground(new Color(250, 250, 210));
		terminos.setBounds(222, 233, 139, 23);
		contentPane.add(terminos);
		
		JButton btnNewButton = new JButton("Comprobar");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("SansSerif", Font.PLAIN, 11));
	
		btnNewButton.setBackground(new Color(0, 128, 0));
		btnNewButton.setBounds(462, 241, 105, 30);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(222, 69, 345, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(222, 100, 345, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(222, 131, 345, 20);
		contentPane.add(textField_2);
		
		JButton botonCont = new JButton("Mostrar Contraseña");
	
		botonCont.setFont(new Font("SansSerif", Font.PLAIN, 11));
	
		botonCont.setBackground(new Color(0, 128, 0));
		botonCont.setForeground(new Color(255, 255, 255));
		botonCont.setBounds(414, 162, 153, 20);
		contentPane.add(botonCont);
		
		JPasswordField contras = new JPasswordField();
		contras.setEchoChar('*');
		contras.setHorizontalAlignment(SwingConstants.LEFT);
		contras.setBounds(222, 162, 188, 20);
		contentPane.add(contras);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(24, 42, 543, -2);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(prueba_Interfaz.class.getResource("/imagenes/images-removebg-preview (1).png")));
		lblNewLabel_1.setBounds(10, 179, 139, 92);
		contentPane.add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 100, 0));
		panel.setBounds(0, 36, 450, 4);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 128, 0));
		panel_1.setBounds(0, 0, 572, 40);
		contentPane.add(panel_1);
		
		JTextPane txtpnCiudad = new JTextPane();
		txtpnCiudad.setText("Ciudad :");
		txtpnCiudad.setFont(new Font("SansSerif", Font.BOLD, 12));
		txtpnCiudad.setBackground(new Color(250, 250, 210));
		txtpnCiudad.setBounds(395, 43, 58, 20);
		contentPane.add(txtpnCiudad);
		
		JComboBox boxCity = new JComboBox();
		boxCity.setFont(new Font("SansSerif", Font.ITALIC, 11));
		boxCity.setForeground(new Color(0, 0, 0));
		boxCity.setBackground(new Color(255, 255, 240));
		boxCity.setModel(new DefaultComboBoxModel(new String[] {"Granada", "Malaga", "Sevilla ", "Cadiz", "Cordoba"}));
		boxCity.setBounds(454, 43, 113, 22);
		contentPane.add(boxCity);
		
		JTextPane txtpnDni = new JTextPane();
		txtpnDni.setText("DNI");
		txtpnDni.setFont(new Font("SansSerif", Font.BOLD, 12));
		txtpnDni.setBackground(new Color(250, 250, 210));
		txtpnDni.setBounds(176, 193, 31, 20);
		contentPane.add(txtpnDni);
		
		textDNI = new JTextField();
		textDNI.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(textDNI.getText().length()==8) {	
					textDNI.getText().matches("[0-9]*");
					JOptionPane.showMessageDialog(contentPane,"Solo Numeros", "Error Dni ",JOptionPane.ERROR_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(contentPane,"Dni sin letra(8 valores)", "Error Dni ",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
	
		textDNI.setColumns(10);
		textDNI.setBounds(222, 193, 188, 20);
		contentPane.add(textDNI);
	
		botonCont.addActionListener(e -> {
		
			if(contras.getEchoChar() == 0) {
				contras.setEchoChar('*');
			}else {
						contras.setEchoChar((char)0);
			}
		});
		
		btnNewButton.addActionListener(e -> {
			
				if(contras.getPassword().length==0 || textField.getText().equals("") || textField_1.getText().equals("")  || textField_2.getText().equals("") || terminos.isSelected()==false || textDNI.getText().length()!=8) {
					if(terminos.isSelected()==false) {
						JOptionPane.showMessageDialog(null, "Requiere aceptar los terminos");
					}else {
					JOptionPane.showMessageDialog(null, "Faltan Campos por rellenar");
					}
					if(textDNI.getText().length()!=8) {
						JOptionPane.showMessageDialog(null, "DNI sin letra (maximo 8 caracteres)");
					}
				}else {
					JOptionPane.showMessageDialog(null, "Todo Correcto");
				}
			
		});
		
	}
}
