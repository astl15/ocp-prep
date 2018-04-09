package ocp.classdesign.nested;

public class AbstractInnerClass {
	
	private String name = "Andrei";
	
	private interface Person{
		void introduce();
	}
	
	public void introduceYourself() {
		Person p = new Person(){

			@Override
			public void introduce() {
				System.out.println("My name is " + name);
				
			}
		};
		
		p.introduce();
	}
	
	public void welcome(Person p) {
		p.introduce();
		System.out.println("Welcome, " + name + "!");
	}
	
	public static void main(String[] args) {
		AbstractInnerClass abstractClass = new AbstractInnerClass();
		abstractClass.introduceYourself();
		abstractClass.welcome(new Person() {

			@Override
			public void introduce() {
				System.out.println("Yo!My name is " + abstractClass.name);
				
			}
			
		});
	}

}
