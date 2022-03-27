package inicio;

import java.util.Scanner;

import conversor.Conversor;

public class InicioConv {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// Pregunta una cantidad en km y las pase a millas
		System.out.print("Escribe una cantidad en km y te diré cuantas millas son");
		double kilom = entrada.nextDouble();
		System.out.println("\nSon " + Conversor.millas(kilom) + " millas");
		
		System.out.print("\nEscribe una cantidad en millas y te diré cuantos km son");
		double milla = entrada.nextDouble();
		System.out.println("\nSon " + Conversor.km(milla) + " kilómetros");
		
		System.out.print("\nEscribe una cantidad en atmosferico y te diré cuantos milibares son");
		double atmosf = entrada.nextDouble();
		System.out.println("\nSon " + Conversor.mb(atmosf) + " millibares");
		
		System.out.print("\nEscribe una cantidad en milibares y te diré cuantos atmosfericos son");
		double milib = entrada.nextDouble();
		System.out.println("\nSon " + Conversor.atm(milib) + " atmosfericos");
		
		System.out.print("\nEscribe una cantidad en calorias y te diré cuantos julios son");
		double julio = entrada.nextDouble();
		System.out.println("\nSon " + Conversor.cal(julio) + " julios");
		
		System.out.print("\nEscribe una cantidad en julios y te diré cuantos calorias son");
		double caloria = entrada.nextDouble();
		System.out.println("\nSon " + Conversor.julios(caloria) + " calorias");
	}
}
