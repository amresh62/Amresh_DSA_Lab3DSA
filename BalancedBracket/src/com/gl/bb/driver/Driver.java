package com.gl.bb.driver;

import java.util.Scanner;

import com.gl.bb.services.CheckBalancing;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please Enter the input");
		try(Scanner sc=new Scanner(System.in))
		{
			String input=sc.next();
			
			CheckBalancing _check=new CheckBalancing();
			Boolean flag=_check.Balance(input);
			
			if(flag)
			{
				System.out.println("The entered String has Balanced Brackets");
			}
			else
			{
				System.out.println("The entered Strings do not contain Balanced Brackets");
			}
		}

	}

}
