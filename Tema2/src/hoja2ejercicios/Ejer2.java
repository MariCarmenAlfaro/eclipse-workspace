package hoja2ejercicios;

//2.- Modifica el programa anterior para que no aparezcan los múltiplos de 5 sino que, al final,
//simplemente se muestre la suma de todos ellos. Utiliza un bucle while.
public class Ejer2 {

	public static void main(String[] args) {
		int i = 0;
		int suma = 0;

		while (i <= 1000) {

			suma = suma + i;
			i = i + 5;
		}
		System.out.println(suma);

	}

}
