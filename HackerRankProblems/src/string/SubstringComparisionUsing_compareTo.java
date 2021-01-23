package string;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SubstringComparisionUsing_compareTo {

	public static void main(String[] args) {
		
		String s="welcomejava";
		int n=3;
		
		String smallest=s.substring(0,n);
		String largest="";
		String arr[]=new String[s.length()-n+1];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.substring(i,i+n);
		}
		
		System.out.println(Arrays.toString(arr));
		
		for(int j=0;j<arr.length;j++) {
            if(arr[j].compareTo(smallest)<0)
                smallest=arr[j];
            if(arr[j].compareTo(largest)>0)
                largest=arr[j];
        }
		System.out.println("Smallest is ----"+smallest);
		System.out.println("Largest is ----"+largest);

	}

}
