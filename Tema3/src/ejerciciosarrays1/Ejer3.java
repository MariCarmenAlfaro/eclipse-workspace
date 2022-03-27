package ejerciciosarrays1;
/*3.- Crea un array llamado densidades con las densidades (en g/cm3
) de los nueve (s�, nueve)
planetas del Sistema Solar. Haz que despu�s se muestren todos los valores mediante un bucle for.*/
public class Ejer3 {
	public static void main(String[] args) {

		String planetas[] = {"Saturno, 6.87g/cm3", "Urano 1.27g/cm3", "Jupiter, 1.33g/cm3", "Neptuno, 1.64g/cm3",
				"Marte 3.93g/cm3", "Venus, 5.24g/cm3", "Mercurio 5.43g/cm3", "Tierra, 5.51g/cm3", "Plutón, 1.88g/cm3"
		};
		for (int i=0; i<planetas.length;i++) {
		System.out.println(planetas[i]);
		}
		
		
		
		
	}

}
