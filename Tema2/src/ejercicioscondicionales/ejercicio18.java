package ejercicioscondicionales;
//18.- Crea un programa que pida un n�mero entero por teclado, entre 1 y 10. Si el usuario escribe un
//n�mero entero, se escribir� su valor en pantalla. Si lo que escribe no es un entero, se mostar� un
//mensaje de error.
import java.util.Scanner;
public class ejercicio18 {
	public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    System.out.println("Dime un numero del 1 al 10, por favor");
		if (entrada.hasNextInt()== true) {
			int num = entrada.nextInt();
			System.out.println("Este es su numero " + num);
		}else {
			System.out.println("Error");
		}
		
		
		
	}

}
