package actividades1;
import javax.swing.*;
import java.awt.*;

//3.- Crea un panel de diálogo con la siguiente apariencia:


public class Act03 extends JFrame {
	public Act03 () {
		super("Alterta de seguridad");
		setSize(400,100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		JLabel lblMensaje = new JLabel("Prueba");
		JButton btnAceptar = new JButton("Aceptar");
		
		
		
		add(lblMensaje);
		add(btnAceptar);
		setVisible(true); 
		
		
		JOptionPane.showMessageDialog(null, "Se ha detectado un escaneo de red desde la IP 192.168.1.51", "Alerta de seguridad", JOptionPane.WARNING_MESSAGE);
		
	}
	
	
	
	
	
	
public static void main(String[] args) {
		Act03 act03 =new Act03();
	}	
}
