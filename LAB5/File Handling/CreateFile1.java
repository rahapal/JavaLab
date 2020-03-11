//Creating a text File using FileWriter
import java.io.FileWriter;
import java.io.IOException;
class CreateFile1
{
	public static void main(String[] args)throws IOException
	{
		//Accept a string 
		String str ="aa "+
					"bb "+
					"cc ";
		//attach a file to FileWriter
		FileWriter fw=new FileWriter("a.txt");

		//read character is from string and write
		//int FileWriter
		for(int i=0;i<str.length();i++)
			fw.write(str.charAt(i));

		System.out.println("Written Successfully");

		//close the file
		fw.close();
	}
}
