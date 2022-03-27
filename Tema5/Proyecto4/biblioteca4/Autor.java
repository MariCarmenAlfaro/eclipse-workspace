package biblioteca4;

public class Autor {
	// Atributos
	private String nombre;
	private String email;
	private int fechaNacimiento;

	// Constructores
	public Autor(String nombre) {
		this(nombre, "Unknow", 0);
	}

	public Autor(String nombre, String email, int fechaNacimiento) {
		this.nombre = nombre;
		this.email = email;
		this.fechaNacimiento = fechaNacimiento;
	}
	//String to string
	public String toString() {
		 
		return"nombre= "+nombre+"\nemail="+email+"\nFecha de nacimiento "+fechaNacimiento;
		
	}
	

	// Getters y setters
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
