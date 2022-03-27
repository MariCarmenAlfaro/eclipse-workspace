package ejerciciosbucles;
//.- Modifica el programa anterior para que pida un carácter y también el número de veces que queremos repetirlo.
import java.util.Scanner;
public class ejercicio02 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
   System.out.println("Escribe un caracter: ");
   
		String caracter = entrada.nextLine();
		System.out.println("Cuantas veces quieres que se repita?: ");
		
		int repeticiones = entrada.nextInt();
		int contador = 1;
		while (contador <= repeticiones) {
			System.out.println(contador+ " " + caracter);
			contador = contador +1;
		} 
		
		
		
	}

}
