package actividades;
import java.util.Scanner;
public class Actividad6 {

	public static void main(String[] args) {
//EScribe una aplicacion que pida el nombre del producto, su precio y el numero de unidades vendidas
		//y devuelve el coste total de la compra
		Scanner entrada= new Scanner (System.in);
		
		System.out.println("Nombre del producto: ");
			String producto = entrada.nextLine();
			System.out.println("Precio del producto:");
		float precio = entrada.nextFloat();
		
		System.out.println("Unidades deseadas:");
		int unidades = entrada.nextInt();
		float costeTotal = precio*unidades;
		System.out.println("Coste final de " + producto+ " es de " + costeTotal + "€");
		
		
	}

}
