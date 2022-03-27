package ejerciciosbucles;
import java.util.Scanner;
public class Ejercicio19 {
/*19.- Amplía la aplicación anterior para que a medida que se van introduciendo las 
 * notas se vayan sumando (en una variable llamada suma). Al final, devolverá la nota media de esas notas.
 */
	public static void main(String[] args) {
Scanner entrada = new Scanner (System.in);
int nota;
float suma=0;
for (int i=1;i<=5;i++) {
	
System.out.println("Dime tu "+i+ " nota");
nota =entrada.nextInt();

while(nota <0 || nota >10) {
	System.out.println("Dime tu "+i+ " nota");
	nota =entrada.nextInt();
} 
suma =suma+nota;

}
System.out.println(suma);




	}

}
