package activities;

public class Activity8 {
	
	public static void main(String[] args) throws CustomException {
		
		try {
			exceptionTest("Bhargavi");
			exceptionTest(null);
			exceptionTest("Hello Java Exceptions");
		}catch(Exception mae) {
			System.out.println("Inside catch block: " + mae.getMessage());
		}
		
	}

	static void exceptionTest(String s) throws CustomException {
		
		if(s==null) {
			throw new CustomException("String value is null");
		}else {
			System.out.println("String value is " +s);
		}
		
		
	}
}
