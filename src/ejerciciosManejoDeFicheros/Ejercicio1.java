package ejerciciosManejoDeFicheros;

import java.io.FileWriter;
import java.io.PrintWriter;


public class Ejercicio1 {

	public static void main(String[] args) {
		
		
		FileWriter fichero = null;
		PrintWriter pw = null;
		try 
		{
		
			fichero = new FileWriter("C:\\Users\\1DAM.DESKTOP-DOKJE5I\\Desktop\\libros.xml");		
			pw = new PrintWriter(fichero);
					
			pw.println("<Libros><Libro><Titulo>100 años de soledad"
					+ "</Titulo></Libro></Libros>");
			
		}catch (Exception e) 
		{
			e.printStackTrace(); //si ocurre la excepción, imprime el registro del stack donde se ha iniciado
		}finally {
			try {
				if (null != fichero) 
					fichero.close(); //cierra el fichero
			}catch (Exception e2) 
			{
				e2.printStackTrace();
			}
		}

	}

}
