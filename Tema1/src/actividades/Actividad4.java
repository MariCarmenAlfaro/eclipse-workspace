package actividades;
import java.util.Scanner;
public class Actividad4 {

	public static void main(String[] args) {
Scanner entrada = new Scanner (System.in);

//Crea un programa que pregunte el nombre de un alumno y sus notas de 3 evalucaiones y de la media

System.out.println("Nombre del alumno:");
		String nombre= entrada.nextLine();
		
System.out.println("Me gustaria saber las notas de las tres evaluaciones. Dime la primera nota");		
	float primeraEvaluacion = entrada.nextFloat();	
	
	System.out.println("Nota segunda evaluacion: ");
		float segundaEvaluacion = entrada.nextFloat();
		
		System.out.println("Nota tercera evaluacion: ");
		float terceraEvaluacion = entrada.nextFloat();
		float media = (primeraEvaluacion+ segundaEvaluacion+ terceraEvaluacion);
		System.out.println("La media de "+ nombre +  " es de " + media/3);
		
		
	}

}
