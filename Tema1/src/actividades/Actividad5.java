package actividades;
import java.util.Scanner;
public class Actividad5 {

	public static void main(String[] args) {
 Scanner entrada = new Scanner (System.in);
 //Crea un programa que pida el nombre de un producto en venta, su precio y el descuento que se le debe hacer
 //Mostrada todos los datos junto al precio rebajado
		System.out.println("Nombre del producto: ");
		String producto = entrada.nextLine();
		
		System.out.println("Precio:");
		 float precio = entrada.nextFloat();
		 
		 System.out.println("Descuento a aplicar:");
		 float porcentaje = entrada.nextFloat();
		 float descuentoAplicado = porcentaje*precio/100;
		 System.out.println("El precio de " + producto + " con el descuento aplicado del precio "+ precio +" será de :" + (precio-descuentoAplicado));
		
	}

}
