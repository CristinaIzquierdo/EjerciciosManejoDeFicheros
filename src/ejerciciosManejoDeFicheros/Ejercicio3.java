package ejerciciosManejoDeFicheros;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio3 {

	public static void main(String[] args) {
		try(FileWriter fw=new FileWriter("C:\\Users\\1DAM.DESKTOP-DOKJE5I\\Desktop\\fichero1.txt");
				FileReader fr = new FileReader("C:\\Users\\1DAM.DESKTOP-DOKJE5I\\Desktop\\fichero1.txt")){
					
					fw.write("100 años de soleda");
					fw.write(100);
					
					fw.flush();
					
					int valor = fr.read();
					while(valor!=-1) 
					{
						System.out.println((char)valor);
						valor = fr.read();
					}
				} catch (IOException e) 
				{
					System.out.println("error");
				}

	}

}
