package ocp.nio2.pathconstruction;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathRelativize {
	
	public static void main(String[] args) {
		Path path1 = Paths.get("birds.txt");
		Path path2 = Paths.get("animals.txt");
		Path path3 = Paths.get("C:", "Users","Andrei");
		Path path4 = Paths.get("C:", "Users","Andrei", "Documents");
		System.out.println(path1 + " relativized to " + path2 + ": " + path1.relativize(path2));
		System.out.println(path4 + " relativized to " + path3 + ": " + path4.relativize(path3));
		//both relative or both absolute to apply relativize
	}

}
