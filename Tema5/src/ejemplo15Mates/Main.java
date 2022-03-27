package ejemplo15Mates;

public class Main {

	public static void main(String[] args) {
		//Podemos acceder a los atributos PI y E sin crear un objeto de la calse Mates
		//ya que son estáticos.
		System.out.println("El numero PI vale: "+Mates.PI);
		System.out.println("El numero e vale: "+Mates.E);
		
		//Solamente habria un valor ya que se guarda el ultimo escrito
		//Si creamos objetos de las clases Mates, veremos que el atributo num, 
		//por ser estatico, vale lo mismo que cualquiera de ellos.
		Mates mat = new Mates();
		mat.num=29;
	
		Mates mat2 = new Mates();
		mat2.num=16;
		
		Mates mat3 = new Mates();
		mat3.num=25;
		
		System.out.println("\nmat="+Mates.num);
		System.out.println(Mates.pow(2, 3));
	}

}
