package interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class VentanaRevisarTiposActividades extends JFrame implements ActionListener{
	private JLabel lblTitulo;
	private JPanel pTipos,pBotones;
	private JButton btnModificar, btnCrear;
	
	public VentanaRevisarTiposActividades() {
		setTitle("Tipos de actividades");
		setSize(900,900);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		lblTitulo = new JLabel("Tipos de actividades", SwingConstants.CENTER);
		add(lblTitulo,BorderLayout.NORTH);
		
		pTipos = new JPanel();
		//TODO Ciclo para agregar todos los tipos de actividades
		add(pTipos,BorderLayout.WEST);
		
		pBotones = new JPanel();
		pBotones.setLayout(new GridLayout(2,0));
		btnModificar = new JButton("Modificar tipos de actividad");
		btnModificar.addActionListener(this);
		btnModificar.setActionCommand("MODIFICAR");
		pBotones.add(btnModificar);
		btnCrear = new JButton("Crear tipo de actividad");
		btnCrear.addActionListener(this);
		btnModificar.setActionCommand("CREAR");
		pBotones.add(btnCrear);
		add(pBotones,BorderLayout.EAST);
		
		
	}
	
	public void actionPerformed( ActionEvent e ) {
        String comando = e.getActionCommand( );
        
        if(comando.equals( "MODIFICAR" ))
        {
            
        }
        else if(comando.equals( "CREAR" ))
        {
            
        }        
    }
}