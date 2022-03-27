package ejerciciosbucles;
//1.- Crea un programa que pida un carácter al usuario. A continuación lo escribirá 100 veces.
import java.util.Scanner;
public class ejercicio01 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
   System.out.println("Escribe un caracter: ");
   
		String caracter = entrada.nextLine();
		int contador = 1;
		while (contador <=100 ) {
			System.out.println(contador+ " " + caracter);
			contador = contador +1;
		} 
		
		
		
	}

}
