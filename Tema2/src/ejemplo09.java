import java.util.Scanner;
public class ejemplo09 {

	public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
    System.out.println("Escribe un numero de aula: ");
		int aula = entrada.nextInt ();
		//aula 1-> 1R grado sup
		//a 2 -> 2n grad supe
		//a3 ->1r grad medio
		//a4 -> 2n grad medio
		
		//version usando if-else-if
//		if (aula==1) {
//			System.out.println("Primer grado superior");
//		}else if (aula ==2) {
//			System.out.println("Segundo grado superior");
//		}else if (aula ==3) {
//			System.out.println("Primer grado medio");
//		}else if (aula ==4) {
//			System.out.println("Segundo grado medio");
//		}else {
//			System.out.println("no existe");
//		}
		
		//version usando switch
		switch (aula) {
		case 1:
			System.out.println("Primer grado superior");	
			break;
		case 2:
			System.out.println("Segundo grado superior");
			break;
		case 3:
			System.out.println("Primer grado medio");
             break;
		case 4:
			System.out.println("Segundo grado medio");
              break;
              default:
            	  System.out.println("no existe");

		}
		
	}

}
