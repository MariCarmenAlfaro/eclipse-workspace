package ejercicioscondicionales;
//1.- Crea un programa que pida la temperatura de un reactor nuclear. Si ésta supera los 120ºC, se
//mostrará en pantalla el mensaje: "TEMPERATURA DEL REACTOR CR�?TICA. ¡CORRED,
//INSENSATOS!
import java.util.Scanner;
public class ejercicio01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		System.out.println("Necesito la temperatura del reactor nuclear: ");
		float temperatura = entrada.nextFloat();
		
		if (temperatura >120) {
			System.out.println("TEMPERATURA DEL REACTOR CRITICA�COORED, INSENSATOS!");
		}
		
		
		
	}

}
