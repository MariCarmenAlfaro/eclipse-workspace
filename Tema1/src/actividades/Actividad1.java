package actividades;
import java.util.Scanner;
public class Actividad1 {

	public static void main(String[] args) {
  //Crea un programa que pida dos numeros y los multiplique
		  
		Scanner entrada= new Scanner (System.in);
		System.out.println("Dime un número que quieras multiplicar:");
		float numeroprimero = entrada.nextFloat();
		
		System.out.println("multiplicarlo por: ");
		float numerosegundo = entrada.nextFloat();
		
		float resultado = numeroprimero * numerosegundo;

		System.out.println("El resultado es: " + resultado);
		
		
	}

}
