package ejemplo05;

public class Circulo {
	int radio;
	int x;
	int y;
	String color;
	
	void mostrar() {
		System.out.println("Círculo!");
		System.out.println("=========");
		System.out.println("Radio: "+radio);
		System.out.println("X: "+x);
		System.out.println("Y: "+y);
		System.out.println("Color: "+color);
	}
	
	double area() {
		return (Math.PI*radio*radio);
	}
	double perimetro(){
		return 2*Math.PI*radio;
	}
	
}
