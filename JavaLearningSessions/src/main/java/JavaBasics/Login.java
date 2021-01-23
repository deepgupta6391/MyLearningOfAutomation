package JavaBasics;

//constructor tutorial
public class Login {
	String username;
	String password;
	String emailId;
	int otp;
	long mobileNumber;
	String facebookId;

	public Login(String username, String password, String emailId, int otp, long mobileNumber, String facebookId) {
		this.username = username;
		this.password = password;
		this.emailId = emailId;
		this.otp = otp;
		this.mobileNumber = mobileNumber;
		this.facebookId = facebookId;
	}

	public Login(String emailId,int otp) {
		this.emailId = emailId;
		this.otp=otp;
	}

	public Login(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public Login() {
		
	}
	
	public void doLogin() {
		System.out.println("login with : "+emailId+" "+otp);
	}

	public static void main(String[] args) {
		Login l1=new Login();//error if not defined explicitly
		System.out.println(l1.username);//null
		
		Login l2=new Login("deeps123@gmail.com", 1234);
		l2.doLogin();
	}

}
