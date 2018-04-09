package ocp.classdesign.nested;

public class ClassDesignMain {
	
	public static void main(String[] args) {
		MemberInnerClass memberClass = new MemberInnerClass();
		System.out.println(memberClass.getLabel());
		memberClass.callInnerPrivateClass();
	}
}
