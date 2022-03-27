package ejerciciosarrays2;

/*7.- La siguiente tabla guarda el número de espectadores que vieron La 2 a las 23:00 horas, cada día
de la semana. Escribe un programa que busque el máximo y el mínimo de audiencia en esta semana.*/
public class Act7 {

	public static void main(String[] args) {
		int audiencia[] = { 2000000, 2500000, 3100000, 3000000, 1200000, 1800000, 2050000 };
		String dia[]= {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado","Domingo"};
		
		System.out.println("Cuanta audiencia hemos tenido ésta semana?");
		int posiMax=0;
		int posiMin=0;
		for(int i=0; i<audiencia.length;i++) {
			if(audiencia[i]>audiencia[posiMax]) {
				posiMax=i;
			}
			if (audiencia[i]<audiencia[posiMin]) {
				posiMin=i;
			}
		}
		System.out.println("El dia con mayor audiendia ha sido el "+ dia[posiMax]+" con "+ audiencia[posiMax]+ " espectadores");
		System.out.println("El dia con menor audiendia ha sido el "+ dia[posiMin]+ " con "+ audiencia[posiMin]+ " espectadores");

		

	}

}
