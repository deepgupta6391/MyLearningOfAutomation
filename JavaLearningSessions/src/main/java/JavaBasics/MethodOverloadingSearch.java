package JavaBasics;

public class MethodOverloadingSearch {

	public static void main(String[] args) {
		
		MethodOverloadingSearch s=new MethodOverloadingSearch();
		s.search("Apple Mac Book");
		
		int finalPrice=s.search("Apple Mac Book",50000);
		System.out.println("Final price is "+finalPrice);

	}
	
	public void search(String name) {
		System.out.println(" search is done by "+name);
	}
	
	public int search(String name,int price) {
		System.out.println("search is done by "+name);
		System.out.println("search is done by "+price);
		
		int totalPrice=price-100;
		return totalPrice;
	}

}
