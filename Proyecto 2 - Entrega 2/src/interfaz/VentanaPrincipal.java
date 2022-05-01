package interfaz;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class VentanaPrincipal extends JFrame implements ActionListener {
	
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
		
		//Creacion btn crear proyecto
		JButton btnCrearProyecto = new JButton("Crear Proyecto"); //creacion
		btnCrearProyecto.setBounds(60, 60, 60, 60); //limites
		btnCrearProyecto.addActionListener(this); //para que pueda detectar si lo seleccionan
		btnCrearProyecto.setActionCommand("CREAR"); //Que es lo que hara cuando lo selecciones
		
		JButton btnCargarProyecto = new JButton("Cargar Proyecto");
		btnCargarProyecto.setBounds(60, 60, 60, 60);
		btnCargarProyecto.addActionListener(this); //para que pueda detectar si lo seleccionan
		btnCargarProyecto.setActionCommand("CARGAR"); //Que es lo que hara cuando lo selecciones
		
		panelBotones.add(btnCrearProyecto);
		panelBotones.add(btnCargarProyecto);
		
		add(panelBotones);
		
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		
		if(comando.equals("CREAR")) {
			new VentanaCrearProyecto().setVisible(true); //Crear la ventana de los datos del proyecto y mostarla
		}
		if(comando.equals("CARGAR")) {
			
		}
	}
	
	public static void main (String[] args)
    {
        VentanaPrincipal  ventana = new  VentanaPrincipal( );
        ventana.setVisible( true );
    }
}