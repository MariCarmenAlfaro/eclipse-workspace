package actividades;
import java.util.Scanner;
public class Actividad3 {

	public static void main(String[] args) {
 Scanner entrada = new Scanner (System.in);
 
  //Crea un programa que haga la division entera entre dos numeros (con mresto y cociente)
 
 System.out.println("Numero 1: ");
 
 int numeroPrimero = entrada.nextInt();
 
 System.out.println("Numero 2:");
	int numeroSegundo = entrada.nextInt();
	
	int resultado = numeroPrimero / numeroSegundo;
	
	System.out.println("Resultado: " + resultado + " y el resto: " + numeroPrimero % numeroSegundo);
		
		
		
		
		
	}

}
