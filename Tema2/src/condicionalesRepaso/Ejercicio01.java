package condicionalesRepaso;
import java.util.Scanner;
/*1.- Queremos crear una aplicaci�n que controle el acceso a un ordenador pidiendo una clave de
acceso.
El programa pedir� una cadena de caracteres al usuario. La comparar� con la cadena "java8" y si
son iguales, escribir� "Acceso permitido". En caso contrario escribir� "Acceso denegado".
Para guardar la clave "java8" utiliza una constante llamada CLAVE_REQUERIDA.*/
public class Ejercicio01 {
	public static void main(String[] args) {
Scanner entrada =new Scanner (System.in);
System.out.println("Dime la clave de acceso");
String clave = entrada.nextLine();
final String CLAVE_REQUERIDA= "java8";
if (CLAVE_REQUERIDA) {
	System.out.println("Acceso permitido");
}else {
	System.out.println("Acceso denegado");
}





	}

}
