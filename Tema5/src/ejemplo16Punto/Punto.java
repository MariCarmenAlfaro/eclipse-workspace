
package ejemplo16Punto;

public class Punto {

	// Atributos
	int x;
	int y;
	String color;

	// Constructores
	// p2
	Punto() {

	}

	// P3
	Punto(String color) {
		this(0, 0, color);
	}

	// p4
	Punto(int x, int y) {
		this(x, y, "Negro");
	}

	// p1
	Punto(int x, int y, String color) {
		this.x = x;
		this.y = y;
		this.color = color;

	}

	// Métodos
	void mostrar() {
		System.out.println("\nPunto ");
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println("Color: " + color);

	}

	// El metodo desplazar esta sobrecargado porque hay
	// varias versiones con distintos parametros(distinta firma
	void desplazar(int dx) {
		x = x + dx;

	}

	void desplazar(int dx, int dy) {
		x = x + dx;
		y = y + dy;
	}

}