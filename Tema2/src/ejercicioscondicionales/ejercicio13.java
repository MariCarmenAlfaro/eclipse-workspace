package ejercicioscondicionales;
//13.- Modifica el programa anterior para s�lo haga el proceso si el n�mero de mes que se ha
//introducido est� entre 1 y 4

import java.util.Scanner;

public class ejercicio13 {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);

		 System.out.println("Dime un numero y te dire que mes es: ");
		    int mes = entrada.nextInt();
		    switch (mes) {
			 case 1:
				 System.out.println("Enero");
			 break;
			 case 2:
				 System.out.println("Febrero");
			 break;
			 case 3:
				 System.out.println("Marzo ");
			 break;
			 case 4:
				 System.out.println("Abril");
			 break;
		default :
			System.out.println("No existe");


		    }
		
		
		
	}

}
