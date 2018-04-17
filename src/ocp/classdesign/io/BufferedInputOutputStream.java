package ocp.classdesign.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;

public class BufferedInputOutputStream {
	
	public static void populateFile(File f) throws IOException {
		try(Writer writer = new BufferedWriter(new FileWriter(f));){
			writer.write("Generated text by method populalteFile() --buffered");
		}
	}
	
	public static void copy(File source, File destination) throws FileNotFoundException, IOException {
		try(InputStream inputStream = new BufferedInputStream(new FileInputStream(source));
			OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(destination))){
			byte[] buffer = new byte[1024];	
			int lengthRead;
				while((lengthRead = inputStream.read(buffer)) > 0) {
					outputStream.write(buffer,0,lengthRead);
					outputStream.flush();
				}
			}
	}
	
	public static void main(String[] args) {
		File source = new File("bufferedSource.txt");
		File destination = new File("bufferedDestination.txt");
		try {
			populateFile(source);
			copy(source,destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
