package com.yujuncheol.java.DB;

import com.yujuncheol.android.mobilept.model.User;

public class Insert extends DBConnection{
	
	public Insert() {
		
	}
	
	public Insert(User user) {
		//System.out.println(user.getUser_id());
		
		String val = "'"+user.getUser_pk()+ "','"+user.getUser_id()+ "','"+user.getUser_pw()+ "','"+user.getUser_name()+"'";
		String sql = "INSERT INTO user VALUES ("+val+");";
		try {
			r = st.executeUpdate(sql);
		}catch(Exception e) {
			System.out.println("(!)[insert.User]: " + e.getMessage());
		}
	}
}