package OOP_AbstractConcept;

public class LoginPage extends Page{

	public LoginPage() {
		System.out.println("LP---Constructor");
	}
	
	public LoginPage(String word) {
		super("Lualala");
		System.out.println("LP---Constructor with parameter word");
	}

	@Override
	public void header() {
		System.out.println("LP -- Header");
		
	}

	@Override
	public void title() {
		System.out.println("LP -- Title");
		
	}
	
	public static void signUp() {
		System.out.println("LoginPage -- sign up");
	}

	
	
	//cannot override because method is declared as final
	/*
	 * public void logout() { System.out.println("LP-- Logout"); }
	 */
	public HomePage login(String un,String pwd) {
		System.out.println("LP -- login");
		System.out.println("login with "+un+" and "+pwd);
		
		return new HomePage();
	}

	@Override
	void title2() {
		// TODO Auto-generated method stub
		
	}
	
	//not mandatory to override
//	@Override
//	protected void test1() {
//		
//	}
	
	
	

}
