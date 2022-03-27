package simulador;

public class Simulador {

	public static void main(String[] args) {
		Componente Diodo1 = new Diodo(12, 20, 30);
		Componente Condensador1 =new Condensador(20, 25, 600);
		Componente Led1 = new Led(12, 32, 40, "Rosa");
	}

}
