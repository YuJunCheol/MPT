package Server;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class MobilePT implements Runnable {
	
	private Socket socket;
	private ObjectInputStream inMessage;
	private ObjectOutputStream out;
	
	public MobilePT(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Recv recv = new Recv(socket);
			Send send = new Send(socket);
			
			switch(recv.getMessage()) {
			case Login:
				
				break;
			}
			
		}catch(Exception e) {
			System.out.println("(ERROR)[MobilePT]: ");
			e.printStackTrace();
		}
		
	}

}
