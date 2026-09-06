package taller1;

import java.io.*;
import java.util.*;

public class Taller1 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		
		imprimir();
		
		int op = Integer.valueOf(teclado.nextLine());
		
		
		
		//opciones(op);
		
		
		
		
		
		
		
		
		
		

	}
	
	
	public static boolean imprimir() {
		
		
		System.out.println("==== Sistema de Control del Grupo POO ==");
		System.out.println("1) Cargar archivos (Alumnos y solicitudes)");
		System.out.println("2) Procesar solicitudes (Filtrado automatico)");
		System.out.println("3) Inscripcion manual al grupo");
		System.out.println("4) Administracion del curso");
		System.out.println("5) Generar reportes");
		System.out.println("6) Analisis estadisticos");
		System.out.println("7) Salir");
		System.out.print("> ");
		
		return false;
	}
	
	/*public static boolean opciones(int op) throws FileNotFoundException {
		
		

		switch (op) {
		case 1:
			
			File alumnos = new File("../GitHub/TallerPoo/taller1/Alumnos.txt");
			
			File registros = new File("../GitHub/TallerPoo/taller1/Registros.txt"); 
			Scanner lector = new Scanner(alumnos);
			Scanner lector2 = new Scanner(registros);
			
			while (lector.hasNextLine()) {
				
				String linea = lector.nextLine();
				
				System.out.println("line: ´"+ linea+"´");
				
			}
			
			
			break;

		case 2:
			
			
			
			break;
			
			
		case 3:
			
			break;
			
			
			
		case 4:
			break;
		}
		
		
		
		
		
		
		return false;
	} */

}
