package ejercicioscondicionales;
//3.- Modifica el ejercicio anterior de manera que si la compra es inferior a 5 €, se sumen 2 euros a la
//factura por gastos de gestión.

	import java.util.Scanner;

public class ejercicio03 {
	public static void main(String[] args) {
 Scanner entrada = new Scanner (System.in);
 System.out.println("Precio: ");
 float precio = entrada.nextFloat();

  float precioFinal = precio;
  if (precio <5) {
	  precioFinal = precio +2;
  }
  if (precio >80) {	
		precioFinal = precio- precio*10/100;
		
	} 
 
		System.out.println("precio final" + precioFinal);
	}

}
