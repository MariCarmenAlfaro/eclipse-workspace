package ejerciciosbucles;

import java.util.Scanner;

//un programa que pida un numero y escriba la tabla de multiplicar de ese numero 
public class Ejercicio13 {

	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
System.out.println("Dime un numero");
int i =1;
int num = entrada.nextInt();
System.out.println("Esta es la tabla de multiplicar de tu numero: ");
for (i=1; i<=10; i++) {
	System.out.println(num + "+" + i + " = " + num*i);
}
		
		
		
	}

}
