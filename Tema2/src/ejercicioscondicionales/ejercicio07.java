package ejercicioscondicionales;
//7.- Juego de adivinar el n�mero secreto. El ordenador nos preguntar� un n�mero del 1 al 10. Si
//coincide con el n�mero secreto (que habr�s codificado como una constante entera) nos felicitar�. Si
//no, nos dir� que hemos fallado.
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
