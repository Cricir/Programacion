package prueba;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;

import BBD.Conexion;

public class Borrar {
		public void borrarUsuario(String dnI) {
			Conexion conexion = new Conexion();
			Connection cn = null;
			PreparedStatement ps = null;
			
			try {
				cn = conexion.conectar();
				ps = cn.prepareStatement("DELETE FROM usuariosreg WHERE dni = ?");
				ps.setString(1, dnI);
				
				int resultado = ps.executeUpdate();
				
				if (resultado > 0) {
					System.out.println("El usuario con Dni:  " + dnI + " ha sido borrado");
				} else {
					System.out.println("No se encontró ningún usuario con el Dni: " + dnI);
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					if (ps != null) {
						ps.close();
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
