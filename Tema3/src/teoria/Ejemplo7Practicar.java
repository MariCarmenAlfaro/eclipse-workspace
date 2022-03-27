package teoria;

/*Haz un programa que busque una busqueda de metodo de seleccion, ordenar un array*/
public class Ejemplo7Practicar {

	public static void main(String[] args) {

		double euros[] = { 50, 39.99, 45.85, 74, 31.50, 15.99 };

		double aux;
		int posiBarato;
		double total=0;

		for (int i = 0; i < euros.length; i++) {
			posiBarato = i;
			total=total+euros[i];
			for (int j = i; j < euros.length; j++) {

				if (euros[j] < euros[posiBarato]) {
					posiBarato = j;
				}
			}
			aux = euros[posiBarato];
			euros[posiBarato] = euros[i];
			euros[i] = aux;

		}
		for(int i=0;i<euros.length;i++) {
			System.out.println(euros[i]+" ");
			
		}
System.out.println(total);
	}

}
