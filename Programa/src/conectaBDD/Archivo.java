package conectaBDD;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


/*
 * Generar archivo plano con los datos de registro de la Base de datos.
 */

public class Archivo {
	
	public void cargarDatos() {
	
		File archivo = new File("./data/Archivo_Registros.txt");
		
		try {
			FileWriter fr = new FileWriter(archivo, true);
			fr.write("Sigrid");
			fr.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

 }
}
