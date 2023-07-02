package Principal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestExcepcionesComprobadas {

	public static void main(String[] args) {
		
		try {
			File file = new File("archivo.txt");
			//Leer el archivo
			Scanner scanner = new Scanner(file);
			
		} catch (FileNotFoundException e) {
			System.out.println("El Archivo no existe.");
		}

	}

}
