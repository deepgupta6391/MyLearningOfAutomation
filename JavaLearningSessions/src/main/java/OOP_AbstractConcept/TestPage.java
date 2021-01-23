package OOP_AbstractConcept;

public class TestPage {

	public static void main(String[] args) {
		
		Page.signUp();

		LoginPage lp = new LoginPage();
		lp.header();
		lp.title();
		
		System.out.println("*********************************");

		HomePage hp = lp.login("Admin", "Admin");

		hp.header();
		hp.title();
		hp.userDetails();
		hp.logout();
		
		System.out.println("*********************************");
		// Page p=new Page();//not allowed

		// Top casting
		Page p1 = new LoginPage();
		p1.header();
		p1.title();
		p1.logout();
		
		System.out.println("*********************************");

		// not possible //LoginPage p2=new Page();//not allowed

		// Down casting explicitly
		LoginPage p3 = (LoginPage) p1;
		p3.login("Ad", "pwd");
		
		System.out.println("*********************************");
		
		Page p2=new LoginPage("Deeps");
	}

}
