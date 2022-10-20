package JavaBeginnersBook_IO_File;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class AppendFileDemo {

	public static void main(String[] args) throws Exception{
		
		String content = "This is my content which would be appended " +
	        	"at the end of the specified file";
		
		File file=new File("C:\\Users\\vishalkumar\\Desktop\\WritFileExample2.txt");
		
		/* This logic is to create the file if the file is not already present*/
    	if(!file.exists()){
    	   file.createNewFile();
    	}
    	
    	FileWriter fw=new FileWriter(file, true); //Here true is to append the content to file
    	BufferedWriter bw= new BufferedWriter(fw); //BufferedWriter writer give better performance
    	
    	bw.write(content);
    	
    	bw.close(); //Closing the buffered Stream
    	
    	System.out.println("Data Successfully append to end of the file");
    	
    	
		
	}
}
