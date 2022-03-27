package actividad2;

public class Simulador {

	public static void main(String[] args) {
		Componente Diodo1 = new Diodo(12, 20, 30);
		Componente Condensador1 =new Condensador(20, 25, 600);
		Componente Led1 = new Led(12, 32, 40, "Rosa");
		
		Componente componente = new Diodo(1,1,1);
		Diodo Led2 = new Led(13, 32, 45, "Azul");
		
		Led2.leeDatos();
	//	Diodo1.leeDatos(); No funciona porque "componente" no tiene el metodo leeDatos();
		//Porque es su hijo
	}

}
