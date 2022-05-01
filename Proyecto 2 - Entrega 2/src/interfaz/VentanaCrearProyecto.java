package interfaz;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

public class VentanaCrearProyecto extends JFrame
{	
	//Campos de texto
	private JTextField tfNombreProyecto, tfDescripcion, tfNombreDuenio, tfNombreCorreo;
	// Campos para fechas
	private JSpinner jsFechaInicial, jsFechaFinal;
	// Boton confirmar
	private JButton btnConfirmar, btnCancelar;
	// Label titulo
	private JLabel lblTitulo;
	
	public VentanaCrearProyecto() {
		
		setTitle("Crear Proyecto"); //Titulo
		setSize(600,600); //Tamanio ventana
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //Cerrar ventana
		
		JPanel panelTitulo = new JPanel(); //Panel para el titulo
		
		lblTitulo = new JLabel("Crear proyecto", SwingConstants.CENTER); //Crear titulo centrado
		
		panelTitulo.add(lblTitulo); //Añadir titulo al panel titulo
		
		JPanel panelProyecto = new JPanel(); //Panel para datos del proyecto
		panelProyecto.setBorder(new TitledBorder("Datos del proyecto"));
		panelProyecto.setLayout(new GridLayout(4,2));
		
		tfNombreProyecto = new JTextField();
		panelProyecto.add(new JLabel("Nombre"));
		panelProyecto.add(tfNombreProyecto);
		
		tfDescripcion = new JTextField();
		panelProyecto.add(new JLabel("Descripcion"));
		panelProyecto.add(tfDescripcion);
		
		tfNombreProyecto = new JTextField();
		panelProyecto.add(new JLabel("Fecha inicial"));
		panelProyecto.add(tfNombreProyecto);
		
		tfNombreProyecto = new JTextField();
		panelProyecto.add(new JLabel("Fecha final"));
		panelProyecto.add(tfNombreProyecto);
		
		panelProyecto.add(new JLabel(""));
		panelProyecto.add(new JLabel(""));
		
		
	}
}