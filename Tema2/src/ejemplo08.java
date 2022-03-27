


/*prog q pregunta el precio del producto. si es menor de 50e, no tendra descuento, si esta entre 50 y 100 (incluidos)
tendra el 5% descuento. si eta entre 100 y 200 (incluyendo 200) tendra un 10% desct. en otro caso tendra un 15%
 */

 import java.util.Scanner;
public class ejemplo08 {

	public static void main(String[] args) {
 Scanner entrada = new Scanner(System.in);
		
 //pedimos el precio
 System.out.print("Precio: ");
  float precio = entrada.nextFloat();
  
  // en funcion del precio, indicaremos el descuento
  if (precio <50) {
	 System.out.println("Descuento =0"); 
  } else if (precio <=100) {
	  System.out.println("descuento =5");
  } else if (precio <= 200) {
	  System.out.println("Descuento = 10");
  } else {
	  System.out.println("Descuento = 15");
  }
 
 
 
 
 
		
		
		
	}

}
