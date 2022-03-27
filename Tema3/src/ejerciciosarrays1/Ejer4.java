package ejerciciosarrays1;

/*4.- Crea un array llamado companyeros con 4 posiciones y ve asignando a cada una de ellas el
nombre de uno de los cuatro compañeros más cercanos a tu sitio. Haz que después se muestren
todos los valores mediante un bucle for*/
public class Ejer4 {
	public static void main(String[] args) {

		String companyeros [] = new String[4];
		companyeros[1] = "Jose";
		companyeros[2]= "Alejandro";
		companyeros[3]="Ivan";
	    companyeros[4]="La Mari";
		for (int i=0; i<companyeros.length; i++) {
			System.out.println(companyeros[i]);
		}
		
		
		
		
	}

}
