package condicionalesRepaso;
import java.util.Scanner;
/*3.- Queremos diseñar un programa que solicite un número al usuario y le responda "Es impar" o
"No es impar". Utiliza para ello la notación ? en lugar de if asignando a una variable de tipo String
el resultado y mostrando después esta variable*/
public class Ejercicio03 {

	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
System.out.println("Dime un numero");
 int num =entrada.nextInt();
 
 String respuesta =num % 2==0 ? "par":"impar";

System.out.println("Tu numero es " + respuesta);

	}

}
