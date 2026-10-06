package com.java.programs;

public class ReverseStringDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	/**
	 * 
		By using String Builder Class, reverse(), toString();
		String original_value="Rajesh";
		String reversed_value = new StringBuilder(original_value).reverse().toString();
		
		System.out.println("Orginal :" +original_value);
		System.out.println("Reversed :"+ reversed_value);
 
		**/
		
		
		//Manual way
		
		String org_value="JAVA"; // ---> i[3]= A  i[2]= V i[1] =A i[0] = J
		
		String reversed="";
		
		for(int i =org_value.length()-1;i>=0;i--)
		{
			reversed= reversed+org_value.charAt(i);
		}
		
		System.out.println("Orginal value : "+ org_value);
		System.out.println("Reversed value :"+reversed);
		
	}

}



