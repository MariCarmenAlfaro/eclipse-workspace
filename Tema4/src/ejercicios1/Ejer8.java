package ejercicios1;

//8.- Crea un método int max(int x, int y) que devuelva el mayor de los números x e y. Análogamente,
//crea el método int min(int x, int y).
public class Ejer8 {

	public static void main(String[] args) {

		System.out.println(max(2, 8));
		System.out.println(min(2, 8));
	}

	static int max(int num, int num2) {

		if (num > num2) {
			return num;

		} else {
			return num2;
		}
	}

	

	static int min(int num, int num2) {

		if (num < num2) {
			return num;
		} else {
			return num2;
		}

	}

}
