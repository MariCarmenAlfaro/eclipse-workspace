package teoria;

import java.util.Scanner;

public class Ejemplo4 {

	public static void main(String[] args) {
Scanner entrada = new Scanner (System.in);

		//Tallas de zapatos de 20 personas
		
		double tallas[] = {40, 38, 42, 43, 41, 37, 43, 44.5, 46, 46, 36.5, 38.5,
				40, 39, 40, 41, 41.5, 48, 40.5};
		System.out.println("Introduzca uan talla: ");
		double talla= entrada.nextDouble();
		//buscamos esa talla en el array
		boolean encontrada = false;
		
		//Recorremos el array 
		for(int i =0; i<tallas.length;i++) {
			if (tallas[i]==talla) {
				encontrada=true;
				break;
			}
		}
		
		if (encontrada) {
			System.out.println("Se ha encontrado vuestra talla");
		}else {
			System.out.println("No se ha encontrado la talla solicitada");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
