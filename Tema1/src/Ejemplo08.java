
public class Ejemplo08 {

	public static void main(String[] args) {
	
	int asistentes = 5000;
	//Conversión implicita
	long personas = asistentes;
	
	System.out.println(personas);
	
	//Conversión implicita
	
	float gente = personas;
	
	System.out.println(gente);
	
	
	//Conversion explicita
	long jugadores = 1000;
	int players = (int)jugadores; //cast (poner que si que cabe)
	System.out.println(players);
	
	//Conversion explicita
	double precio = 2300.50;
	
	float precio2 = (float) precio; 
	
	
	
	
	}

}
