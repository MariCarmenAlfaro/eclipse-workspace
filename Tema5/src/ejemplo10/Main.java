package ejemplo10;

public class Main {

	public static void main(String[] args) {

		Rectangulo r1 = new Rectangulo (20, 50, 40, 10, "Rosa");
		
		Rectangulo r2= new Rectangulo();
		
		r2.x = 20;
		r2.y = 30;
		r2.base = 10;
		r2.altura = 5;
		r2.color = "Rojo";

		r1.mostrar();

		System.out.println("Área: " + r1.area());
		System.out.println("Perímetro: " + r1.perimetro());

//		r1.desplazar(30, 5);
		r2.mostrar();

		System.out.println(r1.estaDentro(45, 55));
		System.out.println(r1.estaDentro(100, 100)+"\n");
		
		Rectangulo r3 =new Rectangulo(10, 10, 10, 10);
		
		r3.mostrar();

	}

}