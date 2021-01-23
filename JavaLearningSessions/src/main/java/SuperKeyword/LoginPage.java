package SuperKeyword;

public class LoginPage extends Page{
	
	int loadTime=20;
	
	public LoginPage() {
		//super();
		super(40);
		System.out.println("LoginPage Const..........");
	}
	
	void loading() {
		System.out.println("loginpage load time "+loadTime);
		System.out.println("Page loadtime is "+super.loadTime);
		pageTitle();
		super.pageTitle();
	}
	
	public void pageTitle() {
		System.out.println("LoginPage title");
	}


}
