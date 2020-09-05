package Socket;

import java.io.ObjectInputStream;
import java.net.Socket;

import Data.Message;
import Data.User;

public class Recv {
    private Socket socket;
    private ObjectInputStream inObject;

    public Recv(Socket socket) {

        this.socket = socket;
        if(socket == null) {
            System.out.println("ERROR : 소켓이 없습니다.");
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

    public User getUser() {
        try {
            inObject = new ObjectInputStream(socket.getInputStream());
            User user = (User)inObject.readObject();
            return user;
        }catch(Exception e) {
            System.out.println("(ERROR)Recv.getUser: ");
            e.printStackTrace();
        }
        return null;
    }

}
