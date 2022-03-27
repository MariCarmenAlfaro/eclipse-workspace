package actividad1;

public abstract class Medio {
	 private String nombre;
	 private double duracion;
	 
	public Medio(String nombre, double duracion) {
		super();
		this.nombre = nombre;
		this.duracion = duracion;
	}
	public abstract void reproducir();
	public boolean guardar() {
		System.out.println("Guardando ...");
		return true;
	}
}
