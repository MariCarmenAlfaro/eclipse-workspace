package ejerciciosarrays3;

import java.util.Scanner;

/*1.- En una biblioteca pública necesitan un programa para ir rellenando las fichas de los libros. Los
datos a guardar de cada libro son: ISBN, título, autor y editorial.
Crea un programa que pida por consola 5 registros con los datos anteriores y los guarde en un array
llamado libros. Después de introducidos, deberá listar en pantalla los datos con el formato:
ISBN Título Autor Editorial*/

public class Act1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        String libros[][]= new String [5][4];
        for (int fila = 0; fila < libros.length; fila++) {
			System.out.print("ISBN: ");
			libros[fila][0]= entrada.nextLine();
			System.out.print("Titulo: ");
			libros[fila][1]= entrada.nextLine();
			System.out.print("Autor: ");
			libros[fila][2]= entrada.nextLine();
			System.out.print("Editorial: \n");
			libros[fila][3]= entrada.nextLine();
			
		}
        System.out.println("ISBN\tTitulo\tAutor\tEditorial\n---------------------------------");
        for (int fila = 0; fila < libros.length; fila++) {

		
			for (int col = 0; col < libros[0].length; col++) {
				System.out.print(libros[fila][col] + "\t");
			}

			System.out.println();
		}
       
	}
}


