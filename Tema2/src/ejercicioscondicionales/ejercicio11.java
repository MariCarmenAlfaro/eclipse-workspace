package ejercicioscondicionales;
//11.- Modifica el programa anterior para que acepte una nota con decimales (por ejemplo, si la nota
//es menor que 5, la calificaci�n ser� de Insuficiente).
import java.util.Scanner;
public class ejercicio11 {
	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
			System.out.println("Dime tu nota: ");
			 float nota = entrada.nextFloat();
			  if (nota <5) {
				  System.out.println("tienes un insuficiente");
			  } else if (nota <6) {
				  System.out.println("tienes un suficiente");
			  } else if (nota >=6 && nota <7) {
				  System.out.println("tienes un bien");
			  }else if(nota >=7 && nota <9) {
				  System.out.println("Tiene un notable");
			  }else {
				  System.out.println("Sobresaliente");
			  }
	}

}
