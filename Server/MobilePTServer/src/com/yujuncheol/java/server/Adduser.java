package com.yujuncheol.java.server;

import com.yujuncheol.android.mobilept.model.User;
import com.yujuncheol.java.DB.Insert;

public class Adduser {
	
	public Adduser(User user) {
		//System.out.println(user.getUser_id());
		
		new Insert(user);
	}
}
