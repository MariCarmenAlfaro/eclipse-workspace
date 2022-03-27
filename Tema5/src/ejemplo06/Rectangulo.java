package ejemplo06;

public class Rectangulo {
	// Atributos
	int base;
	int altura;
	// Coordenadas del vértice inferior izquierdo
	int x;
	int y;
	String color;

	// Métodos
	void mostrar() {
		System.out.println("¡Rectangulo!");
		System.out.println("============\n");
		System.out.println("Base: " + base);
		System.out.println("Altura: " + altura);
		System.out.println("X: " + x);
		System.out.println("Y: " + y);
		System.out.println("Color: " + color+"\n");

	}

	int area() {
		return base * altura;
	}

	int perimetro() {
		return (base * 2)+(altura*2);
	}
	//Desplaza el rectangulo dx px a la derecha y dy px hacia arriba
	void desplaza(int dx, int dy) {
		x=x+dx;
		y=y+dy;
	}
	//Devuelve true si el punto (a,b) esta dentro del rectangulo y false si no lo está.
	boolean estaDentro(int a, int b) {
	
		if (a>=x &&a <= x+base&& b>=y&& b<=y+altura) {
			return true;
		}
		return false;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
