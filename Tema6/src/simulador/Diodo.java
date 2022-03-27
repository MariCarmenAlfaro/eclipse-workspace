package simulador;

import java.util.Scanner;

public class Diodo extends Componente{
	Scanner entrada = new Scanner(System.in);
	private double tensionInversa;

	public Diodo(double intensidadMaxima, double longuitud, double tensionInversa) {
		super(intensidadMaxima, longuitud);
		this.tensionInversa = tensionInversa;
	}

	@Override
	public void conectar() {
		System.out.println("Componente conectado");
	}
	public void leeDatos() {
		System.out.println("Cuál es la intensidad máxima");
		 double intensidadMaxima = entrada.nextDouble();
		 setIntensidadMaxima(intensidadMaxima);
		System.out.println("Cuál es la longuitud");
		double longuitud = entrada.nextDouble();
		setLonguitud(longuitud);
		System.out.println("Cuál es la tensión inversa");
		 tensionInversa = entrada.nextDouble();
	}
	
}
