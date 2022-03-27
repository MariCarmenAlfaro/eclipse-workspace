package ejerciciosbucles;
import java.util.Scanner;
//5.- Escribe un programa que solicite un número al usuario y, a continuación, 
//muestre la tabla de multiplicar de ese número.
//USANDO BUCLE FOR

public class ejercicio05C {
	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
 System.out.println("Dime un numero");
 int num =entrada.nextInt();
  /*System.out.println("Esta es la tabla de multiplicar de su número:");
int contador =1;
 do {
	  int resultado = num *contador;
	  System.out.println( num  +" x " + contador + " = " + num*contador);
	 contador = contador+1;
 }
 while (contador <=10);*/
 
	for (int contador=1; contador <=10; contador++) {
		  System.out.println( num  +" x " + contador + " = " + num*contador);

	}
 


	}

}
