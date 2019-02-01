package servidor;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Random;

import base.Pregunta;
import base.RellenarPreguntas;

public class ThreadServer extends Thread {
	
	private Socket client;	
	
	public ThreadServer(Socket client) {
		this.client=client;
	}
	
	public void run() {

		try {
			Random rnd = new Random();
			Pregunta pregunta = new Pregunta();
			int num=0;
			int[] aux= new int[10];
			int[] goodServer = new int[10];
			int[] goodCliente = new int[10];
			ObjectOutputStream outObj = new ObjectOutputStream(
					client.getOutputStream());
			ObjectInputStream inObj =  new ObjectInputStream(client.getInputStream());
			
			for (int i=0; i<10;i++) {
				aux[i]=num;
				num= rnd.nextInt(10)+1;				
				for (int j=0;j<aux.length;j++) {
					if(aux[j]==num) {
						num=rnd.nextInt(10)+1;
						j=0;
					}				
				}
				pregunta = RellenarPreguntas.rellenar(num);
				goodServer[i] = pregunta.getGood();
				outObj.writeObject(pregunta);			
			}	
			
			for (int i=0;i<10;i++) {
				pregunta = (Pregunta) inObj.readObject();
				goodCliente[i] = pregunta.getGood();
				if(goodServer[i]==goodCliente[i])
					pregunta.setCorrecto(1);
				else
					pregunta.setCorrecto(0);
				outObj.writeObject(pregunta);
			}
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
