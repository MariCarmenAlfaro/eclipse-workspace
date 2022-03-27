package ejemplo10Excepciones;

import java.util.Scanner;

public class Division {
	public static void main(String[] args) {
		Scanner entrada= new Scanner (System.in);
		System.out.println("Dime un numero y dividire 20 entre él");
		System.out.println("Numero");
		String numero = entrada.nextLine();
		try {
			 int num=Integer.parseInt(numero);
		 System.out.println("\nLa división de 20 entre "+num+" da "+20/num);
		}catch (NumberFormatException ex) {
			System.out.println("¡Debes introducir un número entero!");
		}catch(ArithmeticException ex) {
			System.out.println("¡No se puede dividir entre 0!");
		}
		
	}
}
