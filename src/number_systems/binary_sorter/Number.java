package number_systems.binary_sorter;//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

public class Number implements Comparable<Number>
{

	//add in instance variables
	String num;
	int base;
	String binary;
	int numOfOnes;
	int base10Value;
	int originalNum;
	//add in a constructor or two

	public Number (String num, int base) {
		this.num = num;
		this.base = base;
		originalNum = Integer.parseInt(num);
		base10Value = Integer.parseInt(num, base);
		binary = Integer.toBinaryString(base10Value);
		for (int i = 0; i < binary.length(); i++) {
			if (binary.charAt(i) == '1') {
				numOfOnes++;
			}
		}
	}

	public int compareTo(Number param)
	{
		if (param.numOfOnes > numOfOnes) {
			return -1;
		} else if (param.numOfOnes < numOfOnes) {
			return 1;
		}
		if (param.base10Value > base10Value) {
			return -1;
		} else if (param.base10Value < base10Value) {
			return 1;
		}
		if (param.originalNum > originalNum) {
			return -1;
		} else if (param.originalNum < originalNum) {
			return 1;
		}
		return 0;
	}
	
	public String toString()
	{
	  return originalNum + " " + base10Value + " " + binary;
	}
}