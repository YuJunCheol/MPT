package Socket;

import android.util.Log;

import com.yujuncheol.android.mobilept.Controller.MessageController;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import Data.Message;

public class ConnectSocket implements Runnable {
    private Socket clientSocket;
    private ObjectOutputStream outObject,outMessage;
    private ObjectInputStream inObject, inMessage;
    private Message msg;

    public ConnectSocket(Message message) {
        Thread work = new Thread(this);
        msg = message;
        work.start();
    }

    public void run() {
        try {
            clientSocket = new Socket("14.63.118.69",8030);
            new MessageController(clientSocket,msg);
        } catch (IOException e) {
            Log.d("ERROR","ConnectSocket : " + e.getMessage());
            e.printStackTrace();
        }
    }

    public Socket getSocket() {
        return this.clientSocket;
    }


}
