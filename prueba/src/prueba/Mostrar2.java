package prueba;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;

import BBD.Conexion;

public class Mostrar2 {
	private JTable tablaUsuarios;
	public Mostrar2(JTable tablaUsuarios) {
        this.tablaUsuarios = tablaUsuarios;
    }
	public void Muestra() {
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("nombre");
		modelo.addColumn("apellidos");
		modelo.addColumn("direccion");
		modelo.addColumn("contraseña");
		modelo.addColumn("dni");
		modelo.addColumn("trato");
		modelo.addColumn("ciudad");

		try {
			Conexion conexion = new Conexion();
			Connection cn = conexion.conectar();
			Statement stm = cn.createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM usuariosreg");

			while (rs.next()) {
		
				Object[] fila = new Object[7];
				fila[0] = rs.getString("nombre");
				fila[1] = rs.getString("apellidos");
				fila[2] = rs.getString("direccion");
				fila[3] = rs.getString("contraseña");
				fila[4] = rs.getInt("dni");
				fila[5] = rs.getString("trato");
				fila[6] = rs.getString("ciudad");
		
				modelo.addRow(fila);
			}

			tablaUsuarios.setModel(modelo);
		
			rs.close();
			cn.close();
			stm.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
