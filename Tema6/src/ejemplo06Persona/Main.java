package ejemplo06Persona;

public class Main {
	
	public static void main(String[] args) {
		//El polimorfismo de java nos permite crear una variable de tipo Persona y guardar 
		//dentro objetos de clases hijas.
		
		Persona persona1;
		persona1 =new Cliente("1234567M", "Mari", "Alfaro", "258-987-987-369");
		//Al llamar un metodo que existe en las dos clases (Persona y cliente), se ejecutara 
		//el de la clase hija(cliente).
		persona1.mostrar();
		
		//Lo mismo sucede con empleado.
		Persona persona2 =new Empleado ("987654C", "Marta", "Esparcia", "897er");
		
		persona2.mostrar();
		
		//No podemos llamar a un metodo de cliente que no esta en la clase padre.
		//persona1.mostrarVisa();Ya que dentro de persona no existe ese metodo.
		//A no ser que hagamos una conversion (cast)
		((Cliente)persona1).mostrarVisa();
		
		//Cuando hacemos un cast, debemos estar seguros de que realmente el contenido de 
		//la variable es del tipo al que estamos haciendo la conversion. Comprobar digamos si la visa de verdad esta en cliente.
		//La siguiente instruccion dara error, ya que persona2 contiene un Empleado, no un cliente.
		//((Cliente)persona2).mostrarVisa();
		
		
		
		
		
		
	}

}