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
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Terminos extends JFrame {

	private JPanel contentPane;
	static Terminos frameTerm;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frameTerm = new Terminos();
					frameTerm.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Terminos() {
		getContentPane().setLayout(null);
		
		JLabel fondo = new JLabel("New label");
		fondo.setBounds(0, 0, 434, 261);
		getContentPane().add(fondo);
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 536, 723);
		contentPane =  new JPanel();
		contentPane.setBackground(new Color(250, 250, 210));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnTrminosYCondiciones = new JTextPane();
		txtpnTrminosYCondiciones.setForeground(new Color(255, 255, 255));
		txtpnTrminosYCondiciones.setBackground(new Color(0, 128, 0));
		txtpnTrminosYCondiciones.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		txtpnTrminosYCondiciones.setText("Términos y Condiciones de Uso de Sitio Web");
		txtpnTrminosYCondiciones.setBounds(80, 11, 370, 24);
		contentPane.add(txtpnTrminosYCondiciones);
		
		JTextPane txtpnTrminosYCondiciones_1 = new JTextPane();
		txtpnTrminosYCondiciones_1.setText("Términos y condiciones de uso de sitio web");
		txtpnTrminosYCondiciones_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		txtpnTrminosYCondiciones_1.setBackground(new Color(250, 250, 210));
		txtpnTrminosYCondiciones_1.setBounds(25, 44, 281, 24);
		contentPane.add(txtpnTrminosYCondiciones_1);
		
		JTextPane txtpnTrminosYCondiciones_1_1 = new JTextPane();
		txtpnTrminosYCondiciones_1_1.setText("1. ACEPTACIÓN ");
		txtpnTrminosYCondiciones_1_1.setFont(new Font("Verdana", Font.BOLD, 13));
		txtpnTrminosYCondiciones_1_1.setBackground(new Color(250, 250, 210));
		txtpnTrminosYCondiciones_1_1.setBounds(25, 70, 498, 24);
		contentPane.add(txtpnTrminosYCondiciones_1_1);
		
		JTextPane txtpnTrminosYCondiciones_1_1_1 = new JTextPane();
		txtpnTrminosYCondiciones_1_1_1.setText("En el presente documento (en adelante, el “Contrato”) se establecen los términos y condiciones de Robert Half Internacional Empresa de Servicios Transitorios Limitada, con domicilio en Avenida Isidora Goyenechea 2800 Piso 15. Torre Titanium 7550-647 Las Condes, que serán de aplicación al acceso y uso por parte del Usuario de esta página web (el  “Sitio Web”). Les rogamos lean atentamente el presente Contrato. ");
		txtpnTrminosYCondiciones_1_1_1.setFont(new Font("Verdana", Font.PLAIN, 10));
		txtpnTrminosYCondiciones_1_1_1.setBackground(new Color(250, 250, 210));
		txtpnTrminosYCondiciones_1_1_1.setBounds(25, 97, 498, 82);
		contentPane.add(txtpnTrminosYCondiciones_1_1_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 128, 0));
		panel_1.setBounds(0, 0, 610, 40);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(0, 100, 0));
		panel.setBounds(0, 36, 614, 4);
		panel_1.add(panel);
		
		JTextPane txtpnTrminosYCondiciones_1_1_2 = new JTextPane();
		txtpnTrminosYCondiciones_1_1_2.setText("2. REQUISITOS RELATIVOS AL USUARIO");
		txtpnTrminosYCondiciones_1_1_2.setFont(new Font("Verdana", Font.BOLD, 13));
		txtpnTrminosYCondiciones_1_1_2.setBackground(new Color(250, 250, 210));
		txtpnTrminosYCondiciones_1_1_2.setBounds(25, 178, 297, 24);
		contentPane.add(txtpnTrminosYCondiciones_1_1_2);
		
		JTextPane txtpnTrminosYCondiciones_1_1_1_1 = new JTextPane();
		txtpnTrminosYCondiciones_1_1_1_1.setText("El Sitio Web y los servicios relacionados con el mismo se ofrecen a los Usuarios que tengan capacidad legal para otorgar contratos legalmente vinculantes según la legislación aplicable. ");
		txtpnTrminosYCondiciones_1_1_1_1.setFont(new Font("Verdana", Font.PLAIN, 10));
		txtpnTrminosYCondiciones_1_1_1_1.setBackground(new Color(250, 250, 210));
		txtpnTrminosYCondiciones_1_1_1_1.setBounds(25, 206, 485, 53);
		contentPane.add(txtpnTrminosYCondiciones_1_1_1_1);
		
		JTextPane txtpnTrminosYCondiciones_1_1_2_1 = new JTextPane();
		txtpnTrminosYCondiciones_1_1_2_1.setText("3. LICENCIA ");
		txtpnTrminosYCondiciones_1_1_2_1.setFont(new Font("Verdana", Font.BOLD, 13));
		txtpnTrminosYCondiciones_1_1_2_1.setBackground(new Color(250, 250, 210));
		txtpnTrminosYCondiciones_1_1_2_1.setBounds(25, 254, 297, 24);
		contentPane.add(txtpnTrminosYCondiciones_1_1_2_1);
		
		JTextPane txtpnTrminosYCondiciones_1_1_1_1_1 = new JTextPane();
		txtpnTrminosYCondiciones_1_1_1_1_1.setText("En este acto, RH otorga al Usuario una licencia limitada, no exclusiva, intransferible, no susceptible de cesión y revocable; para consultar y descargar, de forma temporal, una copia del contenido ofrecido en el Sitio Web, únicamente para uso personal del Usuario o dentro de su empresa, y nunca con fines comerciales. ");
		txtpnTrminosYCondiciones_1_1_1_1_1.setFont(new Font("Verdana", Font.PLAIN, 10));
		txtpnTrminosYCondiciones_1_1_1_1_1.setBackground(new Color(250, 250, 210));
		txtpnTrminosYCondiciones_1_1_1_1_1.setBounds(25, 279, 485, 62);
		contentPane.add(txtpnTrminosYCondiciones_1_1_1_1_1);
		
		JTextPane txtpnTrminosYCondiciones_1_1_2_1_1 = new JTextPane();
		txtpnTrminosYCondiciones_1_1_2_1_1.setText("4. INFORMACIÓN FACILITADA POR EL USUARIO ");
		txtpnTrminosYCondiciones_1_1_2_1_1.setFont(new Font("Verdana", Font.BOLD, 13));
		txtpnTrminosYCondiciones_1_1_2_1_1.setBackground(new Color(250, 250, 210));
		txtpnTrminosYCondiciones_1_1_2_1_1.setBounds(25, 340, 362, 24);
		contentPane.add(txtpnTrminosYCondiciones_1_1_2_1_1);
		
		JTextPane txtpnTrminosYCondiciones_1_1_1_1_1_1 = new JTextPane();
		txtpnTrminosYCondiciones_1_1_1_1_1_1.setText("El Sitio Web ofrece al Usuario un foro de obtención de empleo e información profesional. Al facilitar o introducir la información en el Sitio Web (“Información del Usuario”), el Usuario otorga a RH licencia y derecho permanente, no exclusivo, irrevocable, libre de royalties, durante el tiempo máximo permitido por la legislación aplicable, pero no le impone obligación de, utilizar, copiar, modificar, mostrar, distribuir, descargar, almacenar, reproducir, transmitir, publicar, vender, revender, adaptar ni crear productos derivados  en todo o en parte a partir de, la Información del Usuario, en ningún modo o manera. El Usuario reconoce y acepta que RH es solamente un foro pasivo a través del cual los usuarios pueden conseguir empleo o informarse a nivel profesional. RH no comprueba ni controla la Información del Usuario. En consecuencia, RH no asume garantía alguna en cuanto a la fiabilidad, precisión, integridad, validez o veracidad de la Información remitida por los usuarios. ");
		txtpnTrminosYCondiciones_1_1_1_1_1_1.setFont(new Font("Verdana", Font.PLAIN, 10));
		txtpnTrminosYCondiciones_1_1_1_1_1_1.setBackground(new Color(250, 250, 210));
		txtpnTrminosYCondiciones_1_1_1_1_1_1.setBounds(25, 366, 485, 188);
		contentPane.add(txtpnTrminosYCondiciones_1_1_1_1_1_1);
		
		JButton btnNewButton = new JButton("Volver");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFrame frame = new Registro();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(196, 587, 140, 31);
		contentPane.add(btnNewButton);
		
		fondo.setIcon(new javax.swing.ImageIcon("D:/MEDAC/Eclipse/prueba/src/imagenes/andalusia"));
	}
}
