import java.util.Scanner;
public class ejemplo14 {

	public static void main(String[] args) {
  Scanner entrada = new Scanner (System.in);
  System.out.println("Introduce a�o: ");
   if (  entrada.hasNextInt() == true) {
	       int anyo = entrada.nextInt();
    System.out.println("El a�o que has ecrito es "+ anyo);
   } else {
	   System.out.println("No has introducido un a�o correcto");
   }



	}

}
