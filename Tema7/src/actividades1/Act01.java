package actividades1;
import javax.swing.*;
public class Act01 extends JFrame{
	public Act01(){
		JOptionPane.showConfirmDialog(null, "¿Formatear el disco duro?", "Confirmación de formateo", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
	}
	public static void main(String[] args) {
		Act01 act = new Act01();
	}
}
