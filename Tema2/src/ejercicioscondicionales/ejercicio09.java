package ejercicioscondicionales;
//9.- Crea un programa que pregunte el precio de un producto y el número de unidades compradas. Si 
//el coste de la compra es menor de 100 €, el cliente no tiene derecho a un descuento. Si el coste
//sobrepasa los 200 €, el descuento será del 15%. De lo contrario será del 10% solamente
import java.util.Scanner;
public class ejercicio09 {
	public static void main(String[] args) {
 Scanner entrada = new Scanner (System.in);

 System.out.println("Precio: ");
 float precio = entrada.nextFloat();

 System.out.println("unidades: ");
		int unidades = entrada.nextInt();
		
		float coste= precio*unidades;
		float precioFinal = coste;
		if (coste  <100) {
			System.out.println("No tiene descuento");
			
		} else if (coste <200){
			precioFinal = coste *0.85F;
					System.out.println("Tiene un 10%");
		}else if ((precio+unidades) >200) {
			precioFinal = coste * 0.90F;
			System.out.println("Tienes 15%");
		}
		}
		
		
		
		
		
		
	}


