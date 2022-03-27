
import java.util.Scanner;
public class ejemplo13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("mes del año");
	int mes = entrada.nextInt();
	
	String mensaje;
	/*if (mes>=1 && mes <=12) {
		mensaje = "mes correcto";
	} else {
		mensaje = "mes no valido";
	*/
	//Operador ternario equivalente al if de arriba.
	mensaje = mes>=1 && mes <=12 ? "mes correcto": "mes no valido";
		System.out.println(mensaje);

	}

}
