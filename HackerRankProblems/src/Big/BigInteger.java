package Big;

public class BigInteger {

	public static void main(String[] args) {
		java.math.BigInteger b1=new java.math.BigInteger("1234");
		java.math.BigInteger b2=new java.math.BigInteger("20");
		java.math.BigInteger sum=b1.add(b2);
		java.math.BigInteger mul=b1.multiply(b2);
		
		System.out.println(sum);
		System.out.println(mul);

	}

}
