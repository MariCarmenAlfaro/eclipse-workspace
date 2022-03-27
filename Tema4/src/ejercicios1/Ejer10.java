package ejercicios1;

import java.util.Scanner;

//10.- Escribe un método que escriba en pantalla el nombre de un mes a partir de su número. En caso
//de que el número proporcionado no esté entre 1 y 12, deberá terminar inmediatamente.
public class Ejer10 {

	public static void main(String[] args) {
		System.out.println("Escribe el número del mes que desee");
		Scanner entrada = new Scanner(System.in);
		int year= entrada.nextInt();
		any(year);
	}
	static void any(int year) {
		if(year<1||year>12) {
			return;
		}
		 switch (year) {
		 case 1:
			 System.out.println("Enero");
		 break;
		 case 2:
			 System.out.println("Febrero");
		 break;
		 case 3:
			 System.out.println("Marzo ");
		 break;
		 case 4:
			 System.out.println("Abril");
		 break;
		 case 5:
			 System.out.println("Mayo");
		 break;
		 case 6:
			 System.out.println("Junio");
		 break;
		 case 7:
			 System.out.println("Julio");
		 break;
		 case 8:
			 System.out.println("Agosto");
		 break;
		 case 9:
			 System.out.println("Septiembre");
		 break;
		 case 10:
			 System.out.println("Octubre");
		 break;
		 case 11:
			 System.out.println("Noviembre");
		 break;
		 case 12:
			 System.out.println("Diciemrbre");
		 break;
		
		 
		 }
	}
}
