package ocp.classdesign.nested;

public class LocalInnerClass {
	
	private int length = 15;
	private int width = 23;
	
	public int calculate() {
		int scaleFactor = 1;
		
		class Calculator{
			
			public int calculateArea(){
				return length * width * scaleFactor;
			}
		}
	
		Calculator calculator = new Calculator();
		return calculator.calculateArea();
	}
	
	public static void main(String[] args) {
		LocalInnerClass innerClass = new LocalInnerClass();
		System.out.println(innerClass.calculate());
	}

}
