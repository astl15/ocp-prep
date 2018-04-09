package ocp.classdesign.nested;

public class StaticInnerClass {
	
	private String instanceLabel = "Outer instance label";
	private static String staticLabel = "Outer static label";
	
	public static class InnerClass{
		 
		public void printFromOuter() {
			System.out.println("Printing in inner data from outer: " + staticLabel);
		}
		
	}
	
	public static void main(String[] args) {
		InnerClass innerClass = new InnerClass();
		innerClass.printFromOuter();
		
	}

}
