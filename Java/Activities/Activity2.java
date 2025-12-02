package activities;

import java.util.Arrays;

public class Activity2 {
	
	public static void main(String[] args) {
		
		int[] arr = {10, 77, 10, 54, -11, 10};
	
		System.out.println(Arrays.toString(arr));
		System.out.println(" The result is " +findResult(arr));
		
		int[] arr2 = {10, 77, 10, 54, -11, 1};
		System.out.println(Arrays.toString(arr2));
		System.out.println(" The result is " +findResult(arr2));
	}
		
	public static boolean findResult(int[] sumArr) {
			
		int searchValue = 10;
		int findSum = 30;
		int tempValue = 0;
		boolean isEqual30 = false;
		  for(int num : sumArr) {
			  
			  if(num==searchValue) {
				  
				  tempValue = tempValue+searchValue;  
			  }
			  
			  if(tempValue>findSum) {
				  System.out.println("Sum is greater than 30");
				  break;
			  }
			  
			  if(tempValue == findSum) {
				  isEqual30 = true;
			  }
			  
		  }
			
			return isEqual30;
			
	}
	

}
