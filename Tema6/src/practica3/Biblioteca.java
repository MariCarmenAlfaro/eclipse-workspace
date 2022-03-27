package practica3;


public class Biblioteca {
	// Atributos
	private Libro[] libros;
	private int numLibros = 0;
	private int idNuevoLibro = 1;

	// Métodos
	public Biblioteca(int maxLibros) {
		numLibros = maxLibros;
		libros = new Libro[maxLibros];
	}

	public boolean addLibro(Libro libro) {
		// Para agregar un libro a nuestra biblioteca debemos comprobar que dónde la
		// vamos a poner haya un hueco, le daremos valor al nuestro id
		// usando la posición en la que estará colocada y se irá haciendo una suma,
		// tanto en la posición del id, como de la suma de las cantidades, y entonces en
		// esa posición registraremos ése libro. Y en el caso que no hubiera ningún
		// null, nos devolveria un falso
		for (int i = 0; i < libros.length; i++) {
			if (libros[i] == null) {
				libro.setId(idNuevoLibro);
				idNuevoLibro++;

				libros[i] = libro;
				numLibros++;
				return true;

			}

		}
		return false;

	}

	public void delLibro(int idLibro) {
		// Tenemos el bucle para recorrer el array en busca del mismo Id que
		// intruduzcamos y que no sea nulo, para eliminarlo.
		// Creamos una variable donde nos guardara que posición hemos eliminado.

		int posicionEliminada = 0;
		for (int i = 0; i < libros.length; i++) {
			if (libros[i] != null && libros[i].getId() == idLibro) {
				libros[i] = null;
				posicionEliminada = i;
			}
		}
		// En el siguiente bucle, empezamos a leer desde dicho lugar y con el
		// condicional miramos que sea nula, que la siguiente posición no sea nula
		// también,
		// ya que no podemos cambiar de sitio otro nulo y que ese lugar no sea el de
		// úlima posición ya que no se puede buscar nada en el más allá.
		// Siendo asi el intercambio, mover posición de abajo para arriba y la de abajo
		// quedando nula.
		for (int i = posicionEliminada; i < libros.length; i++) {
			if (libros[i] == null && (i + 1 < libros.length - 1) && libros[i + 1] != null) {
				libros[i] = libros[i + 1];
				libros[i + 1] = null;
			}

		}

	}
	//Mostramos en una linda tabla los libros de nuestra Biblioteca, con un bucle para leerlos todos y con un condicional para que no nos lea los huecos sin rellenar
	public void listarLibros() {
		System.out.printf("\n%-5s %-30s %-50s %-15s %-10s\n", "Id", "Título", "Autor", "Editorial", "Año");
		System.out.println("=========================================================================");
		for (int i = 0; i < libros.length; i++) {
			if (libros[i] != null) {

				System.out.printf("%-5s %-30s %-50s %-15s %-10s\n", libros[i].getId(), libros[i].getTitulo(),
						libros[i].obtenerCadenaAutores(), libros[i].getEditorial(), libros[i].getAnyoPublicacion());
			}

		}

	}

	public Libro[] getLibros() {
		return libros;
	}

	public void setLibros(Libro[] libros) {
		this.libros = libros;
	}

	public int getNumLibros() {
		return numLibros;
	}

	public void setNumLibros(int numLibros) {
		this.numLibros = numLibros;
	}

	public int getIdNuevoLibro() {
		return idNuevoLibro;
	}

	public void setIdNuevoLibro(int idNuevoLibro) {
		this.idNuevoLibro = idNuevoLibro;
	}

}
