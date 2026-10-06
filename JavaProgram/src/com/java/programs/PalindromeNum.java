package com.java.programs;


public class PalindromeNum {
	
	
	public static void main(String args[])
	{
		
	/**	q
	//  if we the string as madam  if we got output as same madam,  we can call as  palindrome string 
		
		String str ="madam";
		
		String reversed = new StringBuilder(str).reverse().toString();
		
		if(reversed.equalsIgnoreCase(str))
		{
			System.out.println(str+":   String is palindrome");
			
		}
		else {
			
			System.out.println(str+":   String is not palindrome");
		}
		**/
		
		String str="level";
		boolean ispalindrome =true;
		int left=0;
		int right=str.length() - 1;

		while(left < right){
			if(str.charAt(left)!=str.charAt(right))
			{
			ispalindrome=false;
			break;
			}
			
			
			left++;
			
			right--;
		}
		
		if(ispalindrome)
		{
			System.out.println(str+ " is palindrome ");
		}
		
		else
		{
			System.out.println(str+ " is not palindrome");
		}		
		
	}

}
