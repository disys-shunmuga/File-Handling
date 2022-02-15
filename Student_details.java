import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
public class Student_details {
	public static void main(String args[]) {
		try {
		      File myObj = new File("Studentdetails.txt");
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		try {
		      FileWriter myWriter = new FileWriter("Studentdetails.txt");
		      myWriter.write("Student Name: Sanjeev"+"\n"
		      +"Age: 21"+"\n" + "Address: 8/76,south street,kudiyiruppu,coutrallam"+"\n"
		    		  +"Email id:shunmuga.lingam@disys.com");
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		try {
		      File myObj = new File("Studentdetails.txt");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.println(data);
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		 File myObj = new File("Studentdetails.txt");
		 if (myObj.exists()) {
		      System.out.println("File name: " + myObj.getName());
		      System.out.println("Absolute path: " + myObj.getAbsolutePath());
		      System.out.println("Writeable: " + myObj.canWrite());
		      System.out.println("Readable " + myObj.canRead());
		      System.out.println("File size in bytes " + myObj.length());
		    } else {
		      System.out.println("The file does not exist.");
		    }
		 File file = new File("Studentdetails.txt");
         
	        if(file.delete())
	        {
	            System.out.println("File deleted successfully");
	        }
	        else
	        {
	            System.out.println("Failed to delete the file");
	        }
	}
}
