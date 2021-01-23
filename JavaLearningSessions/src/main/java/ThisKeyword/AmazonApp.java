package ThisKeyword;

public class AmazonApp {
	
	public AmazonApp login(String un,String pwd) {
		System.out.println("login with : "+un+pwd);
		return this;
	}
	
	public AmazonApp login(long ph,int otp) {
		System.out.println("login with : "+ph+otp);
		return this;
	}
	
	public AmazonApp search(String name) {
		System.out.println("search with product : "+name);
		return this;
	}
	
	public AmazonApp addToCart(String name) {
		System.out.println("adding to cart : "+name);
		return this;
	}
	
	public AmazonApp payment(String cc) {
		System.out.println("making the payment with : "+cc);
		return this;
	}
	
	public AmazonApp logout() {
		System.out.println("logout from the application");
		return this;
	}
	
	

}
