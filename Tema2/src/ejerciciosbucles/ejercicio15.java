package ejerciciosbucles;

import java.util.Scanner;

// un prog que solicite al usuario los precios de 4 objetos y devuelva el precio total
public class ejercicio15 {

	public static void main(String[] args) {
Scanner entrada = new Scanner (System.in);
float precio;
float total=0;
		for (int i=1; i <=4;i++ ) {
			System.out.println("Precio "+i+":");
  precio= entrada.nextFloat();
  total = total+precio;
		}
		System.out.println("Total compra " + total);
		
		
	}

}
