package Socket;

import android.util.Log;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

import Data.Message;

public class Send {

    private ObjectOutputStream outObject,outMessage;
    private Socket socket;

    public Send(Socket socket){
        this.socket = socket;
        if(socket == null) {
            System.out.println("ERROR : 소켓이 없습니다.");
        }
    }


    public void SendMessage(Message message) {
        try {
            outMessage = new ObjectOutputStream(socket.getOutputStream());
            outMessage.writeObject(message);
        } catch (Exception e) {
            Log.w("ERROR: "," " + e.getMessage());
        }
    }

    public void SendObject(Object object) {
        try {
            outObject = new ObjectOutputStream(socket.getOutputStream());
            outObject.writeObject(object);
            //outObject.close();
        } catch (IOException e) {
            Log.w("ERROR: ","SendObject");
        }

    }
}
