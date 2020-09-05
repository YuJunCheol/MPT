package DB;

import Data.User;

public class Insert extends DBConnect{
	
	public Insert() {
		
	}
	
	public Insert(User user) {
		
		String val = "'"+user.getUserid()+"','"+user.getUserpw()+"','"+user.getPname()+"'";
		
		
		String sql = "INSERT INTO user (user_id,user_pw,user_nikname) VALUES ("+val+");";
		
		try {
			r = st.executeUpdate(sql);
			System.out.println("입력 완료");
		}catch(Exception e) {
			System.out.println("(!)[insert.User]: ");
			e.printStackTrace();
		}
	}
}
