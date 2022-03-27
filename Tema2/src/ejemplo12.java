import java.util.Scanner;

public class ejemplo12 {

	public static void main(String[] args) {
		 {

		 Scanner entrada= new Scanner(System.in);
		 
		 System.out.println("Precio del producto: ");
				float precio = entrada.nextFloat();
				
				float precioRebajado = precio;
				
				//if (precio >80) {	
				//	precioRebajado = precio- precio*10/100;
					 
			//	}  
				precioRebajado = precio > 80 ? (precio - precio * 10/100) : precio;
				System.out.println("Este sera su precio con un 10% : " + precioRebajado);
				//Operador ternario
				 
			}

		}
	}

