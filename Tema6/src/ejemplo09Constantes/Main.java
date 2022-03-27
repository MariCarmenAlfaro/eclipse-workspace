package ejemplo09Constantes;

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		
		//Pedir al usuario un número de día de la semana y, si es sábado(6) o domingo(7), indicarle que es festivo.
		System.out.println("Dime un número de la semana y te diré si es festivo.");
		Scanner entrada= new Scanner(System.in);
		int dia= entrada.nextInt();
		
		if (dia==DiasSemana.SABADO||dia==DiasSemana.DOMINGO) {
			System.out.println("És dia festivo!");
		}else {
			System.out.println("Lástima, no es un día festivo.");
		}
		
	}

}
