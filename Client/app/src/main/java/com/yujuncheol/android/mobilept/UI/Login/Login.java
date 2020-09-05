package com.yujuncheol.android.mobilept.UI.Login;

import java.net.Socket;

import Data.Message;
import Data.Resource;
import Socket.Send;
import Socket.Recv;

public class Login implements Resource {

    public Login(Socket socket, Message msg){
        Send send = new Send(socket);
        Recv recv = new Recv(socket);

        send.SendMessage(msg);
        send.SendObject(user);
    }
}
