package Socket;

import android.util.Log;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ConnectSocket {
    private Socket clientSocket;

    public ConnectSocket() {
        try {
            clientSocket = new Socket("14.63.118.105",8030);

            clientSocket.close();
        } catch (IOException e) {
            Log.d("ERROR","ConnectSocket : " + e.getMessage());
            e.printStackTrace();
        }

    }


}
