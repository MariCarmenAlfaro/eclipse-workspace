package actividades;
import  java.util.Scanner;
public class Actividad2 {

	public static void main(String[] args) {
		
		//Crea un programa que pida dos números y calcule el resto de dividirlos
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Dime dos números y te diré el resto de su division. Primer número:");
		
		float numeroPrimero = entrada.nextFloat();
		 System.out.println("Segundo número:");
		 
		 float numeroSegundo = entrada.nextFloat();
		 float resultadoResto = numeroPrimero % numeroSegundo;
		 System.out.println("Este es el resto de su división: " + resultadoResto);
		 
		 
	}
}
