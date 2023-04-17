package prueba;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;

import BBD.Conexion;

public class Comprobacion {
	public boolean Comprobar(String dniI,String contraseñaI) {
		Conexion conexion = new Conexion();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
		

		try {
			cn = conexion.conectar();
			PreparedStatement stm2 = cn.prepareStatement("SELECT COUNT(*) from usuariosreg WHERE dni = ?  AND contraseña= ?");
			stm2.setString(1 , dniI);
			stm2.setString(2 , contraseñaI);
			
			rs= stm2.executeQuery();

	           if(rs.next() && rs.getInt(1) > 0) {
	               return true;
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
		return false;

	}
	public boolean Comprobar2(String dniI) {
		Conexion conexion = new Conexion();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
		

		try {
			cn = conexion.conectar();
			PreparedStatement stm2 = cn.prepareStatement("SELECT COUNT(*) from usuariosreg WHERE dni = ?");
			stm2.setString(1 , dniI);
			
			rs= stm2.executeQuery();

	           if(rs.next() && rs.getInt(1) > 0) {
	               return true;
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
		return false;

	}
}
