import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Driver {
	public static void main(String[] args) throws IOException{

		//call in copy class
		copy C = new copy();
		
		//read in CSV file
		
		try{
			Scanner s = new Scanner(new File("data.csv"));
			while(s.hasNext()){
				String temp [] = s.nextLine().split(",");
				//System.out.println(temp[5]);
				//System.out.println(temp[6]);
				
				File source = new File(temp[6]);
		        File dest = new File(temp[7]);
		        File mea = new File(temp[8]);
				
		        //delete file if it exists (prevent error from having an already existing file
		        if(dest.delete()){
		            System.out.println("file.txt File deleted from Project root directory");
		        }
				
		        //copy over PAT file to new location
				C.copyFileUsingJava7Files(source, dest);
				
				//Access the patient number within the .PAT file
				BufferedReader brTest = new BufferedReader(new FileReader(source));
			    String text = brTest.readLine();
			    System.out.println("Firstline is : " + text);
				
			    
				//Change specific line (1) within .MEA file
			    ChangeLineInFile changeFile = new ChangeLineInFile();
			    changeFile.changeALineInATextFile(temp[8], text, 1);
				
			}
		}catch(Exception e){
			System.out.println("Error "+e);
		}
	}
}
