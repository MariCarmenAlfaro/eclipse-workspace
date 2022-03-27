package actividad1;

public class Main {

	public static void main(String[] args) {
			//	Medio me1 = new Medio();
				Medio m1 = new Mp3("Cruz de navaja", 200, "Mecano", "Pop", 3);
				m1.reproducir();
				((Mp3)m1).guardar();
				Guardable o1 = new Ogg("Hijo de la luna", 180, "Mecano", "Pop", 2);
	}

}
