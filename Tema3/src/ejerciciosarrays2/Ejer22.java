package ejerciciosarrays2;

import java.util.Scanner;

/*22.- Escribe un programa que vaya preguntando y guardando en un array el nombre de un alumno y
sus notas de exámenes, trabajos y actitud en un trimestre. Así para tres alumnos. A continuación
mostrará una lista con el nombre de cada alumno y su nota de evaluación, que vendrá dada por la
fórmula
N=50⋅E+40⋅T+10⋅A
     100*/
public class Ejer22 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		
		String notas[][]=new String [3][4];
		
		System.out.println("¡Nota final del trimestre!\n--------------------------");
		System.out.println("Dime tu nombre, nota examenes, nota trabajos y tu nota de actitud y la calculamos.");
		for (int fila = 0; fila < notas.length; fila++) {
			System.out.print("\nNombre: ");
			notas[fila][0]=entrada.nextLine();
			
			System.out.print("Exámenes: ");
			notas[fila][1]=entrada.nextLine();
			
			System.out.print("Trabajos: ");
			notas[fila][2]=entrada.nextLine();
			
			System.out.print("Actitud: ");
			notas[fila][3]=entrada.nextLine();
		}
		
		System.out.println("\n!Resultados!\n--------------------");
		
		
		float calculo=0;
				for (int fila = 0; fila < notas.length; fila++) {
					
					 calculo= ((50*Float.parseFloat(notas[fila][1]))+(40*Float.parseFloat(notas[fila][2]))+(10*Float.parseFloat(notas[fila][3])))/100;
					System.out.print(notas[fila][0]+": "+calculo);
				
					System.out.println();
				}
				
	}

}
