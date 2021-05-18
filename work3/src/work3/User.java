package work3;

public class User {
	private String Id;
	private String email;
	private String password;
	
	
	public User() {}
	
	
	public User(String id, String email, String password) {
		this();
		this.Id = id;
		this.email = email;
		this.password = password;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	

}
