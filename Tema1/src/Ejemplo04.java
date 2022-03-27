
public class Ejemplo04 {

	public static void main(String[] args) {
    //Operaciones aritmeticas con números enteros
		int a, b;
		a= 20;
		b=6;
		
		System.out.println("Suma:" + (a+b));
		System.out.println("Resta:" + (a-b));
		System.out.println("Mutiplicación:" + (a*b));
		System.out.println("División:" + (a/b));
		System.out.println("Módulo:" + a % b);
		
		//Relacionales
		
		int a1, b1;
		a1 = 5;
		b1 = 5;
		boolean resultado; 
		resultado = (a1==b1);
		System.out.println("a1==b1: " + resultado);
		
		resultado = a1!=b1;
		System.out.println("a1!=b1: " + resultado);
		
		resultado = (a1<b1);
		System.out.println("a1<b1: " + resultado);
		
		//El uso habitaual de los operadores relacionales
		//es con instrucciones condicionales.
		if (a1 <= b1) {
			System.out.println("a1 es menor que b1");
			}
		
		
		
		

	}
}
