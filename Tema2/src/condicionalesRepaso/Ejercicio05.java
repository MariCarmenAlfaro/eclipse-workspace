package condicionalesRepaso;
import java.util.Scanner;
/*5.- Diseña una aplicación donde un usuario pueda elegir el idioma de una frase de saludo. En primer
lugar se mostrará un menú:
(1) Francés
(2) Inglés
(3) Alemán
(4) Italiano
El usuario escribirá un número entero entre 1 y 4 para señalar qué opción quiere y, a continuación,
aparecerá la frase "Buenos días" en el idioma que corresponda (puedes usar Google translator). Si
escribe otro número, el mensaje se mostrará en español.
Utiliza la instrucción switch.*/
public class Ejercicio05 {
	public static void main(String[] args) {
Scanner entrada = new Scanner (System.in);
System.out.println("En que idioma desea el saludo. \n1)Francés\n2)Inglés\n3)Alemán\n4)Italiano");
  int idioma = entrada.nextInt();
  
   switch (idioma) {
   case 1 :
	   System.out.println("Bonjour!");
	   break;
   case 2:
	   System.out.println("Good Morning!");
	   break;
   case 3:
	   System.out.println("Guten Morgen!");
	   break;
   case 4:
	   System.out.println("Buon Giorno!");
	   break;
	   default: 
		   System.out.println("¡Buenos dias!");
   }


	}

}
