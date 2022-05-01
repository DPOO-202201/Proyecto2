package interfaz;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class VentanaCrearProyecto extends JFrame
{	
	//Campos de texto
	private JTextField tfNombreProyecto, tfDescripcion, tfNombreDuenio, tfCorreoDuenio, tfDiaInicial, tfMesInicial, tfAnioInicial, tfDiaFinal, tfMesFinal, tfAnioFinal;
	// Boton confirmar
	private JButton btnConfirmar, btnCancelar;
	// Label titulo
	private JLabel lblTitulo;
	
	public VentanaCrearProyecto() {
		
		setTitle("Crear Proyecto"); //Titulo
		setSize(600,600); //Tamanio ventana
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //Cerrar ventana
		setLocationRelativeTo(null);
		
		setLayout(new GridLayout (4,1));
		
		JPanel panelTitulo = new JPanel(); //Panel para el titulo
		
		lblTitulo = new JLabel("Crear proyecto", SwingConstants.CENTER); //Crear titulo centrado
		
		panelTitulo.add(lblTitulo); //Añadir titulo al panel titulo
		
		add(panelTitulo);
		
		JPanel panelProyecto = new JPanel(); //Panel para datos del proyecto
		panelProyecto.setBorder(new TitledBorder("Datos del proyecto"));
		panelProyecto.setLayout(new GridLayout(4,2));
		
		tfNombreProyecto = new JTextField();
		panelProyecto.add(new JLabel("Nombre"));
		panelProyecto.add(tfNombreProyecto);
		
		tfDescripcion = new JTextField();
		panelProyecto.add(new JLabel("Descripcion"));
		panelProyecto.add(tfDescripcion);
		
		JPanel panelFechaInicial = new JPanel();
		panelFechaInicial.setLayout(new GridLayout(1,3));
		tfDiaInicial = new JTextField();
		tfMesInicial = new JTextField();
		tfAnioInicial = new JTextField();
		
		panelProyecto.add(new JLabel("Fecha inicial"));
		panelFechaInicial.add(tfDiaInicial);
		panelFechaInicial.add(tfMesInicial);
		panelFechaInicial.add(tfAnioInicial);
		panelProyecto.add(panelFechaInicial);
		
		JPanel panelFechaFinal = new JPanel();
		panelFechaFinal.setLayout(new GridLayout(1,3));
		tfDiaFinal = new JTextField();
		tfMesFinal= new JTextField();
		tfAnioFinal = new JTextField();
		
		panelProyecto.add(new JLabel("Fecha final"));
		panelFechaFinal.add(tfDiaFinal);
		panelFechaFinal.add(tfMesFinal);
		panelFechaFinal.add(tfAnioFinal);
		panelProyecto.add(panelFechaFinal);
		
		add(panelProyecto);
		
		JPanel panelDatosCreador = new JPanel();
		panelDatosCreador.setBorder(new TitledBorder("Datos del creador"));
		panelDatosCreador.setLayout(new GridLayout(2,2));
		
		panelDatosCreador.add(new JLabel("Nombre del creador"));
		tfNombreDuenio = new JTextField();
		panelDatosCreador.add(tfNombreDuenio);
		panelDatosCreador.add(new JLabel("Correo del creador"));
		tfCorreoDuenio = new JTextField();
		panelDatosCreador.add(tfCorreoDuenio);
		
		add(panelDatosCreador);
		
		JPanel panelBotones = new JPanel();
		panelBotones.setLayout(new GridLayout(1,2));
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setPreferredSize(new Dimension(40,40));
		JButton btnConfirmar = new JButton("Crear");
		btnConfirmar.setPreferredSize(new Dimension(40,40));
		panelBotones.add(btnCancelar);
		panelBotones.add(btnConfirmar);
		
		add(panelBotones);		
		
		
	}
}