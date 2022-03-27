package hoja2ejercicios;

import java.util.Scanner;

//4.- Utiliza un bucle for para preguntar 5 veces por un número entero, y al final devolver la frase
//"Has fallado"
public class Ejer4 {
	public static void main(String[] args) {
Scanner entrada = new Scanner (System.in);
 System.out.println("Adivina el numero!");
    int num;
		for (int i=1;i<=5; i++ ) {
			System.out.println("Numero?");
		num =entrada.nextInt();
		}
		System.out.println("Has fallado!");
		
		
		
	}

}
