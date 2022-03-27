package teoria;

/*Metodo de seleccion, para ordenar una array*/
public class Ejemplo7 {

	public static void main(String[] args) {

		int valores[] = { 51, 40, 42, 38, 23, 29 };

		int posMin;
		int aux;

		for (int i = 0; i < valores.length; i++) {
			// El arraay sin ordenar empieza en la posicion i.
			// Fase de busqueda
			// Buscamos el minimo desde la posicion i hasta el final del arraay

			posMin = i;
			for (int j = i; j < valores.length; j++) {
				// Si encontramos un valor mas peuqeño q el de posMin, acutalizamos posMin a esa
				// posicion

				if (valores[j] < valores[posMin]) {
					posMin = j;
				}
			}

			// Ahora la posicion posMin contiene el valor mas pequeño desde i hasta el final
			// del array
			// Fase de intercambio
			// Intercambiamos el valor en posMin por el valor en i
			aux = valores[posMin];
			valores[posMin] = valores[i];
			valores[i] = aux;

		}
		for (int i = 0; i < valores.length; i++) {

			System.out.println(valores[i] + " ");
		}
	}

}
