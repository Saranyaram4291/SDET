package JavaActivityDay4;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FileReadAndWrite {

	public static void main(String args[]) throws IOException
	{
		File file=new File("input.txt");
		file.createNewFile();
		
		File fileUtil=FileUtils.getFile("input.txt");
		
		System.out.println("Read text file value "+FileUtils.readFileToString(fileUtil, "UTF8"));

		File newDest=new File("resources");
		
		FileUtils.copyFileToDirectory(fileUtil, newDest);
		
		File fileDest=FileUtils.getFile(newDest,"input.txt");
		
		System.out.println("Read new text value "+FileUtils.readFileToString(fileDest, "UTF-8"));
		
		
		
	}
}
