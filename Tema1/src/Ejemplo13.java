import java.util.Scanner;

public class Ejemplo13 {

	public static void main(String[] args) {
		
	
		//Programa que lee un precio, lo muestra después en pantalla y le hace un 10% de descuento.
		//Ademas, muestra la cantidad descontada
    
      
     Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escribe un precio y te hare el 10% descuento: ");
		
		float precio = entrada.nextFloat();
		
		
		System.out.println("El precio total son " + precio + " euros.");
		
		float descuento = precio * 10/100;	
		float precioRebajado = precio - descuento;
		
		
		System.out.println("El precio rebajado es: " + precioRebajado + " 5euros.");
				
		
		
		System.out.println("El descuento es de: " + descuento + " euros.");
		
				
	}

}
