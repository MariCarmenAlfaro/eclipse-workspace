
import java.util.Scanner; 
//Programa q te pregunta la edad y te dice si puedes `pasasr al pub o no
public class ejemplo01 {
public static void main(String [] args) {
	
	Scanner entrada = new Scanner(System.in); 
	//Preguntar la edad
	System.out.println("¿Que eddad tienes?");
	 int edad = entrada.nextInt();
	//Si la edad es mayor o igual a 18, se puede pasar.
	 
	 if(edad >=18) {
		 System.out.println("Puedes entrar a la discoteca");
	 }
	 
	 
	 System.out.println("Gracias por venir a nuestro local");
	 
	 
}

	
}
