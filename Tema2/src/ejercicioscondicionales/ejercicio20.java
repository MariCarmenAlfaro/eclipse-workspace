package ejercicioscondicionales;
//20.- Escribe un programa que pida la edad del usuario. Si ésta es menor de 18 años, el valor de la
//variable mayorDeEdad será verdadero. Si no, será falso. Al final se mostrará este valor.
import java.util.Scanner;
public class ejercicio20 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
    System.out.println("Dime tu edad");
     int edad = entrada.nextInt();
     boolean mayorEdad;
   mayorEdad = edad >=18 ? true : false;
    System.out.println(mayorEdad);
 
 
 
	}

}
