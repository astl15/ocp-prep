package ocp.nio2.files;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BasicFileMethods {
	
	public static void main(String[] args) {
		/*
		 *  most of the options within the  Files class will throw an exception 
		 *  if the file to which the Path refers does not exist.
		 */
		Path path = Paths.get("destination.txt");
		Path sourcePath = Paths.get("source.txt");
		Path falsepath = Paths.get("destination2.txt");
		System.out.println("File /destination.txt exists: " + Files.exists(path));
		System.out.println("File /destination2.txt exists: " + Files.exists(falsepath));
		
		/* 
		 * The  isSameFile()  method first checks if the  Path  objects are equal in terms 
		 * of  equal(), and if so, it automatically returns true  without checking to see 
		 * if either file exists. If the 
		 * Path  object  equals()  comparison returns  false , then it locates each file 
		 * to which the path refers in the file system and determines if they are the same, 
		 * throwing a checked 
		 * IOException  if either file does not exist
		 */
		
		try {
			System.out.println("Files destination.txt and source.txt are the same: " + 
					Files.isSameFile(sourcePath, path));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			//Files.createDirectory(Paths.get("exemples")); avoid java.nio.file.FileAlreadyExistsException
			Files.createDirectories(Paths.get("exemples/nio/copiedfiles"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Path destinationPath = FileSystems.getDefault().getPath("exemples/nio/copiedfiles/sample.txt");
		try {
			Files.copy(sourcePath,destinationPath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Path destinationPath2 = FileSystems.getDefault().getPath("exemples/nio/copiedfiles/isSample.txt");
		try {
			InputStream in = new FileInputStream(destinationPath.toString());
			Files.copy(in, destinationPath2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Path toBeDeletedFolder = Paths.get("exemples/nio/deleted");
		try {
			Files.createDirectory(toBeDeletedFolder);
			Files.delete(toBeDeletedFolder);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			BufferedReader reader = Files.newBufferedReader(Paths.get("destination.txt"));
			String line = null;
			System.out.print("Readind using Files.buffreader: ");
			while((line = reader.readLine())!= null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Walking exemples folder: ");
		try {
			Files.walk(Paths.get("exemples/nio/copiedfiles")).forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 
}


