package ocp.nio2.pathcreation;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreatePath {
	
	public static void main(String[] args) {
		//use factory class
		Path path1 = Paths.get("/home/usr/andrei");
		Path path2 = Paths.get("/home","usr","andr2");
		Path path3 = Paths.get("C:","ProgramFiles","x86");
		
		//use URI
		try {
			Path path4 = Paths.get(new URI("file:///test.txt"));
			System.out.println("Path4: " + path4);
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		
		//use FileSystem
		
		Path path5 = FileSystems.getDefault().getPath("/home/usr/tst3");
		
		//view paths
		System.out.println("Path1: " + path1);
		System.out.println("Path2: " + path2);
		System.out.println("Path3: " + path3);
		System.out.println("Elements: ");
		for(int i=0;i<path3.getNameCount();i++) {
			System.out.println(path3.getName(i));
		}
		System.out.println("Path5: " + path5);
		
	}

}
