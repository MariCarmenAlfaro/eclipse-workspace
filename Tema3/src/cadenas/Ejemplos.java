package cadenas;

import java.util.Arrays;

public class Ejemplos {

	public static void main(String[] args) {
		// Método length.
		String frase = "No hay mal que por bien no venga bien";
		System.out.println("La frase: \"" + frase + "\" tiene " + frase.length() + " caracteres");

		// Método charAt.
		System.out.println("La primera letra de la frase anterior es: " + frase.charAt(0) + "\n");

		// Método replace(char 'caracter_antiguo', char 'caracter_nuevo').
		System.out.println("En esta frase se cambia el \"N\" por el \"M\"\n" + frase.replace('N', 'M') + "\n");

		// Método replace(CharSequence cadena_antigua, CharSequence cadena_nueva)
		System.out.println("En esta frase se cambia el \"No\" por el \"Si\"\n" + frase.replace("No", "Si") + "\n");

		// Método indexOf(String textoAbuscar)
		System.out.println(
				"Aqui se muestra en que posición se encuentra el primer caracter \"a\"-> " + frase.indexOf("a") + "\n");

		// Método lastIndexOf (String textoAbuscar)
		System.out.println("Aqui se muestra en que posición se encuentra el último caracter \"a\"-> "
				+ frase.lastIndexOf("a") + "\n");

		// Método compareTo(String textoPorComparar)
		String letra1 = "marta";
		String letra2 = "mari";

		System.out.println("Tenemos "+letra1+" y "+letra2+", se comparan y da-> "+ letra1.compareTo(letra2)+" siendo un resultado POSITIVO, entonces "+ letra1+ " es MAYOR que "+
		letra2+" ya que \"t\" va después que la \"i\" en el orden alfabético.");
		
		String letra3= "Zapato";
		String letra4 ="Árbol";
		System.out.println("Tenemos "+letra3+" y "+letra4+", se comparan y da-> "+ letra3.compareTo(letra4)+" siendo un resultado NEGATIVO, entonces "+ letra3+ " es MENOR que "+
		letra4+" ya que \"Z\" va después que la \"Á\" en el orden alfabético.\n");

		//Método String substring(int inicio, int fin) 
		
		System.out.println("Puedo sacar la parte de nuestra frase que quieras, yo te mostraré lo que pone desde la posición 2(la coge)1 hasta la 34(ahi estáel stop, antes de esa)-> \""+frase.substring(21, 34)+"\"\n");
		
		//Método String[ ] split(String separador)
		String palabrasSueltas[]=frase.split(" ");
		System.out.println("Las palabras sueltas de la primera frase son: ");
		System.out.println(Arrays.toString(palabrasSueltas)+"\n");
		
		//Método String String.valueOf(número)
		float estatura= 1.75F;
		String estaturaComoString= String.valueOf(estatura);
		//Concatenar y sirve igual String estaturaComoString=" "+ estatura
	}

}
