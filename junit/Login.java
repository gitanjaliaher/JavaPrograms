package junit;

public class Login {
	String username;
	String password;
	
	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
	this.password = password;
	}
	
	public boolean checkLogin() {
		if(username == "admin" && password == "admin123")
		{
			return true;
		}
		else
			return false;
		
	}
}
