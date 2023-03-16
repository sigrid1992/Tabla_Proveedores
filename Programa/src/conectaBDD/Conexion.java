package conectaBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Conexion BBDD con Java
 */

public class Conexion {
	
	
	private static final String CONTROLADOR = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/proveedores";
	private static final String USUARIO = "root";
	private static final String CLAVE = "root";
	
	static {
		try {
			
			Class.forName(CONTROLADOR);
					
		} catch (ClassNotFoundException e) {
			
			System.out.println("Error al cargar el controlador MySQL");
			e.printStackTrace();
		}
	}
	
// Conexión con el conector JDBC y su Driver.
	public Connection conectarBBD() {
		Connection conexion = null;
		
		try { 
			
			conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/proveedores" , "root" , "root");
			
			System.out.println("Conexión establecida.");
			
		} catch (SQLException e) {

// Se recoge el error en una excepción en caso de que la conexión falle.
			
			System.out.println("Error en la conexión");
			e.printStackTrace();
		}
		
		return conexion;
	}


}
