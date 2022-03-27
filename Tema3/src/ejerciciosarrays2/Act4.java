package ejerciciosarrays2;

import java.util.Scanner;

/*4.- Escribe un programa que pida 10 precios de productos y los guarde en un array llamado
productos. Después recorrerá el array hasta encontrar un precio menor que 0. Si lo encuentra
escribirá el mensaje "Se ha encontrado un valor no válido en la posición x. El programa terminará"
(x es la posición del array donde está ese dato). Si no lo encuentra, calculará la suma de todos los
precios y la mostrará
Utiliza una variable semáforo llamada preciosCorrectos, que valdrá true si todos los precios son
mayores o iguales a cero, y false si se encuentra un número negativo.*/ 
public class Act4 {

	public static void main(String[] args) {

		Scanner entrada= new Scanner (System.in);
		System.out.println("Dime los precios de tus 10 productos!");
		float productos[]= new float[10];
		int posicion=0;
		float total=0;
		boolean preciosCorrectos=true;
		
		for(int i =0; i<productos.length;i++) {
			System.out.println("Precio "+(i+1));
			productos[i]=entrada.nextFloat();
			
		}
		for( int i =0; i<productos.length;i++) {
			total=total+productos[i];
			if(productos[i]<0) {
				preciosCorrectos = false;
				posicion=i;
				System.out.println("Se ha encontrado un valor no válido en la posicion "+ (posicion+1) );
				break;
			}
			
		}
		if (preciosCorrectos) {
	
			System.out.println("el total de tus productos es "+total);
			
		}
			
		
		
		
	}

}
