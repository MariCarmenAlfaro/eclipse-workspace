import java.util.Scanner;

public class Ejemplo07 {

	public static void main(String[] args) {
//Metodo que reciba dos numeros decimales y muestre el valor de su suma
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dime un numero con decimales");
		float num1 = entrada.nextFloat();
		System.out.println("Dime otro numero con decimales y te dire la suma entre ellos");
		float num2 = entrada.nextFloat();
		float suma= sumar(num1, num2);
		System.out.println("Suma= "+suma);
	}

	static float sumar(float num1, float num2) {
		float resultado= num1+num2;
		
		return resultado;
	}
}
