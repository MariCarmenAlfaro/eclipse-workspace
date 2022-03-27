package ejerciciosarrays1;

import java.util.Scanner;

/*17.- Escribe una aplicación que pida al usuario diez precios de productos. Después devolverá el
precio total a pagar y el número de productos cuyo precio sea mayor de 10 euros*/
public class Ejer17 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double precios[]= new double[10];
		double totalE=0;
		double totalP=0;

		for (int i=0; i<precios.length;i++) {
			System.out.println("Dime el precio del producto " +  i );
			precios[i]= entrada.nextDouble();
		totalE= totalE+precios[i];
		if(precios[i]>100) {
			totalP++;
		}
		
		
		}
		System.out.println("El total de tus productos es de: "+ totalE);
		if (totalP >=1) {
		System.out.println("Y este es el numero de productos con un precio superior a 10 euros" + totalP);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
