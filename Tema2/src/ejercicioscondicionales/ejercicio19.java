package ejercicioscondicionales;
//19.- Modifica el programa anterior para que si además el número introducido es el 3, se informe al
//usuario de que lo ha acertado
import java.util.Scanner;
public class ejercicio19 {
	public static void main(String[] args) {
Scanner entrada = new Scanner (System.in);
System.out.println("Dime un numero del 1 al 10, por favor");

if (entrada.hasNextInt()== true) {
	int num = entrada.nextInt();
	System.out.println("Este es su numero " + num);
	if (num == 3) {
	
	System.out.println("Has acertado el numero secreto!");
}
} else {
	System.out.println("Error");
}
	}

}
