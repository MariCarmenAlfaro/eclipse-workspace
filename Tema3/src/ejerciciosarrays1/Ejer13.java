package ejerciciosarrays1;
/*13.- Crea un programa que rellene un array llamado potencias con las primeras 20 potencias de 2.
Haz que después se muestren todos los valores mediante un bucle while.
*/
public class Ejer13 {

	public static void main(String[] args) {
		int potencias[]= new int[20];
		int potencia=2;
		
		int i=0;
  while (i<potencias.length) {
	  System.out.println(potencia);
	  potencias[i]=potencia;
	  potencia=potencia*2;
	  i++;
  }
	System.out.println("potencias de 2 guardadas");	
		while( i<potencias.length) {
			System.out.println(potencias[i]);
			i++;
		}
		
		
	}

}
