package prueba;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;

import BBD.Conexion;

public class Agregar {
	public void Registrar(String nombreI,String dniI,String apellidosI,String direccionI,String contraseñaI,String tratoI,String ciudadI) {
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
			
		} catch (SQLException e1) {
			e1.printStackTrace();
			
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
		
		try {
			cn = conexion.conectar();
			PreparedStatement stm2 = cn.prepareStatement("INSERT INTO usuariosreg(nombre,apellidos,direccion,contraseña,dni,trato,ciudad) VALUES (?,?,?,?,?,?,?)");
			stm2.setString(1 , nombreI);
			stm2.setString(2 , dniI);
			stm2.setString(3 , apellidosI);
			stm2.setString(4, direccionI);
			stm2.setString(5, contraseñaI);
			stm2.setString(6, tratoI);
			stm2.setString(7, ciudadI);
			stm2.executeUpdate();
			
		} catch (SQLException e1) {
			e1.printStackTrace();
			
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
