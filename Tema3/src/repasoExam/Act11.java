package repasoExam;

import java.util.Scanner;

/*11.- Crea una aplicación que ordene de menor a mayor la lista de edades de los diez alumnos de un
curso de Desarrollo de Aplicaciones Web. Estas edades se pedirán por consola.*/
public class Act11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int edad[]= new int[5];
		int aux;
		int posMin=0;
		
		for (int i = 0; i <edad.length; i++) {
			System.out.println("Dime tu edad: ");
			edad[i]=entrada.nextInt();
		}
		for (int i = 0; i < edad.length-1; i++) {
				posMin=i;
			
			for (int j = i+1; j < edad.length; j++) {
				if(edad[j]<edad[posMin]) {
					posMin=j;
				}
			}
			aux=edad[posMin];
			edad[posMin]=edad[i];
			edad[i]=aux;
		}
		for (int i = 0; i < edad.length;i++) {
			System.out.println(edad[i]);
		}
		
	}

}
