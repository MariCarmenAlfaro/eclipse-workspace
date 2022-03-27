package ejerciciosbucles;
//5.- Escribe un programa que solicite un número al usuario y, a continuación, 
//muestre la tabla de multiplicar de ese número.
import java.util.Scanner;
public class ejercicio05B {
	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
 System.out.println("Dime un numero");
 int num =entrada.nextInt();
 int contador =1;
  System.out.println("Esta es la tabla de multiplicar de su número:");
 
 do{
	 System.out.println( num  +" x " + contador + " = " + num*contador);

	
	contador ++;
 }
 while (contador <=10);
	
	 
 


	}

}
