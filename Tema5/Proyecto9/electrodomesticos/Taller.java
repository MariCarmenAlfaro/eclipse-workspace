package electrodomesticos;
/*Hemos hecho una variacion respecto al enunciado de la 
 * práctica para que el tamaño del array de lavadoras venga 
 * suministrado por el constructor*/
public class Taller {
	private final int MAX_LAVADORAS;
	private Lavadora[] lavadoras;
	private int numLavadoras=0;
	
	//Constructor
	//En la práctica no es así.
	public Taller( int capacidad) {
		MAX_LAVADORAS=capacidad;
		lavadoras=new Lavadora[MAX_LAVADORAS];
	}
	
	//Métodos
	public void listaLavadoras() {
		System.out.println("\nListado lavadoras");
		System.out.println("=================");
			for (int i = 0; i < lavadoras.length; i++) {
			if(lavadoras[i]!=null) {	
			System.out.println(lavadoras[i].toString()+"\n");
			}
		}
	}

	public void addLavadoras(Lavadora lav) {
		for (int i = 0; i < lavadoras.length; i++) {
			if (lavadoras[i] == null) {
				lavadoras[i] = lav;
				numLavadoras++;
				break;
			}
		}
	}

	public int buscaLavadoras(int id) {
		
		for (int i = 0; i < lavadoras.length; i++) {

			if (lavadoras[i] != null && lavadoras[i].getId() == id) {
				return i;
			}
		}
		return -1;
	}

	public int numLavadoras(){
		return numLavadoras;
	}
	public void borraLavadora (int id) {
		int pos = buscaLavadoras(id);

		if (pos != -1) {
			lavadoras[pos] = null;
			numLavadoras--;

		}
	}

	
	
	
	
	
	
	
	public Lavadora[] getLavadoras() {
		return lavadoras;
	}

	public void setLavadoras(Lavadora[] lavadoras) {
		this.lavadoras = lavadoras;
	}

	public int getMAX_LAVADORAS() {
		return MAX_LAVADORAS;
	}

}
