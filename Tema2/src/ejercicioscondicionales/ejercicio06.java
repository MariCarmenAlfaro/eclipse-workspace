package ejercicioscondicionales;
//6.- Crea una aplicación que pregunte el precio de un producto y el número de unidades compradas.
//Si el coste de la compra es mayor de 75 €, se le hará un 15% de descuento. En caso contrario, se le
//hará sólo un 5% de descuento
import java.util.Scanner;
public class ejercicio06 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Dime el precio: ");
		float precio = entrada.nextFloat();
		System.out.println("Unidades deseadas");
		int unidad = entrada.nextInt();
		
		if (precio*unidad >75) {
			System.out.println("El total será de: " + (precio*unidad)*0.85F);
		}else {
			System.out.println("Su precio será de: " + (precio*unidad)*0.95F);
		}
		
		
		
	}
}
