package hoja2ejercicios;
import java.util.Scanner;
/*5.- Diseña un programa que invente un número aleatorio. A continuación pedirá al usuario que lo
adivine. Si el usuario falla, entonces el programa le dará otra oportunidad. Una vez que el usuario
adivina el número o falla tres veces, el programa termina.
Utiliza un bucle do-while.
Ayuda: Puedes generar un número aleatorio mayor o igual a 0 y menor que 1 con la orden
Math.random( ). Si lo multiplicas por 10 y le sumas 1, entonces obtendrás un número entre 1 y 10,
ambos inclusive:
(int) (Math.random()*10 + 1)*/
public class Ejer5 {
	public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      
	  int num = (int) (Math.random()*10) + 1;
	  System.out.println(num);
	  int i=1;
	  System.out.println("Adivina el numero entre el 1 y el 10. Tienes 3 intentos");
	  
      do {
    	  System.out.println("Numero: ");
    	  int numero = entrada.nextInt();
    	  if ( numero !=num) {
    		  System.out.println("Has fallado, te quedan " + (3-i) + " intentos");
    	  }else {
    		  System.out.println("Enhorabuena");
    	 break; }
    	 
    	  i++;
      }while (i<=3);
      
      
      
      
      
      
}
}