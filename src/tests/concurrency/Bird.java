package tests.concurrency;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Tail{}

@SuppressWarnings("serial")
public class Bird implements Serializable {
	private String name;
	private transient int age;
	private Tail tail;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Tail getTail() {
		return tail;
	}
	public void setTail(Tail tail) {
		this.tail = tail;
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		try(InputStream in = new ObjectInputStream(new BufferedInputStream(
				new FileInputStream("destination.txt")))){
			Bird bird = (Bird) ((ObjectInputStream) in).readObject();
		}
	}
	

}
