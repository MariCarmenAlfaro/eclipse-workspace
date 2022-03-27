package hoja3ejercicios;

import java.util.Scanner;

/*3.- Crea una aplicaci�n para probar la capacidad de c�lculo mental de los usuarios. Se calcular�n
dos n�meros aleatorios entre 1 y 100 y se mostrar�n en pantalla. A continuaci�n el usuario deber�
escribir el resultado de la suma de ambos n�meros y se le indicar� si ha acertado o no.
Estas acciones se repetir�n indefinidamente mediante un bucle while.
Ayuda: Puedes generar un n�mero aleatorio mayor o igual a 0 y menor que 1 con la orden
Math.random( ). Si lo multiplicas por 100 y le sumas 1, entonces obtendr�s un n�mero entre 1 y
100, ambos inclusive:
(int) (Math.random()*100 + 1)
Ayuda: Puedes hacer que un bucle se ejecute indefinidamente si pones entre par�ntesis una
condici�n que siempre sea verdadera.*/
public class Ejer3 {
	public static void main(String[] args) {
      Scanner entrada = new Scanner (System.in);
      int num1;
      int num2;
      int respuesta;
      int i =1;
      while (true) {
      System.out.println("Dime la suma de estos dos numeros!");
      num1 = (int)(Math.random ()*100)+1;
      num2 = (int)(Math.random ()*100)+1;
      System.out.println(num1 +" + "+num2 + " =");
      respuesta = entrada.nextInt();
      if (respuesta == (num1+num2)) {
    	  System.out.println("Has acertado\n");
      }else { System.out.println("Has fallado\n");
      }
     i++;
      }


	}

}
