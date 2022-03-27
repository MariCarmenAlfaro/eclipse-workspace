import java.util.Scanner;

public class MiEjemplo {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Dime la cantidad de productos que llevas y te dire el total. Todo esta a 5 euros!!");
		int producto = entrada.nextInt();
		
		int total=1;
		
		total =producto>0? (producto*5): total;
		System.out.println("este es tu sueldo " + total);
		
		
		
		
		
	}
}
