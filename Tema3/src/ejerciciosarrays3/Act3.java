package ejerciciosarrays3;

import java.util.Arrays;

//3.- Crea un programa que tome los mismos datos que el anterior y los ordene de menor a mayor (sin
//calcular mínimo ni máximo).
public class Act3 {

	public static void main(String[] args) {
		double cotizacion[] = { 47.5, 47.8, 48, 48.1, 47.7, 47.3, 46, 47.9, 48.05, 48.7};
		double aux;
		for (int i = 0; i < cotizacion.length-1; i++) {
			for (int j = i+1; j < cotizacion.length; j++) {
				if (cotizacion[i]>cotizacion[j]) {
					aux=cotizacion[i];
					cotizacion[i]=cotizacion[j];
					cotizacion[j]=aux;
				}
			}
		}
		System.out.println(Arrays.toString(cotizacion));
	}

}
