package taller1;
/*
Nicolas Porras - 21591707-K - ITI
Fernando Garcia - 21836966-9 - ITI

*/
import java.io.*;
import java.util.*;

public class Taller1 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		
		Scanner teclado = new Scanner(System.in);
		
		int x = 0;
		
		
		
		
		
		do{
			imprimir();
			
			String op = teclado.nextLine();
			System.out.println();
			
			
			switch (op){
			case "1":
				
				try {
					
					cargarAlumn();
					cargarSoli();

				} catch (Exception e) {
					// TODO: handle exception
					
					System.out.println("archivo inexistente");
				}
				
				break;
			
			case "2":
				try {
					
					procesarSoli();
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("sin archivos");
				}
				
				break;
				
			case "3":
				
				break;
				
				
			case "4":
				
				break;
				
			case "5":
				
				break;
				
			case "6":
				
				break;
				
			case "7":
				
				x++;
				System.out.println("saliendo...");
				break;
				
			default:
				
				System.out.println("ERROR");
				
				
				break;
				
			}
			
				
			
			
			
			
			
			
			
			
		
		
		
		
		
		
		
		
		
		

		} while (x==0);
	}
	
	
	
	public static void imprimir() {
		
		
		System.out.println("==== Sistema de Control del Grupo POO ==");
		System.out.println("1) Cargar archivos (Alumnos y solicitudes)");
		System.out.println("2) Procesar solicitudes (Filtrado automatico)");
		System.out.println("3) Inscripcion manual al grupo");
		System.out.println("4) Administracion del curso");
		System.out.println("5) Generar reportes");
		System.out.println("6) Analisis estadisticos");
		System.out.println("7) Salir");
		System.out.print("> ");
		
		
	}
	
	public static void cargarSoli() throws IOException {
		int i = 0;
		File arch = new File("txt/Solicitudes.txt");
		Scanner lector = new Scanner(arch);
		
		while (lector.hasNextLine()) {
			
			String line = lector.nextLine();
			String[] part = line.split("-");
			
			String name = part[0];
			String apellido = part[1];
			
			i++;
			
		}
		
		System.out.println(i+ " Solicitudes de ingreso.");
		
		
	}
	
	public static void cargarAlumn() throws IOException{
		int i = 0;
		File arch = new File("txt/Alumnos.txt");
		Scanner lector = new Scanner(arch);
		
		
		
		while (lector.hasNextLine()) {
			
			String line = lector.nextLine();
			String[] part = line.split(";");
			
			String name = part[0];
			String apellido = part[1];
			String rut = part[2];
			String paralelo = part[3];
			
			i++;
			
			
		}
		System.out.println("Carga exitosa");
		System.out.println(i+" alumnos en la lista.");
		
		lector.close();
		
	}


	public static void procesarSoli() throws IOException{
		
		
		String[] rechazados = new String[50];
		String[] aceptados = new String[50];
		
		File arch = new File("txt/Solicitudes.txt");
		File arch2 = new File("txt/Alumnos.txt");
		Scanner lector = new Scanner(arch);
		Scanner lector2 = new Scanner(arch2);
		
		int j = 0;
		int h = 0;
		
		while (lector.hasNextLine()) {
			
			String line = lector.nextLine();
			String[] part = line.split("-");
			String name = part[0];
			String apellido = part[1];
			
			
			while (lector2.hasNextLine()) {
				
				String line2 = lector2.nextLine();
				String[] part2 = line2.split(";");
				String name2 = part2[0];
				String apellido2 = part2[1];
				String rut = part2[2];
				String paralelo = part2[3];
				
				
				if(name.equals(name2) && apellido.equals(apellido2)) {
					//System.out.println("hola0");
					
					aceptados[j] = name + " " + apellido + " " +rut + " " + paralelo;
					System.out.println("[OK]	"+name + " " + apellido +" -> admitido en " + paralelo);
					j++;
					
					break;
					
					
					
				} else if(!name.equals(name2) && !apellido.equals(apellido2)){
					
					rechazados[h] = name + " " + apellido;
					System.out.println("[Rechazado]	"+name + " " + apellido +" -> no pertenece a ningun paralelo ");
					//System.out.println("hola1");
					h++;
					break;
					
				}
				
				
			
			}
			
			
			
			
		}
			
		
			                                
		
		
	}
	
	
	
	

}
