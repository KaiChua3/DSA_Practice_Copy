package maps.roman_numbersII;
//www.apluscompsci.com
//Name -

import java.util.*;

public class RomansII
{
	private Map<String, Integer> m;
	
	public RomansII ()
	{
		//TODO 1: Copy your constructor from the last lab.
		m = new TreeMap<String, Integer>();

		/*
			Symbol	I	V	X		L		C		D		M
			Value		1	5	10		50		100	500	1000

		*/

		//TODO 1: Add the key, value pairs based on the table above.
		m.put("I", 1);
		m.put("V", 5);
		m.put("X", 10);
		m.put("L", 50);
		m.put("C", 100);
		m.put("D", 500);
		m.put("M", 1000);
	}


	public int getNumber( String s )
	{
		/*
		 * TODO 2: Implement this method correctly so that it will
		 *  return the sum of all of the roman numerals on a single line.
		 */
		int total = 0;
		String[] input = s.split(" ");
		for (int i = 0; i < input.length; i++) {
			total += m.get(input[i]);
		}
		return total;
	}

}