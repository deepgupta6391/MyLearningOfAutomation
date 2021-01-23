package JavaBasics;

import java.util.Arrays;

public class StaticArrayConcept {

	public static void main(String[] args) {
		
		//1. int array:
		int i[]= new int[4];
		i[0]=20;
		i[1]=10;
		i[2]=9;
		//i[3]=29;
		
		//System.out.println(i[0]);
		//System.out.println(i[-1]);//ArrayIndexOutOfBoundException
		//System.out.println(i[3]);
		
		for(int num:i) {
			System.out.println(num);
		}
		
		int arr[]= new int[10];
		for(int i1=arr.length-1;i1>=0;i1--) {
			arr[i1]=arr.length-i1;
		}
		System.out.println(Arrays.toString(arr));
		

		//Object Arrray:
		Object[] arr1=new Object[10];
	}

}
