package practica2;
import java.util.Scanner;
/*Crea un programa que preguntará al usuario cuál es el número atómico del hierro. Si acierta, le
felicitará. Si dice un número incorrecto, le dirá que pruebe otra vez. Si escribe algo que no es un
número, le avisará y le dirá que pruebe otra vez*/
public class ejer1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("-----¡JUEGUEMOS CON QUÍMICA!-----");
  int num;
  
   for (int i=1;i>0;i++) {
	   
	   System.out.println("¿Cuál es el número atómico del hierro?");

	   if (entrada.hasNextInt()) {
		   num = entrada.nextInt(); 
		   if (num==26) {
			   System.out.println("¡¡ENHORABUENA!!Acertaste");
			    break;
		   }else {
			   System.out.println("Ohh, fallaste, ¡vuelve a intentarlo!\n");
			  
		   }
		   
	   }else {
		  entrada.nextLine();
		   System.out.println("Por favor, introduzca un número entero");
		   entrada.nextLine();
	   }
	   
	  
	   
	   
	  
   }
    
  
  
   }
  
  
	}

