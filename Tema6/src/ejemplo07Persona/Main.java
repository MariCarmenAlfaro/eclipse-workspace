package ejemplo07Persona;

public class Main {
	
	public static void main(String[] args) {
		//En ocasiones es util sobreescribir el metodo equals() de una clase para ajustarlo a lo que
		//nosotros entendemos como que dos objetos son iguales.
		
		Cliente cliente1 = new Cliente("656478G", "Elisa", "Muñoz", "987-654-321");
		Cliente cliente2 = new Cliente("656478G", "Elisa", "Muñoz", "987-654-321");

		if(cliente1.equals(cliente2)) {
			System.out.println("Son iguales");
		}else {
			System.out.println("Son diferentes");
		}
		
		
		
		
		
	}

}