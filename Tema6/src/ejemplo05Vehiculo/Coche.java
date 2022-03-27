package ejemplo05Vehiculo;

public class Coche extends Vehiculo {
	//Un coche es un vehiculio (herencia)
	private int potencia;
	
	public Coche(String matricula, String marca, 
			String modelo, int potencia) {
		
		super(matricula, modelo,marca);
		this.potencia = potencia;
		
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

}
