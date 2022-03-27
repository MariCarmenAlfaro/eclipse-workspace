package practica2;

import java.util.Random;

public class Act1 {

	public static void main(String[] args) {
		// Tenemos nuestra lista de profesores guardados en orden alfabético
		String profesores[] = { "José Alfaro", "Mónica Bisellach", "Noelia Cantero", "Marta Esparcia", "Anna Guillemot",
				"Elisa Muñoz", "Marga Salom", "Tina Simon" };

		String aux;
		int numAleatorio1 = 0;
		int numAleatorio2 = 0;
		System.out.println("LISTA DE PROFESORES ORDENADA ALFABÉTICAMENTE\n =========================================== ");
		for (int i = 0; i < profesores.length; i++) {
		System.out.println(profesores[i]);	
		}
		
		
		// Tenemos un bucle dónde nos saca 20 veces, 2 números aleatorios y los
		// intercambia de posición entre sí.
		for (int i = 0; i < 20; i++) {

			numAleatorio1 = (int) (Math.random() * 8);
			numAleatorio2 = (int) (Math.random() * 8);

			aux = profesores[numAleatorio1];
			profesores[numAleatorio1] = profesores[numAleatorio2];
			profesores[numAleatorio2] = aux;
		}
        // Y aquí uyna vez cambiadas las posiciones, mostramos con otro bucle, la nueva lista reorganizada.
		System.out.println("\nLISTA DE PROFESORES ORGANIZADAS ALEATORIAMENTE\n =========================================== ");
		for (int i = 0; i < profesores.length; i++) {
			System.out.println(profesores[i]);
		}

	}
	

}
