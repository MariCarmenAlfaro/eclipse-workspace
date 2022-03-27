package ejemplo02Persona;

public class Cliente extends Persona {
	private String visa;
	
	//Muestra todos los datos de un cliente
	@Override
	public void mostrar() {
		//LLama al método mostrar de la clase padre que es person, para que escriba el dni, nombre y apellidos
		super.mostrar();
		//Mostramos en pantalla el atributo que falta.
		System.out.println("VISA: "+visa);
	}

	public String getVisa() {
		return visa;
	}

	public void setVisa(String visa) {
		this.visa = visa;
	}
	
}
