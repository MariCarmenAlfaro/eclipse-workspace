package ejerciciosarrays2;
import java.util.Scanner;
/*3.- Escribe un programa que lea una lista de nombres (uno a uno, hasta un máximo de 10) por
consola y los vaya guardando en un array llamado nombres. La aplicación terminará de pedir
palabras cuando el usuario escriba "nadie"
A continuación revisará el array y averiguará si se ha introducido el nombre "Calderón". Si es así
escribirá "de la Barca". Si no, escribirá "Nombre no encontrado". Utiliza una variable semáforo
llamándola nombreEncontrado.*/
public class Act3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String nombres[] = new String[10];
		boolean nombreEncontrado = false;
		System.out.println("Decidme nombres!");
		for (int i = 0; i < nombres.length; i++) {
			
			System.out.println("Nombre " + (i+1));
			nombres[i] = entrada.nextLine();
			if (nombres[i].equals("nadie")) {
				System.out.println("No deseas guardar más nombres");
				break;
			}			
		}
		
		for (int i = 0; i < nombres.length; i++) {
			if (nombres[i]!=null && nombres[i].equals("Calderón")) {
				nombreEncontrado=true;
				break;
			}
		}
		if (nombreEncontrado==true) {
			System.out.println("de la Barca");
		} else {
			System.out.println("Nombre no encontrado");

		}
		

	}

}
