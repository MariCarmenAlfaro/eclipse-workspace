package repasoExam;

/*6.- La siguiente tabla guarda una serie de calificaciones de varios alumnos. Guárdalas en un array,
muéstralas en pantalla y calcula la nota media del curso.
*/
public class Act16 {

	public static void main(String[] args) {
		/*
		 * Jose Luis Martínez 7 Antonia Ruiz 9 Marcos Ramírez 10 Juana Herranz 4 Alberto
		 * López 7
		 */
		String medias[][] = { { "Jose Mart", "7" }, { "Antonia", "9" }, { "Marcos", "10" }, { "Juana", "4" },
				{ "Albert", "7" } };
		float total = 0;
		for (int fila = 0; fila < medias.length; fila++) {
			total = total + Float.parseFloat(medias[fila][1]);
			
		}
		System.out.println("Media " + total / medias.length);

	}

}
