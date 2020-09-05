package Data;
import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    private String userid,userpw,pname;

    public User() {

    }

    public User(String userid, String userpw, String pname) {
        this.userid = userid; this.userpw = userpw; this.pname = pname;
    }
    
    public void setUser(User user) {
    	this.userid = user.getUserid(); this.userpw = user.getUserpw(); this.pname = user.getPname();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUserpw() {
        return userpw;
    }

    public void setUserpw(String userpw) {
        this.userpw = userpw;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }
}
