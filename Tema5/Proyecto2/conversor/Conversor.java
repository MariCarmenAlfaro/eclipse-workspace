package conversor;

public class Conversor {
	private static final double KM_A_MILLAS = 0.621;
	private static final double MB_A_ATM = 0.000986923;
	private static final double CAL_A_JULIOS = 4.1868;

	// Constructor

	// Métodos
	public static double millas(double km) {
		return km * KM_A_MILLAS;
	}
	public static double km(double millas) {
		return millas/KM_A_MILLAS;
	}
	
	public static double mb(double atm) {
		return atm/MB_A_ATM;
	}
	public static double atm(double mb) {
		return mb*MB_A_ATM;
	}
	
	public static double cal(double julios) {
		return julios/CAL_A_JULIOS;
	}
	public static double julios(double cal) {
		return cal*CAL_A_JULIOS;
	}
}
