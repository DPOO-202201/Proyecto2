package interfaz;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class VentanaCrearProyecto extends JFrame implements ActionListener
{	
	//Campos de texto
	private JTextField tfNombreProyecto, tfDescripcion, tfNombreDuenio, tfCorreoDuenio, tfDiaInicial, tfMesInicial, tfAnioInicial, tfDiaFinal, tfMesFinal, tfAnioFinal;
	// Boton confirmar
	private JButton btnConfirmar, btnCancelar;
	
	public VentanaCrearProyecto() {
		
		setTitle("Crear Proyecto"); //Titulo
		setSize(600,600); //Tamanio ventana
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //Cerrar ventana
		setLocationRelativeTo(null);
		
		setLayout(new GridLayout (3,1));
		
		JPanel panelProyecto = new JPanel(); //Panel para datos del proyecto
		panelProyecto.setBorder(new TitledBorder("Datos del proyecto")); //titulo del panel
		panelProyecto.setLayout(new GridLayout(4,2));
		
		tfNombreProyecto = new JTextField(); //cosas para nombre
		panelProyecto.add(new JLabel("Nombre"));
		panelProyecto.add(tfNombreProyecto);
		
		tfDescripcion = new JTextField(); //cosas para descripcion
		panelProyecto.add(new JLabel("Descripcion"));
		panelProyecto.add(tfDescripcion);
		
		JPanel panelFechaInicial = new JPanel(); //cosas para fecha inicial, con varios jtextfields para dia, mes y anio
		panelFechaInicial.setLayout(new GridLayout(1,3));
		tfDiaInicial = new JTextField();
		tfMesInicial = new JTextField();
		tfAnioInicial = new JTextField();
		panelProyecto.add(new JLabel("Fecha inicial"));
		panelFechaInicial.add(tfDiaInicial);
		panelFechaInicial.add(tfMesInicial);
		panelFechaInicial.add(tfAnioInicial);
		panelProyecto.add(panelFechaInicial);
		
		JPanel panelFechaFinal = new JPanel(); //como lo de arriba pero para fecha final
		panelFechaFinal.setLayout(new GridLayout(1,3));
		tfDiaFinal = new JTextField();
		tfMesFinal= new JTextField();
		tfAnioFinal = new JTextField();
		panelProyecto.add(new JLabel("Fecha final"));
		panelFechaFinal.add(tfDiaFinal);
		panelFechaFinal.add(tfMesFinal);
		panelFechaFinal.add(tfAnioFinal);
		panelProyecto.add(panelFechaFinal);
		
		add(panelProyecto); //agregar todo este panel al frame
		
		JPanel panelDatosCreador = new JPanel(); //panel para datos del creador
		panelDatosCreador.setBorder(new TitledBorder("Datos del creador"));
		panelDatosCreador.setLayout(new GridLayout(2,2));
		
		panelDatosCreador.add(new JLabel("Nombre del creador")); //cosas del nombre del creador
		tfNombreDuenio = new JTextField();
		panelDatosCreador.add(tfNombreDuenio);
		
		panelDatosCreador.add(new JLabel("Correo del creador")); //cosas del correo del creador
		tfCorreoDuenio = new JTextField();
		panelDatosCreador.add(tfCorreoDuenio);
		
		add(panelDatosCreador);
		
		JPanel panelBotones = new JPanel(); // panel solo para botones
		panelBotones.setLayout(new GridLayout(1,2));
		
		btnCancelar = new JButton("Cancelar");
		btnConfirmar = new JButton("Crear");
		panelBotones.add(btnCancelar);
		panelBotones.add(btnConfirmar);
		
		add(panelBotones);		
		
		
	}
	
	//TODO completar para dar acciones a los botones
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
	}
		
}