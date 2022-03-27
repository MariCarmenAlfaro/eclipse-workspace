package ejercicioscondicionales;
//21.- Crea un programa que pregunte el nombre del usuario y luego lo escriba. Ahora bien, si el
//usuario no introduce nada, el nombre deberá quedar con el valor "Desconocido".
import java.util.Scanner;
public class ejercicio21 {
	public static void main(String[] args) {
   Scanner input= new Scanner(System.in);
		System.out.println("Dime tu nombre");
		String nombre= input.nextLine();
		nombre = nombre.equals("") ? "Desconocido": nombre;
		System.out.println(nombre);
	}

}
