package ejerciciosbucles;
import java.util.Scanner;
public class Ejercicio18 {
//escribe una app que solicite 5 notas. si el usuario escribe una nota que no esta
	//dentro del 0 y10 dara error y se vovlera a pedir dato
	public static void main(String[] args) {
Scanner entrada = new Scanner (System.in);
int nota;
for (int i=1;i<=5;i++) {
	
System.out.println("Dime tu "+i+ " nota");
nota =entrada.nextInt();

while(nota <0 || nota >10) {
	System.out.println("Dime tu "+i+ " nota");
	nota =entrada.nextInt();
} 

}





	}

}
