package ejemplo15Mates;

public class Mates {
	//Los atributos PI y E son estaticos, lo que significa que se podran usar poniendo
	//delante el nombre de la clase(por ejemplo Mates.PI)
	static final double PI=3.141592;
	static final double E=2.7129;
	
	static int num;
	
	//El metodo pow es estatico lo que significa que se podra usar poniendo delante 
	//el nombre de la clase (por ejemplo , Mates.pow(2,5)
	static int pow( int base, int exp) {
		int resultado=1;
		for (int i = 1; i <= exp; i++) {
			resultado=resultado*base;
		}
		return resultado;
	}
}
