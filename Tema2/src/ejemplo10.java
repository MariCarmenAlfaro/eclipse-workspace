import java.util.Scanner;
public class ejemplo10 {

	public static void main(String[] args) {
Scanner entrada= new Scanner (System.in);
 System.out.println("Nota (nombre)");
  String calificacion = entrada.nextLine();
   // Insuficiente -> 2.5
  //Suficiente ->5
  //Bien->5
  //Notable->8
  //Sobresaliente->9.5
 
  switch (calificacion) {
  case "Insuficiente":
	  System.out.println("2.5");
  break;
  case "Suficiente":
	  System.out.println("5");
  break;
  case "Bien":
	  System.out.println("6");
	  break;
  case "Notable":
	  System.out.println("8");
 break;
  case "Sobresaliente":
	  System.out.println("9.5");
  break;
  default:
	  System.out.println("La nota no es valida");
  }
  
  
  
  
  
  
  
	}

}
