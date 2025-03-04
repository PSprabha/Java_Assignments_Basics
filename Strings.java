package assignments;

public class Strings
{
	static void countVowels()
	{
		String s = "sorna prabhakaran";
		int count = 0;
		
		for(char c : s.toCharArray())
		{
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') count++;
		}
		
		System.out.println("count of vowels in given string is : " + count);
	}
	
	static void reverseChars()
	{
		String s = "sorna prabhakaran";
		String res = "";
		
		for(char c : s.toCharArray())
		{
			res = c + res;
		}
		
		System.out.println("Reversed string of given string is : " + res);
	}
	
	static void reverseWords()
	{
		String s = "sorna prabhakaran porchezhian";
		String res = "";
		String concat = "";
		
		for(char c : s.toCharArray())
		{
			if(c == ' ') 
			{
				res = " " + concat + res;
				concat = "";
			}
			else 
				concat += c;
		}
		res = concat + res;
		
		System.out.println("Reversed words of given string is : " + res);
	}
	
	
	static void emailValidation()
	{
		String s = "prabha@gmail.com";
		
		if(!(s.charAt(0) >= 'a' && s.charAt(0) <= 'z' )|| s.length() < 13 || s.lastIndexOf("@gmail.com") != s.length()-10)
		{
			System.out.println("Given gmail is not a valid email!");
			return;
		}
		
		System.out.println("Given gmail is a valid email!");
		
	}
	
	static void sentenceCase()
	{
		String s = "hi i am a kabaddi player!";
		String[] str = s.split(" ");
		s = "";
		
		for(String ss : str)
		{
			s += (char)(ss.charAt(0)-32)+ss.substring(1)+" ";
		}
		
		System.out.println(s);
	}
	
	
	public static void main(String[] args) 
	{
		countVowels();
		reverseChars();
		reverseWords();
		emailValidation();
		sentenceCase();
	}

}
