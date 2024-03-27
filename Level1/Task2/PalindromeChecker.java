package level1;

import java.util.Scanner;

//task2
public class PalindromeChecker 
{
	public static boolean isPalindrome(String str)
	{
		
		String text=str.replaceAll("[^a-zA-Z]", "").toLowerCase();
		
		int leftside=0;
		int rightside=text.length()-1;
		
		while(leftside < rightside )
		{
			if(str.charAt(leftside)==str.charAt(rightside))
			{
				return true;
			}
			leftside++;
			rightside--;
		}
		return false;
	}
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		System.out.print("Enter the Word or phrase: ");
		String text=sc.nextLine();	
		System.out.println();
		if(isPalindrome(text))
		{
			System.out.println(" \" "+text +" \"  is a Palindorme.");
		}
		else
		{
			System.out.println("\" "+text +" \" is not Palindrome.");
		}
	}
}
