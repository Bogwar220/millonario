package cliente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import base.Pregunta;

public class Cliente implements ActionListener {
	
	static ClientView view = new ClientView();	
	
	ObjectInputStream inObj;
	ObjectOutputStream outObj;
	
	int[] goodCliente = new int[10];
	public Cliente(ClientView view) {
		try {
			this.view=view;
			view.boton.setActionCommand("check");
			view.boton.addActionListener(this);
			
			String host = "192.168.34.81";
			int puerto = 6000;		
	
			Socket client = new Socket(host,puerto);
			inObj = new ObjectInputStream(client.getInputStream());
			outObj = new ObjectOutputStream(client.getOutputStream());
			Pregunta pregunta = new Pregunta();
			
			String opcion="";
			int aux=0;
			int[] goodServer = new int[10];
			
			for (int i=0; i<10;i++) {
				pregunta = (Pregunta) inObj.readObject();
				goodServer[i]=pregunta.getGood();
				view.pregunta[i].setText(pregunta.getPregunta());
				if(aux!=i)
					aux=aux+4;
				for (int j=0;j<4;j++) {						
					switch(j) {
					case 0:
						opcion=pregunta.getOpcionA();
						break;
					case 1:
						opcion=pregunta.getOpcionB();
						break;
					case 2:
						opcion=pregunta.getOpcionC();
						break;
					case 3:
						opcion=pregunta.getOpcionD();
						break;
						default:
							break;
					}				
					view.opcion[aux+j].setText(opcion);
					System.out.println(view.opcion[aux+j].getText());
					}
				}		

		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new Cliente(view);		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if(e.getActionCommand().equals("check")) {
				int aux=0;		
				for (int i=0; i<10;i++) {
					Pregunta pregunta = new Pregunta();
					pregunta.setPregunta(view.pregunta[i].getText());
					if(aux!=i)
						aux=i;
					for(int j=0;j<4;j++) {
						switch(j) {
						case 0:
							pregunta.setOpcionA(view.opcion[aux+j].getText());											
							break;
						case 1:
							pregunta.setOpcionB(view.opcion[aux+j].getText());
							break;
						case 2:
							pregunta.setOpcionC(view.opcion[aux+j].getText());
							break;
						case 3:
							pregunta.setOpcionD(view.opcion[aux+j].getText());
							break;
							default:
								break;
						}
						selected(aux,j,pregunta);
						goodCliente[i]=pregunta.getGood();
						pregunta.setGood(goodCliente[i]);						
						outObj.writeObject(pregunta);						
						}
					}
				
					for (int i=0;i<10;i++) {
						Pregunta pregunta = new Pregunta();
						pregunta = (Pregunta) inObj.readObject();
						if(pregunta.getCorrecto()==1) {
							view.resultado[i].setText("Correcto");
						}
						else {
							view.resultado[i].setText("Incorrecto");
						}
					}
				}		
		
		 } catch (IOException | ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();}
	}
	
	public void selected(int aux, int j, Pregunta pregunta) {
		if(view.opcion[aux+j].isSelected()) {
			switch(j) {
			case 0:
				pregunta.setGood(1);
				break;
			case 1:
				pregunta.setGood(2);
				break;
			case 2:
				pregunta.setGood(3);
				break;
			case 3:
				pregunta.setGood(4);
				break;
				default:
					break;
			}
		}
	}
}
