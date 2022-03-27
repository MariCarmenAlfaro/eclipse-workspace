package condicionalesRepaso;
import java.util.Scanner;

/*2.- Vamos a perfeccionar la aplicación anterior pidiendo un nombre de usuario y una contraseña
para permitir el acceso al ordenador.
El programa guardará el nombre de usuario y la contraseña necesarias en las constantes
NOMBRE_REQUERIDO, PASSWORD_REQUERIDO.
Si el nombre de usuario y la contraseña introducidas coinciden con los de estas constantes,
aparecerá el mensaje "Acceso permitido". En caso contrario se escribirá "Acceso denegado"*/
public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner entrada =new Scanner (System.in);
		final String NOMBRE_REQUERIDO ="Mari";
		final String PASSWORD_REQUERIDO= "java8";
		
		System.out.println("Dime usuario ");
		String nombre = entrada.nextLine();
		System.out.println("Dime contraseña");
		String contrasena = entrada.nextLine();
		
		if (nombre.equals(NOMBRE_REQUERIDO) && contrasena.equals(PASSWORD_REQUERIDO)) {
			System.out.println("Acceso permitido");
		}else {
				System.out.println("Acceso denegado");
			}
		
		
		
	}

}
