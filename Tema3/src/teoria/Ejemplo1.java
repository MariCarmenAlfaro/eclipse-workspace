package teoria;

public class Ejemplo1 {
//crear arrays y dar valor a las celdas individualmente
	public static void main(String[] args) {

		float precios [] = new float [10];
		// tambien se puede: float [] precios = new float [5];
		
		precios[0]= 25;
		precios [1]=23.50F;
		precios [2]=24.3F;
		precios[3]= 26;
		precios [4]=25.5F;
		
		System.out.println("En la posicion 0 se encuentra "+ precios[0]);
		System.out.println("En la posicion 1 se encuentra " + precios[0]);
		System.out.println("La suma de los dos primeros precios es de "+ (precios[0] + precios[1]));
		
		
		
		
		
	}

}
