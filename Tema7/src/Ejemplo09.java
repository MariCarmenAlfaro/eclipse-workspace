import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import java.awt.FlowLayout;

public class Ejemplo09 extends JFrame{

	public Ejemplo09() {
		super("Términos y condiciones");
		setSize(300,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JCheckBox chkAceptarTerminos = new JCheckBox("Acepto los términos y condiciones");
		JCheckBox chkAceptarPublicidad= new JCheckBox("Deseo recibir publicidad");
		
		add(chkAceptarTerminos);
		add(chkAceptarPublicidad);
		
		setVisible(true);
		
//		String nombre=JOptionPane.showInputDialog(null, "¿Cuál es tu nombre?");
//		
//		System.out.println("Nombre: "+nombre);
		
		final String CODIGO_CORRECTO = "1234";
		
		
		String respuesta_usuario= JOptionPane.showInputDialog(null, "Código de verificación", "Verificar", JOptionPane.QUESTION_MESSAGE);
		
		
		if (CODIGO_CORRECTO.equals(respuesta_usuario)&& respuesta_usuario!=null) {
			JOptionPane.showMessageDialog(null, "Código correcto");
		}else {
			JOptionPane.showMessageDialog(null, "Código incorrecto");
		}
		
		
		
		
		
		
	}
		
	public static void main(String[] args) {
		Ejemplo09 ejemplo = new Ejemplo09();
	}
}