package ejercicios1;

import java.util.Scanner;

//9.- Crea un método que tome como parámetro un entero representando un año, y devuelva true o
//false indicando si es bisiesto o no.
public class Ejer9 {

	public static void main(String[] args) {
		System.out.println("Dime un año y te dire si es bisiesto o no");
		Scanner entrada = new Scanner(System.in);
		int year= entrada.nextInt();
		
	if(bisiesto(year)) {
		System.out.println("es bisiesto");
	}else {
		System.out.println("No es bisiesto");
	}
		
	}

	static boolean bisiesto(int year) {
		boolean yearBisiesto=false;
		if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
			return true;
		}else {
			return false;
		}
		}

}
