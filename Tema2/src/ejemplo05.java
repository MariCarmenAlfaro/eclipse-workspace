import java.util.Scanner;

public class ejemplo05 {

	public static void main(String[] args) {

		
		Scanner entrada = new Scanner(System.in);
        // preguntar el precio del producto
		System.out.println("¿Cuanto cuesta el producot?");
		
		float precio = entrada.nextFloat();
		
		//comprobamos si el precio supera los 50e y si eso indicamos q tiene descuento
		if (precio >50) {
			System.out.println ("Tienes un descuento");
		} else {
			System.out.println("No tiene derecho a descuento");
		}
		System.out.println("Gracias por la compra");
	}

}
