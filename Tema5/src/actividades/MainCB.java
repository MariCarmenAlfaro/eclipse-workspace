package actividades;

public class MainCB {

	public static void main(String[] args) {

		CuentaBancaria Cuenta1 = new CuentaBancaria(1000);

		System.out.println("Mi saldo es: " + Cuenta1.obtenerSaldo());

		Cuenta1.depositar(500);

		System.out.println("El saldo actual: " + Cuenta1.obtenerSaldo());

		if (Cuenta1.retirar(100)) {
			System.out.println("Mi saldo es: " + Cuenta1.obtenerSaldo());

		} else {
			System.out.println("No hay fondos suficientes.");
		}


	}

}
