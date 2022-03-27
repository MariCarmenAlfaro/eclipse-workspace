
public class Ejemplo06 {

	public static void main(String[] args) {

		boolean a = true; //EStamos en 2021
		boolean b = true;//Esto es primero de superior
		boolean c = false; //Es verano
		boolean d = false; //Estamos en la edad media.
		System.out.println("a AND b: " + (a&&b));		
		System.out.println("a AND b: " + (a&&c));	
		
		System.out.println("a or b: " + (a||b));		
		System.out.println("a or c: " + (a||c));		
		System.out.println("c or d: " + (c||d));
		
		System.out.println("NOT a: " + (!a));		
		System.out.println("NOT c: " + (!c));	
		
		System.out.println("a == b: " + (a ==b));
		System.out.println("a != b: " + (a !=b));

		
	}

}
