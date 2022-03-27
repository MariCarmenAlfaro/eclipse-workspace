package inicio9;

import java.util.Scanner;

import electrodomesticos.Lavadora;
import electrodomesticos.Motor;
import electrodomesticos.Taller;

public class Inicio {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		//Pedir los datos necesarios para crear un objeto Lavadora 
	
		System.out.println("DATOS DEL MOTOR: \n");
		
		System.out.print("Identificador del motor: ");
		int id=entrada.nextInt();
	    entrada.nextLine();
		System.out.print("Nombre del fabricante: ");
		String fabricante=entrada.nextLine();
		
		System.out.print("Nombre del modelo: ");
		String modelo=entrada.nextLine();
		
		Motor motor = new Motor(id, fabricante, modelo);
		
		System.out.println("\nDATOS DE LA LAVADORA: \n");
	
		System.out.print("Idenfitificador de la lavadora: ");
		int idLav=entrada.nextInt();
		entrada.nextLine();
		System.out.print("Nombre de la marca: ");
		String marca=entrada.nextLine();
		System.out.print("Precio: ");
		float precio=entrada.nextFloat();
		
		Lavadora lavadora = new Lavadora(idLav,motor, marca, precio);
		
		System.out.println("¿De cuantas lavadoras quieres el taller?");
		int maxLavadoras=entrada.nextInt();
		
		Taller miTaller = new Taller(maxLavadoras);
		miTaller.addLavadoras(lavadora);
		miTaller.listaLavadoras();
		
		/*
		Motor m1 =new Motor(101, "Mitshubushi", "A1");
		Motor m2 =new Motor(102, "Toyota", "v3");
		Motor m3 =new Motor(103, "Kawasaki", "A1");
		
		
		Lavadora lav1= new Lavadora(21, m1, "Balay", 800);
		Lavadora lav2= new Lavadora(22, m2, "Bosh", 200);
		Lavadora lav3= new Lavadora(23, m3, "LG", 750);
		Lavadora.setIva(21);
		
		System.out.println(lav2.toString());
		
		Taller t1= new Taller(20);
		
		t1.addLavadoras(lav1);
		t1.addLavadoras(lav2);
		t1.addLavadoras(lav3);
		
		t1.listaLavadoras();
		
		t1.borraLavadora(22);
		
		t1.listaLavadoras();
		
		System.out.println("\nLa lavadora con ID 21 se encuentra en la posición "+ t1.buscaLavadoras(20)); */
	}

}
