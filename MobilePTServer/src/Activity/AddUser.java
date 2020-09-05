package Activity;

import java.net.Socket;

import DB.Insert;
import Data.Resource;
import Server.Recv;

public class AddUser implements Resource{

	public AddUser(Socket socket) {
		Recv recv = new Recv(socket);
		user.setUser(recv.getUser());
		new Insert(user);
	}
	
}
