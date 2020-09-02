package com.yujuncheol.android.mobilept.UI.Adduser;

import java.net.Socket;

import Data.Message;
import Data.Resource;
import Socket.Send;

public class AddUser implements Resource {
    private Send send = new Send();

    public AddUser(Socket socket, Message message) {
        send.SendMessage(socket,message);
        //send.SendObject(socket,user);
    }
}
