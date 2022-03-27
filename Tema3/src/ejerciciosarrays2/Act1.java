package ejerciciosarrays2;

import java.util.Scanner;

/*1.- Crea un programa que guarde la siguiente tabla de edades en forma de array. A continuación
deberá buscar si hay alguna persona con 35 años. Si la hay, se mostrará el mensaje "Localizada
persona de 35 años". Utiliza una variable semáforo llamada edadEncontrada*/
public class Act1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double edad []= {20, 25, 30, 28, 39, 42, 30,
				29, 28, 21, 60, 55, 20, 19};
		
		boolean edadEncontrada= false;
		for(int i=0;i<edad.length;i++) {
			if(edad[i]==35) {
				edadEncontrada= true;
				break;
			}
		}
		if (edadEncontrada) {
			System.out.println("Localizada persona de 35 años");
		}else {
			System.out.println("No se ha localizado nadie con 35 años");
		}

	}

}
