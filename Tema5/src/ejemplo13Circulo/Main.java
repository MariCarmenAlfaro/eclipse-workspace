package ejemplo13Circulo;

public class Main {

	public static void main(String[] args) {
		
		Circulo circulo4 = new Circulo(16, 29, 31, "Morado");
//			circulo4.x =16;
//			circulo4.y =29;
//			circulo4.radio =31;
//			circulo4.color = "Morado";
		
		Circulo circulo1= new Circulo();
		Circulo circulo2 =new Circulo(29);
		
		Circulo circulo3 = new Circulo( "Azul");

		circulo1.mostrar();
		circulo2.mostrar();
		circulo3.mostrar();
		circulo4.mostrar();
		
	}

}