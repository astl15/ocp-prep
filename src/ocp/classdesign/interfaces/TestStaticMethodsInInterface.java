package ocp.classdesign.interfaces;

interface House{
	public default String getAddress() {
		return "101 Main Str";
	}
}

interface Office{
	public static String getAddress() {
		return "101 Smart Str";
	}
}

class HomeOffice implements House, Office{
	public String getAddress() {
		return "R No1, Home";
	}
}
public class TestStaticMethodsInInterface {
	
	public static void main(String[] args) {
		Office office = new HomeOffice();
		/*
		*office.getAddress();
		*This static method of interface Office can only be accessed as Office.getAddress
		*/
		System.out.println(Office.getAddress());
	}

}
