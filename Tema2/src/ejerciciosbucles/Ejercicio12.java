package ejerciciosbucles;

import java.util.Scanner;

/*12.- Trivial. Escribe una aplicación que haga una pregunta y muestre un menú con cuatro
posibles respuestas numeradas. Por ejemplo:

¿Quién es el autor de la novela "Ready Player One"?
1) Douglas Capland
2) Isaac Asimov
3) Ernest Cline
4) Ray Bradbury

Si el número introducido por el usuario no está entre uno y cuatro, se le volverá a repetir la 
pregunta hasta que lo esté. Finalmente se le dirá si ha acertado o fallado*/
public class Ejercicio12 {

	public static void main(String[] args) {
 Scanner entrada = new Scanner (System.in);
  
  int num;
 do {
	 System.out.println("¿Quién es el autor de la novela \"Ready Player One\"?\r\n"
  		+" 1) Douglas Capland\r\n"
  		+ "2) Isaac Asimov\r\n"
  		+ "3) Ernest Cline\r\n"
  		+"4) Ray Bradbury\r\n");
	 num = entrada.nextInt();
	 
		
 }while (num <1 || num > 4);
			
		if (num==1) {
			System.out.println("Correcto, acertaste");
		} else {
			System.out.println("No es el correcto");
		}
		
	}

}
