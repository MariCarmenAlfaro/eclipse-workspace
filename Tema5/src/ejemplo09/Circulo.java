package ejemplo09;

public class Circulo {

	// Atributos
	int x;
	int y;
	int radio;
	String color;

	// Constructores.
	Circulo(){
		
	}
	
	Circulo(int radio){
		x=0;
		y=0;
		this.radio=radio;
		color="Turquesa";
	}
	
	Circulo(int x, int y, int radio, String color) {

		this.x = x;
		this.y = y;
		this.radio = radio;
		this.color = color;
		
	}

	// Métodos
	void mostrar() {

		System.out.println("X: " + x);
		System.out.println("Y: " + y);
		System.out.println("Radio: " + radio);
		System.out.println("Color: " + color);

	}

	double area() {

		return Math.PI * radio * radio;

	}

	double perimetro() {

		return 2 * Math.PI * radio;

	}

}