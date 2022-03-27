package ejercicioscondicionales;
import java.util.Scanner;
public class ejercicio05 {

	public static void main(String[] args) {
// if (mes >= 1 &&mes <=12
		Scanner entrada = new Scanner(System.in);
		System.out.println("mes del año");
	int mes = entrada.nextInt();
	if (mes>=1 && mes <=12) {
		System.out.println("mes correcto");
	} else {
		System.out.println("mes no valido");
	}
	
	
	
	}

}
