package com.yujuncheol.android.mobilept.Controller;

import com.yujuncheol.android.mobilept.UI.Adduser.AddUser;

import java.net.Socket;

import Data.Message;
import Data.Resource;

public class MessageController implements Resource {
    Socket socket;

    public MessageController(Socket socket, Message message){
        switch(message){
            case AddUser:
                new AddUser(socket,message);
                return;
        }
    }
}
