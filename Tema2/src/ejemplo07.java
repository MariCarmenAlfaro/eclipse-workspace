import java.util.Scanner;
public class ejemplo07 {

	public static void main(String[] args) {
//si te llamas pablo puedes pasar si no, no
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("nombre");
		String nombre = entrada.nextLine();
		
		if (nombre.equals("Pablo")) {
			System.out.println("puedes pasar"); 
		} else {
			System.out.println("no puedes pasar");
		}
		
		
		
	}

}
