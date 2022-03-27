package ejerciciosarrays1;

import java.util.Scanner;

/*10.- Crea un programa que lea los precios de hasta cien productos y los guarde en un array llamado
compra. Mientras los precios se van pidiendo al usuario, si éste introduce el valor 0, el programa
entenderá que se ha terminado la compra, y mostrará todos los precios introducidos hasta el
momento (no las posiciones vacías).*/
public class Ejer10B {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float compra[] = new float[100];
		int i = 0;
		int j =0;
		while (i < compra.length && compra[i - 1] != 0) {
			System.out.print("Dime el precios de tus productos");
			compra[i] = entrada.nextFloat();
			
			i++;
		}
		for (int i = 0; i < compra.length; i++) {
			if (compra[i]!=0) {
				System.out.println("Los precios de tu compra" +compra[i]);
			}else {
				break;
			}
		}
System.out.println("Gracias por comprar aqui");
	}

}
