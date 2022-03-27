package ejerciciosbucles;
//3.- Escribe una aplicación que pregunte repetidamente un número entero hasta que el usuario 
//escriba un valor entre 1 y 10. A continuación el programa escribirá un mensaje informando del número introducido.
import java.util.Scanner;
public class ejercicio03 {
	public static void main(String[] args) {
		 //pedir numero entre 1 y 10
 Scanner entrada = new Scanner (System.in);
 System.out.println("Dime un numero entre 1 y el 10");
		int numero = entrada.nextInt();
         //si el numero no es valido, lo volvemos a pedir
		
		while (numero <1 || numero >10 ) {
			System.out.println("Dime un numero entre 1 y el 10");
		  numero = entrada.nextInt();
		}
		System.out.println("Has escrito el numero " + numero);
		
		
		
	}

}
