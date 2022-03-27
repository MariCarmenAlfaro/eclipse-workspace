package ejemplo05;

public class Main {
	public static void main(String[] args) {
		
		Circulo circ1 =new Circulo();
		
		circ1.radio=5;
		circ1.x=2;
		circ1.y=3;
		circ1.color="Rosa";
		
		circ1.mostrar();
		
		System.out.println("Area "+circ1.area());
		System.out.println("Perimetro: "+circ1.perimetro());
		}
}
