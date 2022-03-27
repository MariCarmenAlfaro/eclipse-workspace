package ejerciciosarrays1;

/*5.- Crea un array llamado notas con cinco posiciones y ve asignando a cada una de ellas el valor de
un examen que hayas hecho este curso (no s�lo de programaci�n). Haz que despu�s se muestren
todos los valores mediante un bucle while.*/
public class Ejer5 {
	
	public static void main(String[] args) {
		int i=1;
		float notas[] = new float[5];
		notas[1] = 9.5F;
		notas[2] = 8.25F;
		notas[3] = 6.5F;
		notas[4] = 5.9F;
		
  while(i <notas.length) {
	  System.out.println(notas[i]);
	i++;  
  }
	}

}
