package ejercicioscondicionales;
//17.- Calculadora. Crea un programa que pregunte dos números al usuario. A continuación mostrará
//un menú similar a éste:
//1) Suma
//2) Resta
//3) Multiplicación
//4) División
//El usuario escribirá el número correspondiente a la operación que desea. Entonces se mostrará el
//resultado.
import java.util.Scanner;
public class ejercicio17 {
	public static void main(String[] args) {
   Scanner entrada= new Scanner(System.in);
   
   System.out.println("Ahora dime que operacion te gustaria hacer: ");
   		System.out.println("1 para SUMA");
   		System.out.println("2 para RESTA");
   		System.out.println("3 para MULTIPLICACION");
   		System.out.println("4 para DIVISION");
		int operacion = entrada.nextInt();
    System.out.println("Dime el primer número");
		float num1 = entrada.nextFloat();
	System.out.println("Dime el segundo número");	
		float num2 = entrada.nextFloat();
		
		switch (operacion){
		case 1:
			System.out.println("Resultado: " +(num1 + num2));
		break;
		case 2:
			System.out.println("Resultado: "+ (num1-num2));
		break;
		case 3:
			System.out.println("Resultado: "+ (num1*num2) );
		break;
		case 4:
			System.out.println("Resultado: "+ (num1/num2) );
			break;
			default:
				System.out.println("Opcion no valida");
		}
		
	}

}
