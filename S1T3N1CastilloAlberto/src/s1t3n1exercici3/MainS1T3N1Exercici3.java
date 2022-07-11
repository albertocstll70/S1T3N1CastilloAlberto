package s1t3n1exercici3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MainS1T3N1Exercici3 {

	

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String nombreUsuario;
		final int REPETICION=10;//numero de veces que le preguntara al usuario
		

		System.out.println("Introduce tu nombre");
		nombreUsuario = scan.nextLine();

		
		String path;//variable para almacenar la ruta donde se encuentra el archivo
		String archivoPaisCapital = "Countries.txt";
		String archivoPuntuacion = "classificacio.txt";

		path = System.getProperty("user.dir") + File.separator + "src" + File.separator + "s1t3n1exercici3";

		HashMap<String, String> paisCapital = new HashMap<String, String>();

		//funcion que le el archivo y almacena en un hashMap
		leerArchivoAddHashMap(path + File.separator + archivoPaisCapital, paisCapital);

		List<String> paisList = new ArrayList<String>(paisCapital.keySet());//lista de paises
		int i = REPETICION;
		int puntuacion = 0;
		String capital;

		
		
		while (i >= 1) {

			int randomIndex = new Random().nextInt(paisList.size());
			String randomPais = paisList.get(randomIndex);
			System.out.println("Cual el la capital de: " + randomPais);
			 capital = scan.nextLine();
			 

			if (paisCapital.get(randomPais).equalsIgnoreCase(capital)) {
				puntuacion++;

			}

			i--;
		}

		scan.close();
		
		String nomYPuntuacion = nombreUsuario + "-----------  " + puntuacion+"\n";

		escribir(nomYPuntuacion, path + File.separator + archivoPuntuacion);
		
		System.out.println("*******Historico de Puntuaciones********** ");
		leerArchivo( path + File.separator + archivoPuntuacion);

	}
	//funcion que lee el  un archivo y  almacena en un hashMap
	public static void leerArchivoAddHashMap(String path, HashMap<String, String> paisCapital) {

		try (FileReader entrada = new FileReader(path)) {

			BufferedReader leer = new BufferedReader(entrada);

			String linea = "";
			String pais = "";
			String capital = "";
			int i = 1;

			while (linea != null) {

				linea = leer.readLine();
				if (linea != null) {
					StringTokenizer st = new StringTokenizer(linea);
					i = 1;
					while (st.hasMoreTokens()) {
						if (i == 1) {
							pais = st.nextToken();

						} else {
							capital = st.nextToken();

						}
						i++;

					}
					paisCapital.put(pais, capital);

				}
			}

		} catch (IOException e) {

			System.out.println(" No se encontro el archivo");
		}

	}

	//funcion que escribe en un archivo no existe lo crea
	public static void escribir(String nomYPuntuacion, String path) {

		try {
			try (FileWriter escribiendo = new FileWriter(path, true)) {
				
				for (int i = 0; i < nomYPuntuacion.length(); i++) {
					escribiendo.write(nomYPuntuacion.charAt(i));

				}
			}

		} catch (IOException e) {

			e.printStackTrace();
		}

	}
	// funcion que lee un archivo lienea a linea
	public static void leerArchivo(String path) {
		
	
		try (FileReader entrada = new FileReader(path)) {

			BufferedReader leer = new BufferedReader(entrada);

			String linea = "";
			
		

			while (linea != null) {

				linea = leer.readLine();
				if (linea != null) {
					
					System.out.println(linea);
				}
			}

		} catch (IOException e) {

			System.out.println(" No se encontro el archivo");
		}

	
	}
}
