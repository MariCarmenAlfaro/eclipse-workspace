package ejemplo02Persona;

public class Empleado extends Persona{
	private String numSegSocial;
	@Override
	public void mostrar() {
		super.mostrar();
		System.out.println("Número de la seguridad social: "+numSegSocial);
	}
	
	public String getNumSegSocial() {
		return numSegSocial;
	}

	public void setNumSegSocial(String numSegSocial) {
		this.numSegSocial = numSegSocial;
	}
}
