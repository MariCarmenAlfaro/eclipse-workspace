package ejercicioscondicionales;
//22.- Crea un programa que calcule la hora de cierre de una tienda. Esta hora depende del valor de
//una variable de tipo String llamada dia. Si su valor es "entre semana", la hora de cierre de la tienda
//será "20:00". En otro caso, la hora de cierre será "14:00"
import java.util.Scanner;
public class ejercicio22 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
System.out.println("Horas de cierre");
String dia = entrada.nextLine();
String cierre;
 cierre = dia.equals("entre semana")? "Cerramos a las 20:00": "Cerramos a als 14:00";
		System.out.println(cierre);
		
		
		
	}

}
