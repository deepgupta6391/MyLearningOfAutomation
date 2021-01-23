package strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddress {

	public static void main(String[] args) {
		String emails[]= {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
		
		numUniqueEmails(emails);		

	}
	
	 public static int numUniqueEmails(String[] emails) {
		 
		 Set<String> unq=new HashSet<String>();
		 
		 for(String email:emails) {
			 String[] parts=email.split("@");
			 //System.out.println(Arrays.toString(parts));
			 String[] local=parts[0].split("\\+");
			 unq.add(local[0].replace(".", "")+"@"+parts[1]);
		 }
		 System.out.println(unq);
		return unq.size();	        
	    }

}
