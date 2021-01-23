package OOP_AbstractConcept;

public class HomePage extends Page{

	public HomePage() {
		System.out.println("HP---Constructor");
	}
	
	@Override
	public void header() {
		System.out.println("HP -- header");
		
	}

	@Override
	public void title() {
		System.out.println("HP --  title");
		
	}

	public void userDetails() {
		System.out.println("HP -- user details");
	}

	@Override
	void title2() {
		// TODO Auto-generated method stub
		
	}
}
