package practica2;
import java.util.Scanner;
/*Crea un programa que preguntar� al usuario cu�l es el n�mero at�mico del hierro. Si acierta, le
felicitar�. Si dice un n�mero incorrecto, le dir� que pruebe otra vez. Si escribe algo que no es un
n�mero, le avisar� y le dir� que pruebe otra vez*/
public class ejer1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("-----�JUEGUEMOS CON QU�MICA!-----");
  int num;
  
   for (int i=1;i>0;i++) {
	   
	   System.out.println("�Cu�l es el n�mero at�mico del hierro?");

	   if (entrada.hasNextInt()) {
		   num = entrada.nextInt(); 
		   if (num==26) {
			   System.out.println("��ENHORABUENA!!Acertaste");
			    break;
		   }else {
			   System.out.println("Ohh, fallaste, �vuelve a intentarlo!\n");
			  
		   }
		   
	   }else {
		  entrada.nextLine();
		   System.out.println("Por favor, introduzca un n�mero entero");
		   entrada.nextLine();
	   }
	   
	  
	   
	   
	  
   }
    
  
  
   }
  
  
	}

