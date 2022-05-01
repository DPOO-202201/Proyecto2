package interfaz;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

public class VentanaAdministrarProyecto extends JFrame
{
	private JLabel lblTitulo, lblNombre, lblDescripcion, lblFechaInicial, lblFechaFinal, lblID, lblIDProyecto, lblMovimiento;
	private JTextField tfNombre, tfDescripcion, tfFechaInicial, tfFechaFinal;
	private JButton btnGuardar, btnParticipantes, btnTiposActividades, btnActividades, btnReporte;
	
	public VentanaAdministrarProyecto() {
		setTitle("Administrar proyecto");
		setSize(800,800);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo( null );
		
		setLayout(new GridLayout(4,0));
		
		lblTitulo = new JLabel("Administrar proyecto", SwingConstants.CENTER);
		add(lblTitulo);
		
		JPanel panelPropiedades = new JPanel();
		panelPropiedades.setLayout(new GridLayout(1,2));
		
		JPanel panelDatos = new JPanel();
		panelDatos.setLayout(new GridLayout(5,2));
		
		lblNombre = new JLabel("Nombre", SwingConstants.CENTER);
		tfNombre = new JTextField();
		panelDatos.add(lblNombre);
		panelDatos.add(tfNombre);
		
		lblDescripcion = new JLabel("Descripcion", SwingConstants.CENTER);
		tfDescripcion = new JTextField();
		panelDatos.add(lblDescripcion);
		panelDatos.add(tfDescripcion);
		
		lblFechaInicial = new JLabel("Fecha inicial", SwingConstants.CENTER);
		tfFechaInicial = new JTextField();
		panelDatos.add(lblFechaInicial);
		panelDatos.add(tfFechaInicial);
		
		lblFechaFinal = new JLabel("Fecha final", SwingConstants.CENTER);
		tfFechaFinal = new JTextField();
		panelDatos.add(lblFechaFinal);
		panelDatos.add(tfFechaFinal);
		
		lblID = new JLabel("ID", SwingConstants.CENTER);
		lblIDProyecto = new JLabel("0"); //TODO Aqui va el id del proyecto
		panelDatos.add(lblID);
		panelDatos.add(lblIDProyecto);
		
		panelPropiedades.add(panelDatos);
		
		JPanel panelMovimiento = new JPanel();
		panelMovimiento.setLayout(new GridLayout(2,0));
		lblMovimiento = new JLabel("Movimiento del proyecto", SwingConstants.CENTER);
		panelMovimiento.add(lblMovimiento);
		panelMovimiento.add(new JLabel("Movimiento del proyecto", SwingConstants.CENTER));//TODO Agregar matriz de actividad
		
		panelPropiedades.add(panelMovimiento);
		
		add(panelPropiedades);
		
		btnGuardar = new JButton("Guardar");
		add(btnGuardar);
		
		JPanel panelBotones = new JPanel();
		panelBotones.setLayout(new GridLayout(1,4));
		panelBotones.setBorder(new TitledBorder("Opciones"));
				
		btnParticipantes = new JButton("Mostrar participantes");
		panelBotones.add(btnParticipantes);
		
		btnTiposActividades = new JButton("Mostrar tipos de actividades");
		panelBotones.add(btnTiposActividades);
		
		btnActividades = new JButton("Mostrar actividades");
		panelBotones.add(btnActividades);
		
		btnReporte = new JButton("Generar reporte");
		panelBotones.add(btnReporte);
		
		add(panelBotones);
	}

}