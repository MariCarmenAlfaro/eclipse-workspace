import java.util.Scanner;

//Programa que lee un precio, lo muestra después en pantalla y le hace un 10% de descuento.

public class Ejemplo12 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escribe un precio y t hare el 10% descuento: ");
		
		float precio = entrada.nextFloat();
		
		
		System.out.println("El precio total son " + precio + " euros.");
		
		
		float precioRebajado = precio - (precio * 10/100);
		
		
		System.out.println("El precio rebajado es: " + precioRebajado);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
