package hoja3ejercicios;

import java.util.Scanner;

/*4.- Modifica el programa anterior para que despu�s de decir el resultado te haga la siguiente
pregunta:
�Quieres continuar (s/n)?
Si la respuesta es 's', volver� a empezar el bucle. Si la respuesta es cualquier otra, acabar� el
programa, con un mensaje de despedida.
Ayuda: Puedes leer un car�cter de la consola con la orden:
letra = teclado.next().charAt(0);
Esta orden lee un String y devuelve el primer car�cter del mismo (el que ocupa la posici�n 0).*/
public class Ejer4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
	      
	      int i =1;
	      char continuar = "s";
	      while (continuar == "s"|| continuar =="S") {
	      System.out.println("Dime la suma de estos dos numeros!");
	      int num1 = (int)(Math.random ()*100)+1;
	      int num2 = (int)(Math.random ()*100)+1;
	      System.out.println(num1 +" + "+num2 + " =");
	      int respuesta = entrada.nextInt();
	      if (respuesta == (num1+num2)) {
	    	  System.out.println("Has acertado\n");
	      }else { System.out.println("Has fallado\n");
	      i++;
	      }
System.out.println("Quieres continuar? Responde con un \"s\" o \"n\"");
	       continuar = entrada.nextLine().charAt(0);
	}

}
}
