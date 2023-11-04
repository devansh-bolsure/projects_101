package springmvc.model;

//import jakarta.persistence.*;

public class User 
{
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	private String useremail;
	private String username;
	private String userpassword;
	
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpassword() {
		return userpassword;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

	public User(String id, String useremail, String username, String userpassword) {
		super();
		this.id = id;
		this.useremail = useremail;
		this.username = username;
		this.userpassword = userpassword;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", useremail=" + useremail + ", username=" + username + ", userpassword="
				+ userpassword + "]";
	}

	

	

	
	
}
