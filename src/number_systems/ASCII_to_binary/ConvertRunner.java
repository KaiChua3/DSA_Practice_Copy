package number_systems.ASCII_to_binary;//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class ConvertRunner
{
	public static void main(String[] args) throws IOException
	{
		Scanner file = new Scanner(new File("C:\\Users\\chuaz\\OneDrive\\Desktop\\APCSA Work Items\\DSA_Working_Copy\\DSA_Practice_Copy\\src\\number_systems\\ASCII_to_binary\\convert.dat"));
		while(file.hasNext())
		{
			String sentence = file.nextLine();
			Convert test = new Convert(sentence);
			test.convert();
			out.println(test);
		}
	}
}