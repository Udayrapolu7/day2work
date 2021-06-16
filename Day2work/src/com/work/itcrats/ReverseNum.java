package com.work.itcrats;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a one number");
	int number = scan.nextInt();
	int orginalNumber = number;
	int rev= 0;
	
	while(number!=0)
	{
		rev=rev*10 + number%10;
		number =number /10;
		
	}
	System.out.println(rev);
	
     if(orginalNumber == rev)	
     {
    	System .out.println("reverse of a number is : true");
     }
     else
     {
    	 System .out.println("reverse of a number is : false"); 
     }
	

	}

}
