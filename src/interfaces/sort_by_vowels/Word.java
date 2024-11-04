package interfaces.sort_by_vowels;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s)
	{
		word = s;
	}

	private int numVowels()
	{
		String vowels = "AEIOUaeiou";
		int vowelCount=0;
		for (int i = 0; i < word.length(); i++) {
			for (int j = 0; j < vowels.length(); j++) {
				if (word.substring(i, i+1).equals(vowels.substring(j,j+1))) {
					vowelCount++;
				}
			}
		}
		return vowelCount;
	}

	public int compareTo(Word rhs)
	{
		if (numVowels() > rhs.numVowels()) {
			return 1;
		} else if (numVowels() < rhs.numVowels()) {
			return -1;
		}
		return word.compareTo(rhs.word);
	}

	public String toString()
	{
		return word;
	}
}