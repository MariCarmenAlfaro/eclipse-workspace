
import java.util.Scanner;

         //programa que pregunta un precio de producto y si es mayor de 50e, te dice que tienes descuento
public class ejemplo02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
        // preguntar el precio del producto
		System.out.println("�Cuanto cuesta el producot?");
		
		float precio = entrada.nextFloat();
		
		//comprobamos si el precio supera los 50e y si eso indicamos q tiene descuento
		if (precio >50) {
			System.out.println ("Tienes un descuento");
		}
		System.out.println("Gracias por la compra");
		
		
		
		
		
	}

}
