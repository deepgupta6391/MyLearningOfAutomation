package SuperKeyword;

public class Page {

	int loadTime=30;
	
	public Page() {
		System.out.println("Page Const..........");
	}
	
	public Page(int time) {
		System.out.println("Page const....with time : "+time);
	}
	
	public void pageTitle() {
		System.out.println("page title");
	}
}
