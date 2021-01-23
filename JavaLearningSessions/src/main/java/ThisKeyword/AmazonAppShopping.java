package ThisKeyword;

public class AmazonAppShopping {

	public static void main(String[] args) {
		
		AmazonApp shop=new AmazonApp();
		shop.login(999422323, 999);
		shop.search("Apple Macbook Air");
		
		shop.login(393833, 8928).addToCart("Apple").payment("332").logout();
		
	}

}
