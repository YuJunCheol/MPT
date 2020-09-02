package Socket;

import android.util.Log;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

import Data.Message;
import Data.User;

public class Send {

    private ObjectOutputStream outObject,outMessage;

    public
    Socket socket;

    public Send(){

    }


    public void SendMessage(Socket socket, Message message) {
        try {
            outMessage = new ObjectOutputStream(socket.getOutputStream());
            outMessage.writeObject(message);
        } catch (Exception e) {
            Log.w("ERROR: "," " + e.getMessage());
        }
    }

    public void SendObject(Socket socket, Object object) {
        try {
            outObject = new ObjectOutputStream(socket.getOutputStream());
            outObject.writeObject(object);
            //outObject.close();
        } catch (IOException e) {
            Log.w("ERROR: ","SendObject");
        }

    }
}
