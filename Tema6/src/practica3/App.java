package practica3;

public class App {
	public static void main(String[] args) {
		//Autores de los libros
		String autoresL1[] = { "Marta Alfaro", "Elisa Muñoz" };
		String autoresL2[] = { "Juan Palomo", "Pepe Villuela", "Emiliano Fernández" };
		String autoresL3[] = { "Srta Bebi" };
		
		//Datos de los libros
		Libro libro1 = new Libro("Mamá", autoresL1, "Norma", 2018);
		Libro libro2 = new Libro("La ardilla Pol", autoresL2, "Santillana", 2000);
		Libro libro3 = new Libro("Memorias de una salvaje", autoresL3, "Planeta", 2018);
		
		//System.out.println(libro2.obtenerCadenaAutores());
		//System.out.println(libro2.toString());

		//Nuestra biblioteca
		Biblioteca Biblioteca = new Biblioteca(5);
		
		//Añadimos libros
		Biblioteca.addLibro(libro1);
		Biblioteca.addLibro(libro2);
		Biblioteca.addLibro(libro3);
		
		Biblioteca.listarLibros();
		
		//Elimino el primero
		Biblioteca.delLibro(1);
		
		Biblioteca.listarLibros();

		
	}
}
