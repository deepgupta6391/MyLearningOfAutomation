package StringConcept;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {
		
		//1.
		System.out.println("************Length and Char*************");
		String str="Naveen This is my java code and I am so happy";
		System.out.println(str.length());
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(0));
		//System.out.println(str.charAt(38));//StringIndexOutOfBoundsException
		
		
		//2.
		System.out.println("************index*************");
		System.out.println(str.indexOf("m"));
		System.out.println(str.indexOf("java"));
			
		System.out.println(str.indexOf("s"));//1st occurrence of s
		System.out.println(str.indexOf("s", str.indexOf("s")+1));//2nd occurrence of s
		System.out.println(str.indexOf("s", 14));
		System.out.println(str.indexOf("s", str.indexOf("s", str.indexOf("s")+1)+1));//3rd occurrence
		
		String msg="Welcome error";		
		if(msg.indexOf("Admin")>0) {
			System.out.println("pass");
		}else {
			System.err.println("fail");
		}
		
		System.out.println(str.indexOf('h'));
		
		//3. compare strings:
		System.out.println("************equals*************");
		String s1="Hello World";
		String s2="Hello world";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		
		//4. trim:
		System.out.println("************trim*************");
		String p="     hello world         ";
		System.out.println(p.trim());
		
		//5. replace:
		System.out.println("************replace*************");
		System.out.println(p.trim().replace(" ",""));		
		String dob="01-01-1990";
		System.out.println(dob.replace("-","/"));
		
		String rep="Hello Java and happy with Java";
		System.out.println(rep.replaceAll("Java", "Python"));
		System.out.println(rep.replaceAll("(.*)", "Learning"));
		
		//6. contains:
		System.out.println("************contains************");
		String s8="welcome admin";
		System.out.println(s8.contains("admin"));
		
		//7. uppercase and lowercase
		System.out.println("************Upper and lowe case*************");
		String h1="This is Selenium";
		System.out.println(h1.toLowerCase());
		System.out.println(h1.toUpperCase());
		
		//8.concat
		System.out.println("************concat*************");
		String sl1="Hello";
		String sl2="Selenium";
		System.out.println(sl1.concat(sl2).concat("Test Automation").concat(" ").concat("python"));
		
		//9. substring:
		System.out.println("************substring*************");
		String st="Transaction id is 1234";
		System.out.println(st.substring(6));
		System.out.println(st.substring(0, 12));
		System.out.println(st.substring(18));
		System.out.println(st.substring(st.indexOf("is")+3, st.length()));
		System.out.println(st.substring(st.indexOf("1234"), st.length()));
		
		
		
		//10. split:
		System.out.println("************split*************");
		String data=";Tom;25;male;1000;USA";
		String dataVal[]=data.split(";");
		for(String datas:dataVal) {
			System.out.println(datas);
		}
		
		
		String test="xXJavaXxXPythonxXRubyxXSelenium";
		String val[]=test.split("xX");
		
		System.out.println(val[0]);
		System.out.println(val[1]);
		System.out.println(val[2]);
		System.out.println(val[3]);
		System.out.println(val[4]);
		
		
		for(String t:val) {
			System.out.println(t);
		}
		
		

		String name="Anup Kumar Gupta";
		String nameVal[]=name.split(" ");
		for(String vals:nameVal) {
			System.out.println(vals);
		}
		
		for(int i=0;i<name.split(" ").length;i++) {
			System.out.println(name.split(" ")[i]);
		}
		
		String credentials="admin;testpassword";
		String username=credentials.split(";")[0];
		String password=credentials.split(";")[1];
		
		doLogin(username, password);
		
		
		//
		System.out.println("**********Split regex******************");
		String y="200testing";
		System.out.println(y+20);
		String[] ans=y.split("\\D");
		Arrays.stream(ans).forEach(System.out::println);
		System.out.println(Integer.parseInt(ans[0])+20);
		
		
		System.out.println("*************String to double***************");
		String ds="12.33";
		System.out.println(Double.parseDouble(ds)+100.00);
		
		
		System.out.println("*********************Int to String*****************************");
		int i=78;
		System.out.println(String.valueOf(i)+i); 
	}
	
	public static void doLogin(String un,String pwd) {
		System.out.println("login to app with "+un+" "+pwd);
	}

}
