package hoja3ejercicios;

import java.util.Scanner;

/*6.- Añade al programa anterior una comprobación del número introducido, de manera que si el
usuario escribe "1", el programa le responda "No seas tonto" y vuelva a empezar el bucle, sin
mostrar la tabla. Utiliza la palabra clave continue.*/
public class Ejer6 {

	public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			int i = 1;
			int num;
			do { 
				System.out.println("Dime un numero y te dire su tabla de multiplicar\n");
				num = entrada.nextInt();
				if (num==1) {
					System.out.println("No seas tonto");
					continue;
				}
				for (i=1;i<=10;i++) {
				System.out.println(i +"+"+ num+"="+ num*i+"\n");
			}
				
			if (num==0) {
					break;
				}
			} while (true);

	
		}
	
		
		
	}

