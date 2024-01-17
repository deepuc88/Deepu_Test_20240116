package JavaLearning;

import java.util.Scanner;
public class StringPalindrome 
{

	public static void main(String[] args) 
	{
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s1 = inp.nextLine();
		String s2 = "";
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2 = s2 + s1.charAt(i);
			//System.out.println(i+s2);
		}
		System.out.println(s2);
		if(s1.equals(s2))
		{
			System.out.println("The string is a palindrome");
		}
		else
			System.out.println("The string is not a palindrome");
	}

}
