package interfaces.sort_by_vowels;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner( new File( "C:\\Users\\chuaz\\OneDrive\\Desktop\\APCSA Work Items\\DSA_Working_Copy\\DSA_Practice_Copy\\src\\interfaces\\sort_by_vowels\\word.dat" ) );
		List<Word> list = new ArrayList<Word>();
		
		int size = file.nextInt();
		
		for( int i = 0; i < size; i++ )
		{
			String s = file.nextLine();
			Word wordName = new Word(s);
			list.add(wordName);
		}
		Collections.sort(list);
		for (int i = 0; i < size; i++) {
			System.out.println(list.get(i));
		}


	}
}