package hoja3ejercicios;

/*5.- Haz un programa que te pida un número y te devuelva su tabla de multiplicar. Esto se repetirá
indefinidamente hasta que el usuario escriba 0. En ese caso se escribirá la tabla del cero y el
programa terminará. Usa los bucles do-while y for.*/
import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int i = 1;
		int num;
		do { 
			System.out.println("Dime un numero y te dire su tabla de multiplicar\n");
			num = entrada.nextInt();
			for (i=1;i<=10;i++) {
			System.out.println(i +"+"+ num+"="+ num*i+"\n");
		}
			
		
		} while (num!=0);

	}

}
