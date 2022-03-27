import java.util.Scanner;

public class Ejemplo18 {

	public static void main(String[] args) {
 Scanner entrada = new Scanner (System.in);
 
  System.out.println("A ver si adivinas el numero entre 1 y el 10");
  
  int num;
  
  do {
	  System.out.println("Numero?");
	   num = entrada.nextInt();
 
  } while(num !=7);
  
 System.out.println("Has acertado el numero!!!!!!!!!");
	}

}
