package condicionalesRepaso;
import java.util.Scanner;

/*2.- Vamos a perfeccionar la aplicaci�n anterior pidiendo un nombre de usuario y una contrase�a
para permitir el acceso al ordenador.
El programa guardar� el nombre de usuario y la contrase�a necesarias en las constantes
NOMBRE_REQUERIDO, PASSWORD_REQUERIDO.
Si el nombre de usuario y la contrase�a introducidas coinciden con los de estas constantes,
aparecer� el mensaje "Acceso permitido". En caso contrario se escribir� "Acceso denegado"*/
public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner entrada =new Scanner (System.in);
		final String NOMBRE_REQUERIDO ="Mari";
		final String PASSWORD_REQUERIDO= "java8";
		
		System.out.println("Dime usuario ");
		String nombre = entrada.nextLine();
		System.out.println("Dime contrase�a");
		String contrasena = entrada.nextLine();
		
		if (nombre.equals(NOMBRE_REQUERIDO) && contrasena.equals(PASSWORD_REQUERIDO)) {
			System.out.println("Acceso permitido");
		}else {
				System.out.println("Acceso denegado");
			}
		
		
		
	}

}
