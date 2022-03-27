package teoria;

import java.util.Scanner;

//Rellenar un array con valores leidos desde la consola
public class Ejemplo3b {

	public static void main(String[] args) {

		Scanner entrada =  new Scanner (System.in);
		float temp;
		float temperaturas []= new float [7];
		for (int i =0; i< temperaturas.length; i++) {
			System.out.println("temperatura del dia " +i);
			temperaturas[i]= entrada.nextFloat();
		}
		System.out.println("\nTemperaturas registradas durante la semana");	
		for (int i=0; i<temperaturas.length; i++) {
			System.out.println(temperaturas[i]+ "grados");
		}
	}

}
