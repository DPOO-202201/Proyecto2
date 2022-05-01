package interfaz;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class VentanaPrincipal extends JFrame{
	
	private JLabel lblTitulo;
	
	public VentanaPrincipal() {
		setSize(200,120);
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		setLocationRelativeTo( null );
		setTitle("Manejador de proyectos");
		setLayout( new BorderLayout( ) );
		
		lblTitulo = new JLabel ("Manejador de proyectos", SwingConstants.CENTER);
		add(lblTitulo, BorderLayout.NORTH);
		
		JPanel panelBotones = new JPanel();
		
		JButton btnCrearProyecto = new JButton("Crear Proyecto");
		btnCrearProyecto.setBounds(60, 60, 60, 60);
		JButton btnCargarProyecto = new JButton("Cargar Proyecto");
		btnCargarProyecto.setBounds(60, 60, 60, 60);
		
		panelBotones.add(btnCrearProyecto);
		panelBotones.add(btnCargarProyecto);
		
		add(panelBotones);
		
		
		
	}
	
	public static void main (String[] args)
    {
        VentanaPrincipal  ventana = new  VentanaPrincipal( );
        ventana.setVisible( true );
    }
}