package condicionalesRepaso;
import java.util.Scanner;
/*4.- Un profesor quiere una aplicaci�n que muestre las notas de un examen con diferente color seg�n
este esquema:
� Nota < 4: Rojo.
� 4 <= Nota < 5: Verde.
� Nota >= 5: Azul.
El programa pedir� una nota (puede tener decimales) y devolver� el nombre del color a usar. Utiliza
las instrucciones if y else if.*/

public class Ejercicio04 {

	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
 System.out.println("Dime tu nota");
		float nota = entrada.nextFloat();
		if (nota <4) {
			System.out.println("ROJO");
		}else if (nota <5) {
			System.out.println("VERDE");
		}else  {
			System.out.println("AZUL");
		}
		
		
	}

}
