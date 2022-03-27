import java.util.Scanner;

public class Ejemplo06 {

	public static void main(String[] args) {
//Metodo que reciba dos numeros decimales y muestre el valor de su suma
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dime un numero con decimales");
		float num1 = entrada.nextFloat();
		System.out.println("Dime otro numero con decimales y te dire la suma entre ellos");
		float num2 = entrada.nextFloat();
		sumar(num1, num2);
	}

	static void sumar(float num1, float num2) {
		System.out.println("La suma entre "+num1 +" y "+num2+" es igual a "+ (num1+num2));
	}
}
