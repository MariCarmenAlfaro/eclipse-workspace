package ejemplo08Circulo;

public class Main {

	public static void main(String[] args) {
		//Podemos declarar variables de tipo Figura2D
		//Dentro de una variable de tipo Figura2D podemos guardar un objeto de 1 clase que
		//implemente Figura2d.
		Figura2D figura1= new Circulo(10,1, 5, "Rosa");
		
		Figura2D figura2= new Cuadrado(20, 0, 0, "Morado");
		//Podemos llamar a los metodos de Circulo y Cuadradp que esten en la interfazz Figura2D.
		System.out.println("Area del circulo: "+figura1.area());
		
		System.out.println("Area del cuadrado: "+figura2.area());
		Circulo circulo1=new Circulo(5, 0,0,"Azul");
		//calcularArea(circulo1);
		System.out.println("Mostrando los datos del circulo");
		circulo1.mostrar();
		


	}
//	public static void calcularArea(Figura2D figuras) {
//		System.out.println("Area: "+figuras.area());
//	}
//	

}
