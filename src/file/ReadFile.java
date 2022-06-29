package file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFile {

	  public static String readFileAsString(String fileName)
	  {
	    String data = "";
	    try {
			data = new String(Files.readAllBytes(Paths.get(fileName)));
		} catch (IOException e) {
			e.printStackTrace();
		}
	    return data;
	  }
	 
	  public static void main(String[] args) throws Exception
	  {
	    String data = readFileAsString("C:\\Users\\drsha\\AutomationProjects-workspace\\ProjectFile\\data\\data.txt");
	    System.out.println(data);
	  }
	}

