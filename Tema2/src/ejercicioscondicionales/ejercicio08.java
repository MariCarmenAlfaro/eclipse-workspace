package ejercicioscondicionales;
//8.- Crea un programa que pregunte al usuario c�mo se dice en ingl�s "ordenador". Si el usuario
//responde "computer" entonces recibir� una felicitaci�n. Si no, recibir� un mensaje de consolaci�n.
import java.util.Scanner;
public class ejercicio08 {
	public static void main(String[] args) {
 Scanner entrada = new Scanner(System.in);
 System.out.println("Dime la traducción de \"ordenador\" en inglés: ");
		String traduccion = entrada.nextLine();
		if (traduccion.equals(("Computer")) ) {
			System.out.println("¡Enhorabuena, lo hiciste bien!");
		}else {
			System.out.println("Incorrecto, siguelo intentando");
		}
		
		
		
		
	}

}
