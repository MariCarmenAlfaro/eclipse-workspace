package teoria;

public class Ejemplo2 {
//ARRAY COMPACTO sabiendo de antemano los valores
	public static void main(String[] args) {

		float precios[]= {25, 23.5F, 24.3F, 26, 0};
		String meses[]= {"Enero", "Febrero", "Marzo", "Abril"," Mayo", "Junio"," Julio"," Agosto", "Septiembre", 
				 "Octubre", "Noviembre", "Diciembre"};
		System.out.println((meses [1]));
		System.out.println("\nLos doce messe del año son: ");
		for (int i=0; i<meses.length;i++){
			System.out.println(meses[i]);
		}
	}

}
