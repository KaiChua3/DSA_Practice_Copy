package interfaces.sort_by_length;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import interfaces.sort_by_vowels.Word;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		//Scan the file - change with absolute file path
		Scanner file = new Scanner( new File("C:\\Users\\chuaz\\OneDrive\\Desktop\\APCSA Work Items\\DSA_Working_Copy\\DSA_Practice_Copy\\src\\interfaces\\sort_by_length\\words.dat") );

		List<interfaces.sort_by_length.Word> list = new ArrayList<interfaces.sort_by_length.Word>();

		//Get the file size
		int size = file.nextInt();

		//TODO: Finish this to collect the data and print the results
		for( int i = 0; i < size + 1; i++ )
		{
			String s = file.nextLine();
			interfaces.sort_by_length.Word wordName = new interfaces.sort_by_length.Word(s);
			list.add(wordName);
		}
		Collections.sort(list);
		for (int i = 0; i < size + 1; i++) {
			System.out.println(list.get(i));
		}
	}
}