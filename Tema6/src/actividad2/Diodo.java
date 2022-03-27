package actividad2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Diodo extends Componente {
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

		try {
			System.out.println("Cuál es la intensidad máxima");
			double intensidadMaxima = entrada.nextDouble();
			setIntensidadMaxima(intensidadMaxima);
			System.out.println("Cuál es la longuitud");
			double longuitud = entrada.nextDouble();
			setLonguitud(longuitud);
			System.out.println("Cuál es la tensión inversa");
			tensionInversa = entrada.nextDouble();

		} catch (InputMismatchException ex) {
			System.out.println("Entrada icncorrecta. Solo se aceptan valores numéricos.");
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			System.out.println("Fin de lectura de los datos");
		}
	}

}
