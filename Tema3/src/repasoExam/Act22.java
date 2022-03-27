package repasoExam;

import java.util.Iterator;
import java.util.Scanner;

/*22.- Escribe un programa que vaya preguntando y guardando en un array el nombre de un alumno y
sus notas de exámenes, trabajos y actitud en un trimestre. Así para tres alumnos. A continuación
mostrará una lista con el nombre de cada alumno y su nota de evaluación, que vendrá dada por la
fórmula:*/
public class Act22 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String notas [][]= new String [3][4];
		for (int fila = 0; fila < notas.length; fila++) {
			System.out.print("Nombre");
			notas[fila][0]=entrada.nextLine();
			System.out.print("Examenes");
			notas[fila][1]=entrada.nextLine();
			System.out.print("Trabajos");
			notas[fila][2]=entrada.nextLine();
			System.out.print("Actitud");
			notas[fila][3]=entrada.nextLine();
		}
		float calculo=0;
		for (int fila = 0; fila < notas.length; fila++) {
			calculo= ((50*Float.parseFloat(notas[fila][1]))+(40*Float.parseFloat(notas[fila][2]))+(10*Float.parseFloat(notas[fila][3])))/100;
			System.out.println("Resultados: "+calculo);
		}
	}
}
