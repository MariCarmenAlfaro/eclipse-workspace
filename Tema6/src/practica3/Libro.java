package practica3;

public class Libro {
	//Atributos
	private int id;
	private String titulo;
	private String[] autores;
	private String editorial;
	private int anyoPublicacion;
	//Constructor
	public Libro( String titulo, String[] autores, String editorial, int anyoPublicacion) {
		this.titulo=titulo;
		this.autores=autores;
		this.editorial=editorial;
		this.anyoPublicacion=anyoPublicacion;
		
	}
	//Métodos
	//Tenemos un bucle para que recorra el array de los autores
	public String obtenerCadenaAutores(){
		String nombresAutores = "";
		for (int i = 0; i <= autores.length -1; i++) {
			//Con el condicional miramos cuál es el último nombre en el array para que se añada el ";" o no.
			//Creamos una variable donde se almacenarán los datos para más tarde poder imprimirla o darle valor en otro método.
			if (i == (autores.length -1)) {
				nombresAutores = nombresAutores + autores[i];
			}else {
				nombresAutores = nombresAutores + autores[i] + "; ";
			}
			
		}
		return nombresAutores;
			
	}
	public String toString() {
		
					return "\nId: "+id+"\nTítulo: "+titulo+"\nAutores: "+ obtenerCadenaAutores()+"\nEditorial: "+editorial+"\nAño de publicación: "+anyoPublicacion;

		
		
		
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String[] getAutores() {
		return autores;
	}
	public void setAutores(String[] autores) {
		this.autores = autores;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public int getAnyoPublicacion() {
		return anyoPublicacion;
	}
	public void setAnyoPublicacion(int anyoPublicacion) {
		this.anyoPublicacion = anyoPublicacion;
	}
	
}
