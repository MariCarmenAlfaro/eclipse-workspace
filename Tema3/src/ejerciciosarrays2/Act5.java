package ejerciciosarrays2;
/*5.- Escribe un programa que guarde las siguientes temperaturas en un array y busque su máximo y
mínimo. Además deberá indicar en qué posición del array están ese máximo y mínimo.
*/
public class Act5 {

	public static void main(String[] args) {
 double temp[]= {15, 16.1, 16, 15.4, 15, 14, 10.2, 11, 11.5, 10, 10.1, 9.8, 9, 6};
 double min = temp[0];
 double max= temp[0];
 //variables q guardaran la posiciondel min y max
 int posiMin=0;
 int posiMax=0;
 int i;
 for (i =1; i<temp.length;i++) {
	 if (temp[i]<min) {
		 min=temp[i];
		 posiMin=i;
	 }else if (temp[i]>max) {
		 max=temp[i];
		 posiMax=i;
	 }
 }
 System.out.println("la temperatura más alta es " + max + " ºC y esta en la posicion " + posiMax
 		+ "\ny la temperatura más baja es "+ min+ " ºC y esta en la posicion " + posiMin);
 
 
 
 
 
	}

}
