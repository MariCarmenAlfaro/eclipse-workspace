package ejemplo09;

public class Main {

	public static void main(String[] args) {
		
		Circulo circulo3  = new Circulo();
			circulo3.x =16;
			circulo3.y =29;
			circulo3.radio =31;
			circulo3.color = "Morado";
		
		
		Circulo circulo2 =new Circulo(29);
		
		Circulo circulo1 = new Circulo(10, 20, 5, "Azul");

		circulo1.mostrar();
		circulo2.mostrar();
		circulo3.mostrar();
		System.out.println("Area "+circulo1.area());
		System.out.println("Perimetro "+circulo3.perimetro());
		
	}

}