package ejerciciosarrays2;

import java.util.Scanner;


public class Ejer19 {

	public static void main(String[] args) {
		// 4 empleados y 3 datos para cada empleado
		String nominas[][] = new String[4][3];
		Scanner entrada = new Scanner(System.in);
		for (int fila = 0; fila < nominas.length; fila++) {
           System.out.println("\nEmpleado nº "+fila);
           System.out.println("--------------------");
		System.out.print("Nombre: ");
		nominas[fila][0]= entrada.nextLine();
		System.out.print("Apellidos: ");
		nominas[fila][1]= entrada.nextLine();
		System.out.print("sueldo: ");
		nominas[fila][2]= entrada.nextLine();
		
		}
		/*System.out.println("Nombre--Apellido---Sueldo");
		for (int fila = 0; fila < nominas.length; fila++) {

			
			for (int col = 0; col < nominas[0].length; col++) {
				System.out.print(nominas[fila][col] + "\t");
			}

			System.out.println();

		*/
		for (int fila = 0; fila < nominas.length; fila++) {

			System.out.printf("%-10s %-15s %5s",
					nominas[fila][0],nominas[fila][1],
					nominas[fila][2]);

			System.out.println();

		}
		float total=0;
		for (int fila = 0; fila < nominas.length; fila++) {
			total=total+ Float.parseFloat(nominas[fila][2]);
		}
		System.out.println("\nEl total de sueldos que paga la empresa es de: "+total+"e");

	}

}
