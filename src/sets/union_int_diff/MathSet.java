package sets.union_int_diff;//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import static java.lang.System.*;

public class MathSet
{
	private Set<Integer> one;
	private Set<Integer> two;

	public MathSet()
	{
		one = new HashSet<Integer>();
		two = new HashSet<Integer>();
	}

	public MathSet(String o, String t)
	{
		one = new HashSet<Integer>();
		two = new HashSet<Integer>();
		String[] oneArray = o.split(" ");
		String[] twoArray = t.split(" ");
		for (int i = 0; i < oneArray.length; i++) {
			int temp = Integer.parseInt(oneArray[i]);
			one.add(temp);
		}
		for (int i = 0; i < twoArray.length; i++) {
			int temp = Integer.parseInt(twoArray[i]);
			two.add(temp);
		}
		out.println("Set one " + one);
		out.println("Set two " + two);
	}

	public Set<Integer> union()
	{
		HashSet<Integer> combined = new HashSet<>();
		combined.addAll(one);
		combined.addAll(two);
		return combined;
	}

	public Set<Integer> intersection()
	{
		Set<Integer> combined = union();
		Set<Integer> intersection = union();
		for (Integer i : combined) {
			if (!one.contains(i) || !two.contains(i)) {
				intersection.remove(i);
			}
		}
		return intersection;
	}

	public Set<Integer> differenceAMinusB()
	{
		Set<Integer> combined = union();
		combined.retainAll(one);
		for (Integer i : two) {
			combined.remove(i);
		}
		return combined;
	}

	public Set<Integer> differenceBMinusA()
	{
		Set<Integer> combined = union();
		combined.retainAll(two);
		for (Integer i : one) {
			combined.remove(i);
		}
		return combined;
	}
	
	public Set<Integer> symmetricDifference()
	{
		Set<Integer> combined = union();
		Set<Integer> intersection = union();
		for (Integer i : combined) {
			if (one.contains(i) && two.contains(i)) {
				intersection.remove(i);
			}
		}
		return intersection;
	}	
	
	public String toString()
	{
		return "Set one " + one + "\n" +	"Set two " + two +  "\n";
	}
}