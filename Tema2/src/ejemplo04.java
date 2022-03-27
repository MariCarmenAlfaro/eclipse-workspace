import java.util.Scanner;
public class ejemplo04 {
 
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in); 
		//Preguntar la edad
		System.out.println("¿Que eddad tienes?");
		 int edad = entrada.nextInt();
		//Si la edad es mayor o igual a 18, se puede pasar.
		 
		 if(edad >=18) {
			 System.out.println("Puedes entrar a la discoteca");
		 } else {
			 System.out.println("Vete a casa");
		 }
		 
		
		
		
		
	}

}
