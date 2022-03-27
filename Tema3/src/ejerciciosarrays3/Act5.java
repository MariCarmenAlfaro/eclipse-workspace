package ejerciciosarrays3;

import java.util.Scanner;

/*5.- Escribe una aplicación para una caja registradora. Irá pidiendo una serie de precios y los irá
guardando en un array de 50 elementos (no es necesario que se rellene el array completo).
Cada vez que se introduzca un precio, el programa comprobará si la suma supera el valor 50 (que
estará guardado en una constante). A partir de ese momento, cada nuevo precio se guardará rebajado
un 10%.
Cuando el cajero escriba un valor negativo, el programa entenderá que ha terminado y mostrará la
lista de precios y el total que hay que cobrar al cliente..*/
public class Act5 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		float precios[] = new float[50];
		float totalE = 0;
		boolean descuento = false;
		final float CONDICION_REBAJA = 50;

		System.out.println("¡La compra del mes! Pase los productos-->");
		// Leemos los precios
		for (int i = 0; i < precios.length; i++) {
			System.out.print("Precio " + (i+1)+":");
			float precioActual = entrada.nextFloat();
			
			if(precioActual < 0) {
				//Si ekl precio es negativo hemos terminado
				break;
			}

			if (totalE > CONDICION_REBAJA) {
				//si la suma acumulada psa de 50 euros, guardamos el precio rebajado
				descuento = true;
				
			} 
			if(descuento) {
				precios[i] = precioActual * 0.9F;
			}else {
				// por defecto lo dejamos igual
				precios[i] = precioActual;
			}
			totalE = totalE + precios[i];
			
		}
	System.out.println("\nTicket de la compra\n--------------------");
		for (int i = 0; i < precios.length; i++) {
			if (precios[i]==0) {
				break;
			}
			System.out.println( precios[i] + "€");
		
		}
		System.out.println("Total de su compra: " + totalE + "€\nGracias por la visita!");

	}


}
