import java.util.Scanner;

public class Ejemplo03 {

	public static void main(String[] args) {
		//pedir numero por consola y mostrar su tabla
		Scanner entrada=new Scanner(System.in);
		System.out.println("Dime un número que quieras saber su tabla de multiplicar.");
		int numero=entrada.nextInt();
		//Al llamar al método, le pasamos elvalor que hay guardado en numero
		tabla(numero);
		//Mostramos si numero ha cambiado.
		System.out.println("numero "+numero);
	}
	static void tabla(int num) {
		System.out.println("Tabla del "+num);
		System.out.println("-----------------");
		for (int i = 0; i <= 10; i++) {
			System.out.println(num +"x"+i+"="+num*i);
		}
		//Probamos a cambiar el valor de num.
		num=20;
	}

}
