import java.util.Scanner;

public class Ejemplo05 {

	public static void main(String[] args) {
//Metodo que recibe un parametro entero y mostrara el doble
		Scanner entrada= new Scanner(System.in);
		System.out.println("Dime un número y te diré el doble");
		int numero= entrada.nextInt();
		duplicar(numero);
		
	}

	static void duplicar(int numero) {
		 System.out.println("El doble de "+numero+" es "+numero*2);
	}
}
