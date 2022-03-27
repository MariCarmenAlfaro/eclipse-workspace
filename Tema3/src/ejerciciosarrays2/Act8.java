package ejerciciosarrays2;
/*8.- La siguiente tabla muestra la humedad relativa en una localidad de Mallorca a lo largo de las 24
horas de un día. Crea un programa capaz de recorrer este array e indicar cuáles han sido las
humedades máxima y mínima del día, y a qué horas se han producido.*/
 class Act8 {

	public static void main(String[] args) {

		int temp[]= {45, 40, 40,40, 37, 35, 39, 39, 45, 50, 55, 60, 65, 70, 70, 75, 75, 72, 65, 60, 55, 50, 50, 45};
		int posMax=0;
		int posMin=0;
		
		for(int i =1; i<temp.length;i++) {
			if(temp[i]<temp[posMin]) {
				posMin=i;
			}
			if(temp[i]>temp[posMax]) {
				posMax=i;
			}
		}
		System.out.println("La hora con más humedad ha sido a las " + posMax+ "h con un porcentaje del " + temp[posMax]+ "%");
		System.out.println("La hora con menos humedad ha sido a las " + posMin+ "h con un porcentaje del " + temp[posMin]+ "%");

		
		
		
		
		
		
	}

}
