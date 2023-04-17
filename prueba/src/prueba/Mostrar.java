package prueba;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;

import BBD.Conexion;

public class Mostrar {
	public void Muestra() {
		Conexion conexion = new Conexion();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
		
		try {
			cn = conexion.conectar();
			stm = cn.createStatement();
			rs = stm.executeQuery("SELECT * FROM usuariosreg");
			
			while (rs.next()) {
				String nombre = rs.getString(1);
				String dni = rs.getString(2);
				String apellidos = rs.getString(3);
				String direccion = rs.getString(4);
				String contraseña = rs.getString(5);
				String trato = rs.getString(6);
				String ciudad = rs.getString(7);
				
				System.out.println(nombre + " - " + apellidos + " - " + direccion + " - " + contraseña + " - " + dni + " - " + trato + " - " + ciudad );
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			try {
				if (rs!= null) {
					rs.close();
				}
				
				if (stm != null) {
					stm.close();
				}
				
				if (cn != null) {
					cn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
