package ejerciciosManejoDeFicheros;

import java.io.*;

public class Ejercicio2 {
	
	public static void main(String[]args) 
	{
		try
		{
	
			FileWriter fw=new FileWriter("C:\\fichero1.txt");
			FileReader fr=new FileReader("C:\\fichero1.txt");
			
			fw.write("Cien años de soleda");
			fw.write(100);			
			fw.flush();
			
			int valor = fr.read();
			while(valor!=-1) 
			{
				System.out.println((char)valor);
				valor = fr.read();
			}
			
			fw.close();
			fr.close();
		
			
		} catch(IOException e) 
		{
			System.out.println("Error");
		}
	}
}