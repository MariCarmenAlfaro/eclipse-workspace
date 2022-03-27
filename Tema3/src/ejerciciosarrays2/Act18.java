package ejerciciosarrays2;
//17.- Añade al ejercicio anterior un bucle donde se busque en el array quién tiene la nota más baja.
//La salida debería ser algo como: "Juana Herranz tiene la nota más baja, un 4".
public class Act18 {

	public static void main(String[] args) {
		String calificaciones[][] = { { "Jose Luis Martinez", "7" }, { "Antonia Ruiz", "9" },
				{ "Marcos Ramirez", "10" }, { "Juana Herranz", "4" }, { "Alberto Lopez", "7" } };

		float total =0;
		for (int fila =1; fila 
				< calificaciones.length; fila++) {

			total = total + Float.parseFloat(calificaciones[fila][1]);

			System.out.println();

			for (int columna = 1; columna 
					< calificaciones[0].length; columna++) {

				System.out.print(calificaciones[fila][columna] + " ");
			}

		}
		System.out.println("\n");
		System.out.println("La nota media del curso " 
		+ total / calificaciones.length);
		int posMin=0;
		int posMax=0;
		for (int fila = 0; fila < calificaciones.length; fila++) {
			if(Float.parseFloat(calificaciones[fila][1])<Float.parseFloat(calificaciones[posMin][1])) {
				posMin=fila;
			}
			if(Float.parseFloat(calificaciones[fila][1])>Float.parseFloat(calificaciones[posMax][1])) {
				posMax=fila;
			}
		}
		System.out.println(calificaciones[posMin][0]+" tiene la nota más baja con un: "+calificaciones[posMin][1]);
		System.out.println(calificaciones[posMax][0]+" tiene la nota más alta con un: "+calificaciones[posMax][1]);
	}

}
