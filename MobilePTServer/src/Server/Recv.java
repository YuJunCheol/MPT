package Server;

import java.io.ObjectInputStream;
import java.net.Socket;

import DB.Message;

public class Recv {
	Socket socket;
	ObjectInputStream inObject;
	
	public Recv(Socket socket) {
		
		this.socket = socket;
		if(socket == null) {
			System.out.println("ERROR : ������ �����ϴ�.");
		}
	}
	
	public Message getMessage() {
		try {
			inObject = new ObjectInputStream(socket.getInputStream());
			Message message = (Message)inObject.readObject();
			return message;
		}catch(Exception e) {
			System.out.println("(ERROR)Recv.getMessage : ");
			e.printStackTrace();
		}
		return null;
	}

}