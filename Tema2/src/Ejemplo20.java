import java.util.Scanner;
//Prog q pida 10 notas. Si el usuario ecribe una nota que no este entre 0 y 10, 
//mostrara un mensaje de error y terminara.
public class Ejemplo20 {
	public static void main(String[] args) {
 Scanner entrada = new Scanner(System.in);
 
 int notas=0;
 for (int i =1; i<=10 && notas >=0 && notas <=10;i++) {
	 System.out.println("Nota " + i);
	 notas = entrada.nextInt();
	 if (notas <0 || notas>10) {
		// System.out.println("Error de datos, el progrmama termina");
	 break;
	 }
 }
		
		
		
		
		
	}

}
