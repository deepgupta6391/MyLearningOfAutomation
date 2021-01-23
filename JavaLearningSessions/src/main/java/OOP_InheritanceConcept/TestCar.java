package OOP_InheritanceConcept;

public class TestCar {

	public static void main(String[] args) {
		BMW b=new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.autoAirSuspension();
		b.engine();
		System.out.println(b.fee);
		b.engineBody();
		b.petrolTank();
		System.out.println(b.val);
		
		System.out.println("*******************");
		Car c=new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		System.out.println(c.val);
		c.petrolTank();
		
		System.out.println("*******************");
		
		//Top Casting
		Car c1=new BMW();//child class object can be referred by parent class ref variable
		c1.start();
		c1.stop();
		c1.refuel();
		c1.engine();
		c1.engineBody();
		/*autoAirSuspension() will not be accessable as it is not there in car class*/
		System.out.println("____________________________________________________________________");
		
		
		//DownCasting after upcasting
		//BMW b2=(BMW)new Car();---->ClassCastException: 
		BMW b2=(BMW) c1;
		b2.autoAirSuspension();
		b2.start();
		b2.stop();
		b2.refuel();
		b2.engine();
		
		
		System.out.println("**********************************");
		
		
		Vehicle v1=new Car();
		
		
		Vehicle v2=new BMW();
		BMW b4=(BMW) v2;	
		b4.autoAirSuspension();
		b4.engine();
		b4.start();
		b4.stop();
		b4.refuel();
		
		
		//Down Casting
		//BMW b1=(BMW) new Car();//ClassCastException
		
		
		
	}

}
