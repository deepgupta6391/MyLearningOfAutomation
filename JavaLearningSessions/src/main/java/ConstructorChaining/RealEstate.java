package ConstructorChaining;

public class RealEstate extends Business{

	public RealEstate(String type, int revenue, String branches) {
		super(type, revenue, branches);
		
	}

	public RealEstate() {
		super();
		System.out.println("Real State -- default const ...");
	}

	public static void main(String[] args) {
		
		RealEstate rs=new RealEstate("realestate", 10000, "Bangalore");
		System.out.println(rs.type);
		
		RealEstate rs1=new RealEstate();
	}

}
