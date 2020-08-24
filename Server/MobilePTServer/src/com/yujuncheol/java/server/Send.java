package com.yujuncheol.java.server;

import java.io.ObjectOutputStream;
import java.net.Socket;

public class Send {
	Socket socket;
	ObjectOutputStream outObject;
	
	public Send(Socket socket) {
		// TODO Auto-generated constructor stub
		this.socket = socket;
		if(socket == null) {
			System.out.println("(!)Send");
		}
	}
	
	public void SendMessage(Object object) {
        try {
            outObject = new ObjectOutputStream(socket.getOutputStream());
            outObject.writeObject(object);
        } catch (Exception e) {
        	System.out.println("ERROR: SendMessage");
        }

    }
	
	 public void SendObject(Socket socket, Object object) {
	        try {
	            outObject = new ObjectOutputStream(socket.getOutputStream());
	            outObject.writeObject(object);
	            //outObject.close();
	        } catch (Exception e) {
	            System.out.println("ERROR: SendObject");
	        }

	    }
}
