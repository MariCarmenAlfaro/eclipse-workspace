package hoja3ejercicios;
/*1.- Escribe un programa que invente un nº aleatorio entre 1 y 10. El usuario tendrá que adivinarlo en
tres intentos como máximo. Al finalizar el programa se le dirá si ha acertado el número y en cuántos
intentos lo ha hecho. Utiliza while y break.
Ayuda: Puedes generar un número aleatorio mayor o igual a 0 y menor que 1 con la orden
Math.random( ). Si lo multiplicas por 10 y le sumas 1, entonces obtendrás un número entre 1 y 10,
ambos inclusive:*/

import java.util.Scanner;

public class Ejer1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
 System.out.println("Adivina un numero entre el 1 y el 10");
		 int num;
		 int i=0; 
		 int correcto=0;
		 num =(int) (Math.random()*10 + 1);
		 
		 System.out.println(num);
		 
		 while (correcto != num && i<=3) {
			 System.out.println("Numero:");
			   correcto = entrada.nextInt();
			  i++;
			  
			 if (num==correcto) {
				 System.out.println("Enhorabuena, has acertado al " +(3-i)+ " intento");
				 break;
			 }else {
				 System.out.println("Has fallado. Te quedan " + (3-i)+" intentos");
			 }
			
		 }
		
		
		
		
	}

}
