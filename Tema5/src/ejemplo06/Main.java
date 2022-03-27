package ejemplo06;

public class Main {

	public static void main(String[] args) {
		 Rectangulo rec1 = new Rectangulo();
		 Rectangulo rec2 = new Rectangulo();
		rec1.altura=10;
		rec1.base=12;
		rec1.color="Rosa";
		rec1.x=2;
		rec1.y=1;
		
		rec1.mostrar();
		System.out.println("Area: "+rec1.area());
		System.out.println("Perimetro: "+rec1.perimetro());
		
		rec1.desplaza(1,2);
		rec1.mostrar();
		System.out.println("¿Está dentro?"+rec1.estaDentro( 5, 7));
	}

}
