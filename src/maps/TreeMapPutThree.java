package maps;//(c) A+ Computer Science
//www.apluscompsci.com

//map put example 2

import java.util.Map;
import java.util.TreeMap;

public class TreeMapPutThree
{
	public static void main(String args[])
	{
		Map<Character,Integer> map;
		map = new TreeMap<Character,Integer>();
		
		String s = "cabcdefghihabcdc";
		for(char c : s.toCharArray())
		{
			map.putIfAbsent(c,0);
			map.put(c,map.get(c)+1);
		}
		
		System.out.println(map.get('a'));
		System.out.println(map.get('x'));
		System.out.println(map.get('c'));
	}
}