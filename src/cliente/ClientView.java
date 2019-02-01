package cliente;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

public class ClientView extends JFrame{
	
	private JPanel contentPane;
	
	public JPanel[] panel= new JPanel[10];	
	public JButton boton;
	public JLabel[] pregunta = new JLabel[10];
	public JRadioButton[] opcion = new JRadioButton[40];
	public JLabel mensaje;
	public JLabel[] resultado = new JLabel[10];

	public ClientView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 1000);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(12, 0, 0, 0));	
		
		mensaje = new JLabel("Quien quiere ser millonario?");
		contentPane.add(mensaje);
		
		int aux=0;
		String caso="";	
		
		for (int i=0; i<10;i++) {
			panel[i] = new JPanel();
			panel[i].setLayout(new GridLayout(6,0,0,0));
			pregunta[i]= new JLabel("Pregunta"+(i+1));
			panel[i].add(pregunta[i]);
			if(aux!=i)
				aux=aux+4;
			for (int j=0;j<4;j++) {	
				switch(j) {
				case 0:
					caso="A";
					break;
				case 1:
					caso="B";
					break;
				case 2:
					caso="C";
					break;
				case 3:
					caso="D";
					break;
					default:
						break;
				}
								
				opcion[aux+j] = new JRadioButton("Opcion"+caso);
				panel[i].add(opcion[aux+j]);
			}
			resultado[i]= new JLabel("No contestado");
			panel[i].add(resultado[i]);
			contentPane.add(panel[i]);
		}		
		
		boton = new JButton("Check");
		contentPane.add(boton);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);	
	}
}
