package ejerciciosarrays2;
/*5.- Escribe un programa que guarde las siguientes temperaturas en un array y busque su m�ximo y
m�nimo. Adem�s deber� indicar en qu� posici�n del array est�n ese m�ximo y m�nimo.
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
 System.out.println("la temperatura m�s alta es " + max + " �C y esta en la posicion " + posiMax
 		+ "\ny la temperatura m�s baja es "+ min+ " �C y esta en la posicion " + posiMin);
 
 
 
 
 
	}

}
