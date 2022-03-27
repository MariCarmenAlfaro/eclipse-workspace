package ejemplo03;

import java.util.Scanner;

public class Main {

  	public static void main(String[] args) {
  		
  		Scanner entrada=new Scanner(System.in);
  		Persona persona1 = new Persona();
  		
  		//leemos los datos de persona1 desde terminal
  		System.out.println("Nombre: ");
  		persona1.nombre=entrada.nextLine();
  		
  		System.out.println("Apelldios: ");
  		persona1.apellidos=entrada.nextLine();
  		
  		System.out.println("Edad: ");
  		persona1.edad=entrada.nextInt();
  		
  		//Lo mostramos
  		persona1.mostrar();
	}

}
