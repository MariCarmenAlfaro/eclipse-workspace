package ejerciciosarrays3;

import java.util.Scanner;

/*7.- En una pizzería quieren un programa para anotar el tiempo que tardan en hacer cada reparto de
comida a domicilio.
Escribe una aplicación que cree un array de 15 elementos y vaya leyendo de consola los tiempos de
entrega (en minutos) que han tenido los últimos 15 pedidos. A continuación, recorrerá el array y
contará cuántos de los pedidos han superado los 30 minutos. Este dato es importante porque la
empresa no cobra la pizza si ha tardado más de media hora en entregarla.
Por último, el programa mostrará este nº de pedidos fallidos, y lo indicará también como porcentaje
del total de pedidos hechos*/
public class Act7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int tiempo[] = new int[15];
		int pizzaGratis=0;
		
		System.out.println("Tiempo de entregas");
		
		for (int i = 0; i < tiempo.length; i++) {
			System.out.println("Tiempo " + i);
			tiempo[i]=entrada.nextInt();
			if(tiempo[i]>30) {
				pizzaGratis++;
			}
		}
		
		
		
			System.out.println("La cantidad de pedidos fallidos han sido de "+pizzaGratis+ " y el porcentaje es de "+(pizzaGratis*100)/tiempo.length+"%");
		
	}

}
