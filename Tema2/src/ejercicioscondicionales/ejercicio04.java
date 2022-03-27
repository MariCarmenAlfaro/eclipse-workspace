package ejercicioscondicionales;
//4.- Crea un programa que pida al usuario una contraseña. Si escribe "1234" el programa responderá
//"Acceso concedido.".
import java.util.Scanner;

public class ejercicio04 {
	public static void main(String[] args) {
	Scanner entrada = new Scanner (System.in);
	System.out.println("Contraseña: ");
	String contra = entrada.nextLine();

	if (contra.equals("1234")) {
		System.out.println("Acceso concedido");
	}
		
		
		
	}

}
