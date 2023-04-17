package prueba;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


import BBD.Conexion;

import java.awt.Window.Type;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JTable;

public class PaginaComprobar extends JFrame {

	private JPanel contentPane;
	static PaginaComprobar frameInicio;
	private JTable tabla;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frameInicio = new PaginaComprobar();
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
	public PaginaComprobar() {
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 584, 366);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 250, 210));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 36, 490, 4);
		panel.setBackground(new Color(0, 100, 0));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 568, 40);
		panel_1.setBackground(new Color(0, 128, 0));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JTextPane DatosBase = new JTextPane();
		DatosBase.setEditable(false);
		DatosBase.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 20));
		DatosBase.setBackground(new Color(0, 128, 0));
		DatosBase.setText("Base de datos");
		DatosBase.setForeground(new Color(255, 255, 255));
		DatosBase.setBounds(156, 4, 170, 29);
		panel_1.add(DatosBase);
		
		JTextPane txtpnAccesibilidad = new JTextPane();
		txtpnAccesibilidad.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFrame frame = new Terminos();
				frame.setVisible(true);
				dispose();
			}
		});
		txtpnAccesibilidad.setBounds(302, 296, 260, 20);
		txtpnAccesibilidad.setForeground(new Color(0, 128, 0,50));
		txtpnAccesibilidad.setText("Accesibilidad          Privacidad          Normativa  ");
		txtpnAccesibilidad.setBackground(new Color(250, 250, 210));
		contentPane.add(txtpnAccesibilidad);
		
		JTable tabla = new JTable();
		tabla.setForeground(new Color(255, 255, 255));
		tabla.setBackground(new Color(34, 139, 34));
		tabla.setBounds(10, 51, 470, 206);
		tabla.setRowHeight(30);
		tabla.setEnabled(false);
		tabla.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		tabla.setModel(new DefaultTableModel(
				new Object[][] {},
				new String[] {"nombre", "apellidos", "direccion", "contraseña", "dni", "trato", "ciudad"}));
		tabla.getColumnModel().getColumn(0).setPreferredWidth(100);
		tabla.getColumnModel().getColumn(1).setPreferredWidth(100);
		tabla.getColumnModel().getColumn(2).setPreferredWidth(150);
		tabla.getColumnModel().getColumn(3).setPreferredWidth(100);
		tabla.getColumnModel().getColumn(4).setPreferredWidth(120);
		tabla.getColumnModel().getColumn(5).setPreferredWidth(100);
		
		// Centrar texto
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment( JLabel.CENTER );
		tabla.setDefaultRenderer(Object.class, centerRenderer);
		

		// Poner JScrollPane para poder hacer scroll 
		JScrollPane scrollPane = new JScrollPane(tabla);
		scrollPane.setForeground(new Color(0, 0, 0));
		scrollPane.getViewport().setBackground(new Color(250, 250, 210));
		scrollPane.setBorder(BorderFactory.createLineBorder(new Color(0, 128, 0)));
		scrollPane.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		scrollPane.setBounds(10, 51, 552, 197);
		contentPane.add(scrollPane);

		// Obtenemos los usuarios de la base de datos y los añadimos a la tabla
		Mostrar most = new Mostrar();
		most.Muestra();
		
		//borrar
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(131, 259, 260, 20);
		contentPane.add(textField);
		
		JTextPane txtpnBorrar = new JTextPane();
		txtpnBorrar.setEditable(false);
		txtpnBorrar.setText("Borrar:");
		txtpnBorrar.setFont(new Font("SansSerif", Font.BOLD, 12));
		txtpnBorrar.setBackground(new Color(250, 250, 210));
		txtpnBorrar.setBounds(20, 259, 92, 20);
		contentPane.add(txtpnBorrar);
		
		Mostrar2 filasTabla = new Mostrar2(tabla);
        filasTabla.Muestra();
		
		JButton btnNewButton = new JButton("Borrar");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				final Comprobacion comprobar = new Comprobacion();
				if(comprobar.Comprobar2(textField.getText())) {
					final Borrar borr = new Borrar();
					borr.borrarUsuario(textField.getText());
					most.Muestra();
					filasTabla.Muestra();
				}else {
					JOptionPane.showMessageDialog(contentPane,"El usuario no existe", "Error ",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnNewButton.setBounds(401, 259, 81, 20);
		contentPane.add(btnNewButton);
		
		
        
			
	}
}
