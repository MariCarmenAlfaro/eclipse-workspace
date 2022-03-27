/*package ejerciciosarrays2;

//6.- La siguiente tabla guarda una serie de calificaciones de varios alumnos. Guárdalas en un array,
//muéstralas en pantalla y calcula la nota media del curso.
public class Act16 {

	public static void main(String[] args) {
		String alumnos[][] = { { "Jose Luis Martínez", "7" }, { "	Antonia Ruiz", "9" }, { "Marcos Ramírez", "10" },
				{ "Juana Herranz", "4" }, { "Alberto López", "7" } };
		System.out.println("Estas son las notas de los alumnos");
		float total=0;
		for (int fila = 0; fila < alumnos.length; fila++) {
			System.out.println(alumnos[fila][1]);
			total=total+Float.parseFloat(alumnos[fila][1]);
			for (int columna = 0; columna < alumnos[0].length; columna++) {
				System.out.println(alumnos[fila][columna]);
			}
		}
		
		System.out.println("La nota media del curso "+total/alumnos.length);	
		
	}

}*/
package ejerciciosarrays2;

public class Act16 {

	public static void main(String[] args) {

		String calificaciones[][] = { { "Jose Luis Martinez", "7" }, { "Antonia Ruiz", "9" },
				{ "Marcos Ramirez", "10" }, { "Juana Herranz", "4" }, { "Alberto Lopez", "7" } };

		float total = 0;
		for (int fila = 0; fila 
				< calificaciones.length; fila++) {

			total = total + Float.parseFloat(calificaciones[fila][1]);

			System.out.println();

			for (int columna = 0; columna 
					< calificaciones[0].length; columna++) {

				System.out.print(calificaciones[fila][columna] + " ");
			}

		}
		System.out.println("\n");
		System.out.println("La nota media del curso " 
		+ total / calificaciones.length);

	}

}