package ocp.nio2.pathconstruction;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathCleaning {
	
	public static void main(String[] args) {
		Path pathone = Paths.get("D:/tests/ocp");
		Path pathtwo = Paths.get("D:/oca/tests");
		Path relativizedPath = pathone.relativize(pathtwo);
		System.out.println("Relativized path: " + relativizedPath );
		Path resolvedPath = pathone.resolve(relativizedPath);
		System.out.println("Resolved path: " + resolvedPath);
		System.out.println("Normalized path: " + resolvedPath.normalize());
	}

}
