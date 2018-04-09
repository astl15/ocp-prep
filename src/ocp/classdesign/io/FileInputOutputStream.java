package ocp.classdesign.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;

public class FileInputOutputStream {
	
	public static void populateFile(File f) throws IOException {
		try(Writer writer = new FileWriter(f)){
			writer.write("Generated text by method populalteFile()");
		}
	}
	
	public static void copy(File source, File destination) throws FileNotFoundException, IOException {
		try(InputStream inputStream = new FileInputStream(source);
			OutputStream outputStream = new FileOutputStream(destination)){
				int b;
				while((b = inputStream.read()) != -1) {
					outputStream.write(b);
				}
			}
	}
	
	public static void main(String[] args) {
		File source = new File("source.txt");
		File destination = new File("destination.txt");
		try {
			populateFile(source);
			copy(source,destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
