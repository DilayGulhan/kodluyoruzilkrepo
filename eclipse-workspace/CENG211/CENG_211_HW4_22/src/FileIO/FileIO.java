package FileIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FileIO {
	public static List<String> commands = new ArrayList<String>();
	
	public static List<String> readFile(String fileName) {
		if(!fileName.equals(null)) {
			try {
				BufferedReader reader = new BufferedReader(new FileReader(fileName));
				String line=reader.readLine();
				while(line!=null) {
					commands.add(line);
					line=reader.readLine();
				}reader.close();	
				return commands;
			}
			catch (FileNotFoundException e) {
				System.out.println("File cannot be found!");
				e.printStackTrace();
				return null;
			} catch (Exception e) {
				System.out.println("Something is wrong!");
				e.printStackTrace();
				return null;
			}
		}return null;
	}
	
}
