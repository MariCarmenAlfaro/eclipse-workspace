package ejemplo14Persona;

public class Main {

	public static void main(String[] args) {

		Persona persona1 = new Persona("Rubén", "López Martín", 30);
		persona1.mostrar();

		// queremos modificar el nombre
		// persona1.nombre="Raul";
		System.out.println("\nNombre original " + persona1.getNombre());

		persona1.setNombre("Mario");
		System.out.println("Nombre nuevo " + persona1.getNombre());

		
		System.out.println("\nApellido original " + persona1.getApellidos());
		persona1.setApellidos("Alfaro");
		System.out.println("Apellido nuevo " + persona1.getApellidos());
		
		System.out.println("\nEdad original " + persona1.getEdad());
		persona1.setEdad(21);
		System.out.println("Edad nueva " + persona1.getEdad());

	}

}