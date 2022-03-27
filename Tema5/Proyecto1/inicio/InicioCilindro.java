package inicio;

import geometria.Cilindro;

public class InicioCilindro {

	public static void main(String[] args) {
		
		Cilindro cili1 = new Cilindro();
		Cilindro cili2= new Cilindro (20, 50);
		
		System.out.println("Area de nuestro cilindro "+cili2.area());
		System.out.println("Volumen del cilindro "+cili2.volumen());
		System.out.println(cili2.toString());
	}

}
