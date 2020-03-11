//Creating a text File using FileWriter 
import java.io.FileWriter;
import java.io.IOException;
class CreateFile2
{
	public static void main(String[] args)throws IOException
	{
		//Accept a String
		String str ="11 " +
					"22 "+
					"33 ";
		//attach a file to FileWriter 
		FileWriter fw=new FileWriter("b.txt");

		//read character wise from string and write
		//into Filewriter
		for (int i=0;i<str.length();i++)
			fw.write(str.charAt(i));

		System.out.println("Written Successfully");
		//close the file
		fw.close();
	}
}