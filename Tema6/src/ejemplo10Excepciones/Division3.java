package ejemplo10Excepciones;

import java.util.Scanner;

public class Division3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dime un numero y dividire 20 entre él");
		System.out.println("Numero");
		String numero = entrada.nextLine();
		dividir(numero);
	}

	public static void dividir(String numero) {
		// Abrimos un bloque try antes de las instrucciones que sabemos que pueden dar
		// error
		try {
			// Si numero es una cadena que no puede convertirse a entero, se lanzara una
			// excepcion de tipo
			// NumerFormatException. EL programa saltara al catch correspondiente
			int num = Integer.parseInt(numero);
			// Si num es 0, al dividir se lanzara una excepcion de tipo Arithmetics Ex.
			// El programa saltara al catch correspondiente.
			System.out.println("\nLa división de 20 entre " + num + " da " + 20 / num);
		} catch (NumberFormatException ex) {

			// Si ha ocurrido una excepcion de tipo NumberFormatEx se mostrara el siguetne
			// mensaje.
			System.out.println("¡Debes introducir un número entero!");
		} catch (ArithmeticException ex) {

			// Si ha ocurrido una excepcion de tipo ArithmeticEx se mostrara el siguetne
			// mensaje.
			System.out.println("¡No se puede dividir entre 0!");
		} catch (Exception ex) {
			//Si ocurriera una excepcion distinta de las anteriores, se mostraria el siguente mensaje generico.
			System.out.println("Se ha producido un error indeterminado");
		} finally {
			//Las instrucciones que esten dentro del bloque finally siempre se ejecutaran, tanto si se haya producido una ex como si no.
			//Incluso aunque hubiera un return antes del finally
			System.out.println("Gracias por dividir");
		}
	}
}
