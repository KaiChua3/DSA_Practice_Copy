package maps.phone_number;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class Phone
{
	private Map<String, Integer> m;
	
	public Phone()
	{
		//complete the constructor
		m = new TreeMap<String, Integer>();

		m.put("A", 2);
		m.put("B", 2);
		m.put("C", 2);
		m.put("D", 3);
		m.put("E", 3);
		m.put("F", 3);
		m.put("G", 4);
		m.put("H", 4);
		m.put("I", 4);
		m.put("J", 5);
		m.put("K", 5);
		m.put("L", 5);
		m.put("M", 6);
		m.put("N", 6);
		m.put("O", 6);
		m.put("P", 7);
		m.put("Q", 7);
		m.put("R", 7);
		m.put("S", 7);
		m.put("T", 8);
		m.put("U", 8);
		m.put("V", 8);
		m.put("W", 9);
		m.put("X", 9);
		m.put("Y", 9);
		m.put("Z", 9);

	}
	
	public String getNumber( String s )
	{
		String[] conv = s.split("-");
		String convertedString = conv[0];
		//add in the code to convert
		for (int i = 1; i < conv.length; i++) {
			String temp = "-";
			String[] subset = conv[i].split("");
			for (int j = 0; j < subset.length; j++) {
				temp += m.get(subset[j]);
			}
			convertedString += temp;
		}
		//the phone number
		return convertedString;
	}

}