package ocp.classdesign.nested;

public class MemberInnerClass {

	private String label = "Private member in outer class";
	
	private double id;
	
	private InnerPrivateClass innerPrivateClass;
	
	public class InnerPublicClass{
		
		public int id;
		
	}
	
	private class InnerPrivateClass{
		
		private String label = "Private member in inner class";

		public String getLabel() {
			return label;
		}

		public void setLabel(String label) {
			this.label = label;
		}
		
		public void printFromOuterClass() {
			System.out.println("Responding from inner to the label  " + MemberInnerClass.this.label + ", which has Id = " +id );
		}
	}
	
	public MemberInnerClass() {
		this.innerPrivateClass = new InnerPrivateClass();
	}
	
	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	
	public void callInnerPrivateClass() {
		int localInteger = 20;
		System.out.println("Calling from outer the inner class...");
		System.out.println(innerPrivateClass.getLabel());
		innerPrivateClass.printFromOuterClass();
	}
	
	public void setInnerPrivateClass(String label) {
		this.innerPrivateClass.setLabel(label); 
	}
	
	public static void main(String[] args) {
		MemberInnerClass memberInnerClass = new MemberInnerClass();
		InnerPrivateClass innerClass = memberInnerClass.new InnerPrivateClass();
		System.out.println(memberInnerClass.innerPrivateClass.getLabel());
		System.out.println(innerClass.getLabel());
		
	}
	
	

}
