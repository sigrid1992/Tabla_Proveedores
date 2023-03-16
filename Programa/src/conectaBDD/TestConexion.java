package conectaBDD;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConexion {

	public static void main(String[] args) {
		
		Conexion conexion = new Conexion();
		Connection conect = null;
		Statement stm = null;
		ResultSet result = null;
		
		try { 
			
			conect = conexion.conectarBBD();
			stm = conect.createStatement();
			result = stm.executeQuery("SELECT * FROM proveedores");
			
			while(result.next()) {
				int id_proveedores = result.getInt(1);
				String Nombre = result.getString(2);
				Date FechaDeAlta = result.getDate(3);
				int id_cliente = result.getInt(4);
				
				System.out.println(id_proveedores + " : " + Nombre + " ; " + FechaDeAlta + " ; " + id_cliente);


			}
		}catch (SQLException e) {
			
		} finally {
			
			try {
				
				if (result!= null) {
					result.close();
				}
				
				if (stm != null) {
					stm.close();
				}
				
				if (conect != null) {
					conect.close();
				}
				
			} catch (Exception e2) {
				
			}
		}
	}

}
