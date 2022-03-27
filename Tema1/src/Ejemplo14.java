import java.util.Scanner;

public class Ejemplo14 {

	public static void main(String[] args) {
		
	
		//Programa que lee un precio, lo muestra después en pantalla y le hace un 10% de descuento.
		//Ademas, muestra la cantidad descontada
    
      
     Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escribe el precio: ");
		
		float precio = entrada.nextFloat();
		
		System.out.println("Escribe el descuento que quieras aplicar: ");
		float porcentajeDescuento= entrada.nextFloat();
		
		System.out.println("Elprecio es: " + precio + "€ " + porcentajeDescuento + "%");
		
		float descuento = precio * porcentajeDescuento/ 100;
		
		float precioRebajado = precio-descuento;
		 System.out.println("El precio con el descuento aplicado es de: " + precioRebajado );
		
		
				
	}



}
