import java.util.Scanner;

public class Ejemplo04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe una palabra");
		String palabra = entrada.nextLine();
		frase(palabra);
	}

	// Método que tome como parametro una palabra y la muestre en pantalla
	static void frase(String palabra) {
		System.out.println(palabra);
	}
}
