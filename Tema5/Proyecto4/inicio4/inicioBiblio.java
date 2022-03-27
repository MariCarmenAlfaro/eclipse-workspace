package inicio4;

import java.util.Scanner;

import biblioteca4.Autor;
import biblioteca4.Libro;

public class inicioBiblio {

	public static void main(String[] args) {
		Scanner entrada =new Scanner (System.in);
		/*Autor aut1 = new Autor("Mari", "maricarmen@gmail.com", 2000);
		Autor aut2 = new Autor("Lito");
		System.out.println(aut1.toString());
		System.out.println();
		Libro lib1 = new Libro("Memorias de una salvaje", "123546jd", aut1);
		System.out.println(lib1.toString());*/
	
		//Preguntar cuantos autores tien el libro
		System.out.println("Alta libro");
		System.out.println("Cuantos autores tiene el libro?");
		int numAutores =entrada.nextInt();
		
		//Crear array autores con ese número de posiciones
		Autor autores[]=new Autor[numAutores];
		
		//Pedir los DATOS de un autor, crear un objto Autor, con esos datos,
		//añadirlo al array y repetir las veces necesarias
		for (int i = 0; i < autores.length; i++) {
			//Pedir datos autor
			entrada.nextLine();
			System.out.println("Nombre");
			String nombre =entrada.nextLine();
			
			System.out.println("Email");
			String email =entrada.nextLine();
			
			System.out.println("Año nacimiento");
			int anyo =entrada.nextInt();
			//crear objeto autor con los datos
			Autor autor = new Autor(nombre, email, anyo);
			//Añadirlo al array
			autores[i]=autor;
		}
		//Prueba
		for (int i = 0; i < autores.length; i++) {
			System.out.println(autores[i].toString()+"\n");
		}
		//Pedir el resto de datos del libro
		System.out.println("\nDatos del libro:");
		entrada.nextLine();
		System.out.println("Titulo:");
		String titulo =entrada.nextLine();
		System.out.println("ISBN:");
		String isbn =entrada.nextLine();
		System.out.println("Año actual: ");
		int anyoActual=entrada.nextInt();
		
		
		//Crear un objeto libro con todos los datos recogidos
		Libro libro= new Libro(titulo, isbn, autores);
		Libro.setAnyoActual(anyoActual);
		System.out.println(libro.toString());
		
		libro.muestraAutores();
	}

}
