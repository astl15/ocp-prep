package ocp.classdesign.io;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Person implements Serializable{
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	public static int nrOfPersons;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
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
	
	
}
public class ObjectInputOutput {
	
	public static void writePersonsList(List<Person> persons, File destination) throws FileNotFoundException, IOException {
		try(ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream(destination))){
			for(Person person:persons) {
				obj.writeObject(person);
			}
		}
	}
	
	public static List<Person> retrievePersonsList(File source) throws FileNotFoundException, IOException, ClassNotFoundException{
		List<Person> personsList = new ArrayList<>();
		try(ObjectInputStream obj = new ObjectInputStream(new BufferedInputStream(
				new FileInputStream(source)))){
				Object person;
				while(true) {
					if((person = obj.readObject()) != null) {
						if(person instanceof Person) {
							personsList.add((Person)person);
						}
					}
				}
		}catch(EOFException e) {
			//TODO
		}
		return personsList;
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		File data = new File("personsdata.txt");
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Andrei",25));
		persons.add(new Person("Stelea",30));
		writePersonsList(persons, data);
		List<Person> retrievedPersons = retrievePersonsList(data);
		if(retrievedPersons != null) {
			retrievedPersons.forEach(a->System.out.println(a.getName() + " " + a.getAge()));
		}
	}

}
