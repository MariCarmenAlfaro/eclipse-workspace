package ejercicioscondicionales;
//12.- Crea una aplicaci�n que pida el n�mero de mes y devuelva el nombre del mes (basta que lo
//haga para los meses de enero a abril).

import java.util.Scanner;

public class ejercicio12 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
   System.out.println("Dime un numero y te dir� que mes es: ");
    int mes = entrada.nextInt();
    if (mes == 1) {
		  System.out.println("Es Enero");
	  } else if (mes ==2) {
		  System.out.println("Es Febrero");
	  } else if (mes ==3) {
		  System.out.println("Es Marzo");
	  }else  {
		  System.out.println("Es Abrl");
	  
	}
	}
}
