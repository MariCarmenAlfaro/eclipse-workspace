package ejemplo04;

public class Punto {
	//Atributos
	int x;
	int y;
	String color;
	
	//Métodos
	void mostrar() {
		System.out.println("El punto!");
		System.out.println("==============");
		System.out.println("x : "+x);
		System.out.println("y : "+y);
		System.out.println("Color: "+color+"\n");
	}
	void desplazar(int dx) {
		
		x=x+dx;
		
	}
}
