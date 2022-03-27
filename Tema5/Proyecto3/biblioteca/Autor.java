package biblioteca;

public class Autor {
	private String nombre;
	private String email;
	private int fechaNacimiento;

	public Autor(String nombre) {

		this(nombre, "unknown", 0);

	}

	public Autor(String nombre, String email, 
			int fechaNacimiento) {

		this.nombre = nombre;
		this.email = email;
		this.fechaNacimiento = fechaNacimiento;

	}

	public String toString() {

		return "Nombre: " + nombre + "\nEmail: " + email 
				+ "\nFecha de nacimiento: " + fechaNacimiento;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(int fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
}
