package number_systems.ASCII_to_binary;//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

public class Convert
{
	private String sentence;
	private String binary;

	public Convert()
	{
		sentence = "";
		binary = "";
	}

	public Convert(String sentence)
	{
		this.sentence = sentence;
		binary = "";
	}

	public void convert()
	{
		for (int i = 0; i < sentence.length(); i++) {
			char letter = sentence.charAt(i);
			int ASCIIValue = (int) letter;
			String temp =  Integer.toBinaryString(ASCIIValue);
			if (temp.length() != 8) {
				int diff = 8 - temp.length();
				for (int j = 0; j < diff; j++) {
					temp = "0" + temp;
				}
			}
			binary += temp + " ";
		}
	}

	public String toString()
	{
		return binary;
	}
}