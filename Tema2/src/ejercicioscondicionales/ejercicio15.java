package ejercicioscondicionales;
//15.- Crea un programa que pida un número de mes entre 1 y 12. A continuación devolverá el
//número de días de ese mes. Supón que no existen años bisiestos.
import java.util.Scanner;
public class ejercicio15 {

	public static void main(String[] args) {
   Scanner entrada = new Scanner (System.in);
   System.out.println("Dime un numero del 1 al 12 y te diré cuantos diás tiene el mes: ");
		int cantidadDias= entrada.nextInt();
   switch (cantidadDias) {
	 case 1:
		 System.out.println("Enero tiene 31 días");
	 break;
	 case 2:
		 System.out.println("Febreo tiene 28 días");
	 break;
	 case 3:
		 System.out.println("Marzo tiene 31 días");
	 break;
	 case 4:
		 System.out.println("Abril tiene 30 días");
	 break;
	 case 5:
		 System.out.println("Mayo tiene 31 días");
	 break;
	 case 6:
		 System.out.println("Junio tiene 30 días");
	 break;
	 case 7:
		 System.out.println("Julio tiene 31 días");
	 break;
	 case 8:
		 System.out.println("Agosto tiene 31 días");
	 break;
	 case 9:
		 System.out.println("Septiembre tiene 30 días");
	 break;
	 case 10:
		 System.out.println("Octubre tiene 31 días");
	 break;
	 case 11:
		 System.out.println("Noviembre tiene 30 días");
	 break;
	 case 12:
		 System.out.println("Diciembre tiene 31 días");
	 break;
	 default:
		 System.out.println("No existe");
		
		
	}
}  
	}
