package interfaces.sort_by_length;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word = s;
	}

	public int compareTo( Word rhs )
	{
		if (word.length() < rhs.word.length()) {
			return -1;
		} else if (word.length() > rhs.word.length()) {
			return 1;
		} else if (word == rhs.word) {
			return 0;
		}
		return word.compareToIgnoreCase(rhs.word);
	}

	public String toString()
	{
		return word;
	}
}