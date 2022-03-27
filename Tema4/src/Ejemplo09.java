public class Ejemplo09 {

	public static void main(String[] args) {

		System.out.println("El triple del número 3 es "+ triple(3));
		
		System.out.println("El area de un circulo con 5cm de radio es "+ areaCirculo(5));
		
		System.out.println("El volumen de una esfera con 10 cm de radio es "+ volumenEsfera(10));
		
		System.out.println("El area de un triangulo con 7cm de base y 9cm de altura es "+areaTriangulo(7, 9));
		
		System.out.println("La primera letra de la palabra consola es "+ inicialPalabra("Consola"));
		
		System.out.println("El precio de venta de un producto que cuesta 50€ con un 15% de descuento");
		System.out.println("y un 21% de IVA cuesta "+ precioVenta(50, 15, 21));
		
	}
	
	// Método triple(num)
	static int triple (int num) {
		return num*3;
	}

	// Método areaCirculo(r)
	static double areaCirculo (double radio) {
		return Math.PI*radio*radio;
	}

	// Método volumen Esfera (r)
	static double volumenEsfera(double radio) {
		return 4 * Math.PI *Math.pow(radio, 3)/3;
	}
	
	// Método areaTriangulo(base, altura)
	static float areaTriangulo (float base, float altura) {
		return (base*altura)/2;
	}
	
	// Métofo inicial (palabra)
	static char inicialPalabra (String palabra) {
		return palabra.charAt(0);
	}
	
	// Método precioVenta(precio, descuento, iva)
	static float precioVenta(float precio, float descuento, float iva) {
		float precioFinal = precio -precio*+descuento/100;
		precioFinal = precioFinal + precioFinal*iva/100;
		return precioFinal;
		
		
		
		
		
		
	}
}