package hoja2ejercicios;

//3.- Crea una aplicación que calcule una lista con las potencias de 3 menores que 12000. Haz que en
//cada pasada del bucle se muestre el exponente y el valor de la potencia. Utiliza un bucle do-while.
//Ayuda: Recuerda que para elevar un número a otro usamos la función Math.pow(base, exponente).
public class Ejer3 {

	public static void main(String[] args) {
		int potencia=1;
		int i=1;
		
 do {
     
     System.out.println(potencia);
     potencia= (int)Math.pow(3,i);
	 i++;
	   
 } while (potencia<12000) ;
		
			  

		
	}

}
