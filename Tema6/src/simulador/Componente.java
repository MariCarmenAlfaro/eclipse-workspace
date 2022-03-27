package simulador;

public abstract class Componente {
	
	private double intensidadMaxima;
	private double longuitud;
	
	public Componente(double intensidadMaxima, double longitud) {
	
		this.intensidadMaxima = intensidadMaxima;
		this.longuitud = longitud;
	}
	public abstract void conectar();
	
	public double getIntensidadMaxima() {
		return intensidadMaxima;
	}
	public void setIntensidadMaxima(double intensidadMaxima) {
		this.intensidadMaxima = intensidadMaxima;
	}
	public double getLonguitud() {
		return longuitud;
	}
	public void setLonguitud(double longitud) {
		this.longuitud = longitud;
	}
	
}
