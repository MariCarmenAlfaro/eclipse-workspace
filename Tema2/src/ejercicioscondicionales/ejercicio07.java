package ejercicioscondicionales;
//7.- Juego de adivinar el número secreto. El ordenador nos preguntará un número del 1 al 10. Si
//coincide con el número secreto (que habrás codificado como una constante entera) nos felicitará. Si
//no, nos dirá que hemos fallado.
import java.util.Scanner;
public class ejercicio07 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
System.out.println("Dime un numero: ");
		int num  = entrada.nextInt();
		final int NUMERO_SECRETO = 4;
		if (num == NUMERO_SECRETO) {
			System.out.println("Enhorabuena, has acertado");
		}else {
			System.out.println("has fallado");
		}
		
	}

}
