package ejerciciosarrays2;

/*9.- Crea un programa que muestre los siguientes precios (guardados en un array llamado precios)
ordenados de menor a mayor, usando el método de selección*/
public class Act9 {

	public static void main(String[] args) {

		float precios[] = { 43, 58, 44, 62, 80, 15, 15, 10, 90, 56 };
		int precioMin;
		float aux;

		for (int i = 0; i < precios.length-1; i++) {
			precioMin = i;

			for (int j = i+1; j < precios.length; j++) {
				if (precios[j] < precios[precioMin]) {
					precioMin = j;
				}
			}
			aux = precios[precioMin];
			precios[precioMin] = precios[i];
			precios[i] = aux;

		}
		for (int i = 0; i < precios.length; i++) {
			System.out.println(precios[i] + " ");
		}

	}

}
