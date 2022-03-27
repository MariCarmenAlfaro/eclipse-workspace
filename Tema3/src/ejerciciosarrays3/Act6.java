package ejerciciosarrays3;

import java.util.Scanner;

/*6.- Escribe un programa que lea desde consola los salarios de los 10 empleados de un pequeña
empresa y los vaya guardando en un array. A continuación el programa calculará y mostrará por
pantalla el salario mínimo, máximo y medio de los empleados. Así como la cantidad de empleados
que cobran más de 1500 € mensuales.*/
public class Act6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		float salarios[] = new float[5];
		int posMin = 0;
		int posMax = 0;
		int salarioAlto = 0;
		float suma = 0;

		for (int i = 0; i < salarios.length; i++) {
			System.out.println("Salario " + (i+1)+":");
			salarios[i] = entrada.nextFloat();

		}
		for (int i = 1; i < salarios.length; i++) {
			
			if (salarios[i] < salarios[posMin]) {
				posMin = i;
			}
			if (salarios[i] > salarios[posMax]) {
				posMax = i;
			}
suma= suma+salarios[i];
		}

		for (int i = 0; i < salarios.length; i++) {

			if (salarios[i] > 1500) {
				salarioAlto++;
			}

		}
		
		System.out.println("El salario mínmo es: " + salarios[posMin] + ", el salario más alto es: " + salarios[posMax]
				+ " y la media de lo que cobran es de: " + suma/salarios.length);

		System.out.println(
				"La cantidad de trabajadores que cobran más de 1500 euros son: " + salarioAlto + " trabajadores");
	}

}
