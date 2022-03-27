package ejerciciosarrays3;
/*2.- A lo largo de diez días los valores de las acciones de Microsoft al cierre del mercado han sido:
47'5 47'8 48 48'1 47'7 47'3 46 47'9 48'05 48'7
Diseña un programa que calcule el mínimo y el máximo de los valores mencionados. Utiliza un
array de nombre cotizaciones. Introduce los datos directamente en el código del programa.*/
public class Act2 {
	public static void main(String[] args) {

		double cotizacion[]= {47.5, 47.8, 48, 48.1, 47.7, 47.3, 46, 47.9, 48.05, 48.7};
		int posMin=0; 
		int posMax=0;
		double aux;
		for (int i = 1; i < cotizacion.length; i++) {
			
			if (cotizacion[i] < cotizacion[posMin]) {
				posMin = i;
			}
			if (cotizacion[i] > cotizacion[posMax]) {
				posMax = i;
			}

		}
		
		System.out.println("La cotización mínima ha sido "+cotizacion[posMin]+" y la cotizacion máxima ha sido de "+cotizacion[posMax]);
		
	}

}
