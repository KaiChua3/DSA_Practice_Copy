package sets.union_int_diff;//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class MathSetRunner
{
	public static void main(String args[]) throws IOException
	{
		//add test cases
		Scanner input = new Scanner(new File("C:\\Users\\chuaz\\OneDrive\\Desktop\\APCSA Work Items\\DSA_Working_Copy\\DSA_Practice_Copy\\src\\sets\\union_int_diff\\mathsetdata.dat"));
		for (int i = 0; i < 3; i++) {
			String lineOne = input.nextLine();
			String lineTwo = input.nextLine();
			MathSet sets1 = new MathSet(lineOne, lineTwo);
			out.println("union - " + sets1.union());
			out.println("intersection - " + sets1.intersection());
			out.println("difference A-B - " + sets1.differenceAMinusB());
			out.println("diference B-A - " + sets1.differenceBMinusA());
			out.println("symmetric difference " + sets1.symmetricDifference());
			out.println("\n");
		}
	}
}
