package biblioteca;

import biblioteca4.Autor;

public class Libro {

	private String titulo;
	private String isbn;
	private Autor[] autores;
	private static int anyoActual;

	public Libro(String titulo) {

		this.titulo = titulo;

	}

	public Libro(String titulo, String isbn, Autor[] autores) {

		this.titulo = titulo;
		this.isbn = isbn;
		this.autores = autores;

	}

	public String toString() {

		if (autores.length == 1) {
			// Mostramos el nombre del autor.
			return "Título: " + titulo + "\nISBN: " + isbn + "\nAutor: " + autores[0].getNombre() + "\nAño actual: "
					+ anyoActual;

		} else {
			// Mostramos "Varios autores".
			return "Título: " + titulo + "\nISBN: " + isbn + "\nAutor: " + "Varios autores" + "\nAño actual: "
					+ anyoActual;
		}

	}

	public void muestraAutores() {

		System.out.println("\nAutores del libro:");
		for (int i = 0; i < autores.length; i++) {
			System.out.println(" - " + autores[i].getNombre());
		}

	}
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor[] getAutores() {
		return autores;
	}

	public void setAutores(Autor[] autores) {
		this.autores = autores;
	}

	public static int getAnyoActual() {
		return anyoActual;
	}

	public static void setAnyoActual(int anyoActual) {
		Libro.anyoActual = anyoActual;
	}
	
}
