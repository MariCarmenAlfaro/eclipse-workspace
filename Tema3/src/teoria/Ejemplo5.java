package teoria;

/*Encontrar edades el mínimo y el maximo en un array*/
public class Ejemplo5 {

	public static void main(String[] args) {
		int edades[] = { 30, 32, 27, 40, 25, 28, 21, 50, 56, 19 };
		// la variable min siempre toma como valor inicial el primer valor del array
		int min = edades[0];
		int max = edades[0];
// recorremos el array desde la posicion 1. no hace falta empezar por la 0 ya que siempre sera false(el valor es igual)
		for (int i =1; i<edades.length;i++) {
			//Si en una posicion hay un valor menor que min, guardamos ese valor como nuevo minimo
			if (edades[i]<min) {
				min=edades[i];
			}else if (edades[i]>max) {
				max=edades[i];
			}
		}
		System.out.println("La persona mas joven tiene " + min + " años");
		
		System.out.println("La persona mas adulta tiene "+ max + " años");
		
		
	}

}
