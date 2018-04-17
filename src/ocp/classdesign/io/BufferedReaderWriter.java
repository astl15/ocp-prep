package ocp.classdesign.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class BufferedReaderWriter {
	
	public static void populateFile(File f) throws IOException {
		try(Writer writer = new BufferedWriter(new FileWriter(f));){
			writer.write("Generated text by method populalteFile() --bufferedreader/writer");
		}
	}
	
	public static void copy(File source, File destination) throws FileNotFoundException, IOException {
		try(BufferedReader bufferedReader = new BufferedReader(new FileReader(source));
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destination))){
			String s;
			while((s = bufferedReader.readLine())!=null) {
				bufferedWriter.write(s); //method inherited from writer
				bufferedWriter.newLine(); //method inherited from BufferedWriter
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
