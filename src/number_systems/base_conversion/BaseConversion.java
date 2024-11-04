package number_systems.base_conversion;//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

public class BaseConversion
{
	private String number;
	private int base;

	public BaseConversion(String num, int b)
	{
		number = num;
		base = b;
	}

	public void setNumBase(String num, int b)
	{
		number = num;
		base = b;
	}

	private int convertToTen()
	{
		int q=number.length();
		int base10=0;
		for (int i = 0; i < q; i++) {
			base10 += Integer.parseInt(number.substring(i,i+1)) * Math.pow(base, (q-i)-1);
		}
		return base10;
	}

	public String getNum(int newBase)
	{
	   int base10 = convertToTen();
		String newNum="";
		while (base10 > 0) {
			String temp = String.valueOf(base10%newBase);
			if (temp.equals("10")) {
				temp = "A";
			} else if (temp.equals("11")) {
				temp = "B";
			} else if (temp.equals("12")) {
				temp = "C";
			} else if (temp.equals("13")) {
				temp = "D";
			} else if (temp.equals("14")) {
				temp = "E";
			} else if (temp.equals("15")) {
				temp = "F";
			}
			newNum = temp + newNum;
			base10 /= newBase;
		}
		System.out.println(newNum);
		return newNum+"-"+newBase;
	}

	public String toString()
	{
		return number+"-"+base;
	}
}