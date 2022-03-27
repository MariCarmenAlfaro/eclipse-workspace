package actividades;

public class CuentaBancaria {
	//Atributo
	float saldo;
	float cantidad;
	
	//Constructor
	CuentaBancaria(float saldo){
		this.saldo=saldo;
	}
	//Void depositar
	void depositar(float cantidad) {
		saldo=saldo+cantidad;
	}
	//boolean retirar: Solo si la cantidad es menor que el saldo; true si se puede, false si no
	boolean retirar(float cantidad) {
		if(cantidad<=saldo) {
			saldo=saldo-cantidad;
			return true;
		}
		return false;
	 
	}
	//obtenerSaldo
	float obtenerSaldo() {
		return saldo;
	}
}
