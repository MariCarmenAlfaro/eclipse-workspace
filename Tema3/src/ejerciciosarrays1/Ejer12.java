package ejerciciosarrays1;

import java.util.Scanner;

/*12.- Escribe una aplicaci�n que cree un array de 100 posiciones llamado matriculas y rellene todas
las posiciones con el valor por defecto "sinmatricula". Haz que despu�s se muestren todos los
valores mediante un bucle for*/
public class Ejer12 {
	public static void main(String[] args) {
Scanner entrada= new Scanner(System.in);
		String matriculas[]= new String[100];
		for(int i=0; i<matriculas.length;i++) {
			System.out.println("Dime las matricula: " + (i+1));
			matriculas[i]= "sinmatricula";
		}
		for(int i =0; i<matriculas.length;i++) {
			System.out.println(i +" "+ matriculas[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
