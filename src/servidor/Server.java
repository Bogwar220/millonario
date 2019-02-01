package servidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		int puerto = 6000;
		ThreadServer threadServer;
		
		ServerSocket server;
		try {
			server = new ServerSocket(puerto);		

			while (true) {				
				Socket socketCliente = server.accept();
				threadServer = new ThreadServer(socketCliente);
				threadServer.start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
