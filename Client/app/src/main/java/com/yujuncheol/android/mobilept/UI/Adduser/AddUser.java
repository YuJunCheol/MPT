package com.yujuncheol.android.mobilept.UI.Adduser;

import java.net.Socket;

import Data.Message;
import Data.Resource;
import Socket.Send;

public class AddUser implements Resource {

    public AddUser(Socket socket, Message message) {
        Send send = new Send(socket);

        send.SendMessage(message);
        send.SendObject(user);
    }
}
