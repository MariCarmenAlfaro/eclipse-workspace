package ejerciciosbucles;
//- Crea un programa que muestre las diez primeras potencias del número 2 (o sea, 2, 4, 8, 16, etc.). 
public class ejercicio16 {

	public static void main(String[] args) {
		int potencia =1;
		
 for (int i=1; i<=10;i++) {
 potencia = potencia *2;
 System.out.println(i + ")" + potencia);
 }
	}

}
