package ocp.nio2.pathcreation;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RetrieveBasicPathInfo {
	
	public static void main(String[] args) {
		Path path = Paths.get("C:/home/usr/astl/imp.dat");
		Path pathWinRelative = FileSystems.getDefault().getPath("ProgramFiles/Vivaldi");
		System.out.println("File name: " + path.getFileName());
		System.out.println("Path Name: " + path);
		System.out.println("Path Elements:");
		for(int i=0;i<path.getNameCount();i++) {
			System.out.println(path.getName(i));
		}
		
		System.out.println("Root: " + path.getRoot());
		Path temp = path;
		while((temp = temp.getParent())!=null){
			System.out.println("Current path " + temp);
		}
		
		System.out.println("Absolute path  " + path + ": " + path.isAbsolute());
		System.out.println("To absolute path: " + path.toAbsolutePath());
		System.out.println("Absolute path  " + pathWinRelative + ": " + pathWinRelative.isAbsolute());
		System.out.println("To absolute path relative path: " + pathWinRelative.toAbsolutePath());
		System.out.println("Creating subpath of path " + path + ": " + path.subpath(0, 2));
	}

}
