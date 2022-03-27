import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import java.awt.FlowLayout;

public class Ejemplo08 extends JFrame{

	public Ejemplo08() {
		super("Términos y condiciones");
		setSize(300,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JCheckBox chkAceptarTerminos = new JCheckBox("Acepto los términos y condiciones");
		JCheckBox chkAceptarPublicidad= new JCheckBox("Deseo recibir publicidad");
		
		add(chkAceptarTerminos);
		add(chkAceptarPublicidad);
		
		setVisible(true);
		
		//Dialogo de mensaje
		JOptionPane.showMessageDialog(this, "Acabas de perder todos tus archivos.");
		JOptionPane.showMessageDialog(null, "Acabas de perder todos tus archivos.", "Archivos perdidos", JOptionPane.WARNING_MESSAGE);
		
		//Dialogo de confirmación
		int eleccion=JOptionPane.showConfirmDialog(null, "¿Seguro que quieres formatear el disco?");
		if(eleccion==JOptionPane.YES_OPTION) {
			System.out.println("EL usuario ha pulsado YES");
		}else if (eleccion==JOptionPane.NO_OPTION){
			System.out.println("El usuario ha pulsado NO");
		}else {
			System.out.println("El usuario ha pulsado CANCEL");
		}
		
		JOptionPane.showConfirmDialog(null, "¿Desea reiniciar ahora?","Reinicio necesario", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
	}
	public static void main(String[] args) {
		Ejemplo08 ejemplo = new Ejemplo08();
	}
}