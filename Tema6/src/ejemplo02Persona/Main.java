package ejemplo02Persona;

public class Main {

	public static void main(String[] args) {
		 Cliente cliente1 = new Cliente();
		 cliente1.setDni("111298M");
		 cliente1.setNombre("Mari");
		 cliente1.setApellidos("Alfaro Esparcia");
		 cliente1.setVisa("321-456-987");
		 
		 Empleado empleado1 =new Empleado();
		 empleado1.setDni("987456L");
		 empleado1.setNombre("Marta");
		 empleado1.setApellidos("Muñoz");
		 empleado1.setNumSegSocial("987456te");
		 
		 Persona persona1=new Persona();
		 persona1.setDni("5647I");
		 persona1.setNombre("Elisa");
		 persona1.setApellidos("Lopez");
		 
		 persona1.mostrar();
		 
		 cliente1.mostrar();
		 empleado1.mostrar();
		 		
	}

}
