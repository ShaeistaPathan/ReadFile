package file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFile {

	  public static String doesFileExist(String filePath)
	  {
	    String data = "";
	    try {
			data = new String(Files.readAllBytes(Paths.get(filePath)));
		} catch (IOException e) {
			e.printStackTrace();
		}
	    return data;
	  }
	 
	  public static void main(String[] args) throws Exception
	  {
	    String data = doesFileExist("data\\data.txt");
	    String[] rows = data.split("\n");
	    for(int i=0; i<rows.length; i++) {
	    	if (rows[i].contains("-")) {
				String[] tokens = rows[i].split("-");
				String[] meanings = tokens[1].split(",");
				System.out.println(tokens[0]);
				System.out.println(meanings[0]);
				if (meanings.length > 1)
					System.out.println(meanings[1]);
	    	}
	    }
	    
	  }
	}

