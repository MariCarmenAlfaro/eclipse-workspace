package ejerciciosbucles;

import java.util.Scanner;

public class ejercicio9B {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Dame un número.");
		int num1 = entrada.nextInt();
		
		System.out.println("Dame otro número.");
		int num2 = entrada.nextInt();
		
		boolean resta = true;
		int resultado = num1-num2;
		System.out.println(num1 + " - "+num2+" = "+resultado);
		while (resta) {
			if (resultado > 0) {
				System.out.println(resultado+" - "+num2+" = "+resultado);
				resultado = resultado - num2;
				
			}else if (resultado < 0) {
				resta = false;
			}

		}
		
	}

}