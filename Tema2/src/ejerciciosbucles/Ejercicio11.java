package ejerciciosbucles;

import java.util.Scanner;

//11.- Escribe un programa que pregunte un número entre 1 y 20. Si el número
//introducido no cumple la condición, se le volverá a preguntar hasta que la cumpla. Al final simplemente
//se mostrará el número en pantalla.
public class Ejercicio11 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		System.out.println("Dime un numero entre el 1 y el 20");
		int num;
		do {
			System.out.println("Que este entre 1 y 20 porfavor");
			num = entrada.nextInt();
		}while(num <1 || num >20);
		
		System.out.println("Gracias");
	}

}
