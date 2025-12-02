package activities;

public class Activity5 {
	
	public static void main(String[] args) {
		
		String title = "Java Fundamentals";
		Book mb = new MyBook();
		
		mb.setTitle(title);
		System.out.println(" Title of the book is: " + mb.getTitle());
		
		
	}

}
