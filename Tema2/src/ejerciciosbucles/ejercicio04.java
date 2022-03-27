package ejerciciosbucles;
//Ecribe una aplicacion qeu pregunte al usuario un numerodel 1 al 5. si el numero no esta entre el 1 y eel 5 
//se le informara. si reponde 3, se le felicitara por haber acertado. si no se les eguira preguntando mas numero
import java.util.Scanner;
public class ejercicio04 {
	public static void main(String[] args) {
Scanner entrada = new Scanner (System.in);
//preguntamos el numero
  
 boolean preguntar = true;
  // si esta entre el 1 y 5 miramos si vale 3 y felicitamos
 //si no es 3, repetimos
	while (preguntar ==true) {
		System.out.println("Dime un numero entre el 1 y el 5");
 int num = entrada.nextInt();
		if (num ==3) {
			System.out.println("FElicidades, has acertado");
			preguntar = false;
		}else if (num >=1 && num <=5) {
			System.out.println("vuelve a probar");
		}else {
			System.out.println("Tienes que escribir un numero entre 1 y 5");
		}
 
	}
 
 
 
 
  }




	}


