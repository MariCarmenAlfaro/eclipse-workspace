package ejercicios1;

/*11.- Crea un método que tome un array de Strings, y un String. Devolverá la posición del String
dentro del array, ó -1 si no lo encuentra. Utiliza dos instrucciones return.
Por ejemplo, teniendo el array siguiente:
String[ ] planetas = {"Mercurio", "Venus", "Tierra", "Marte", "Júpiter", "Saturno", "Urano",
"Neptuno", "Plutón"};
• buscar(planetas, "Tierra") debería devolver 2 porque el String "Tierra" está en la posición 2
del array.
• buscar(planetas, "Caronte") debería devolver -1 porque el String "Caronte" no está en el
array*/
public class Ejer11 {

	public static void main(String[] args) {

		String[] planetas = { "Mercurio", "Venus", "Tierra", "Marte", "Júpiter", "Saturno", "Urano", "Neptuno",
				"Plutón" };

		int posicion = buscar(planetas, "Venus");
		
		if(posicion!= -1) {
			System.out.println("El planeta esta en la posicion "+ posicion);
		}else {
			System.out.println("La palabra no se encuentra en el array");
		}
		
	}

	static int buscar(String planetas[], String planeta) {
		
		for (int i = 0; i < planetas.length; i++) {
			if (planetas[i].equals(planeta)) {
				return i;
			}
		}
		return -1;
		
	}

}
