package com.work.itcrats;

import java.util.Scanner;

public class ProductOfInteger {
	public static void calci()
	{
		Scanner sc = new Scanner(System.in);
        System.out.print("Input 1st integer: ");
        int a = sc.nextInt();
        System.out.print("Input 2nd integer: ");
        int b = sc.nextInt();
        int product = a*b;
        System.out.println("product of two integers:" +product);  
        
        if(product >= 500)
        {
        	int sum = a+b;
        	System.out.println("sum of two numbers a and b :"+sum);
        }
        else
        {
        	System.out.println("product is less than 500 so we cant do sum opertion");
        }
        	
	}

	public static void main(String[] args) {
		 // TODO Auto-generated method stub
		
        calci();	
            

	}

}
