package com.nttdata.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		System.out.println("welcome to ICICI Bank");
		int a = 0;
		int cnt=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the choice 1.to create your account  2.exit from the bank window");
		a=sc.nextInt();
		switch(a) {
		case 1:
		Scanner scan=new Scanner(System.in);
		System.out.println("enter bank name");
		String bankName=scan.next();
		System.out.println("enetr bank code");
		int bankCode=scan.nextInt();
		System.out.println("enter user namee");
		String userName=scan.next();
		System.out.println("enter user age");
		int userAge=scan.nextInt();
		System.out.println("enter user address");
		String userAddress=scan.next();
		System.out.println("enter pin code");
		int pincode=scan.nextInt();
		System.out.println("enterer account number");
		int acntNo=scan.nextInt();
		System.out.println("enter account balance");
		int acntBal=scan.nextInt();
		User us1=new User(bankName,bankCode,userName,userAge,userAddress,pincode,new Account(acntNo,acntBal));
		cnt=cnt+1;
	       System.out.println("Bank account created successfully");
	       System.out.println("do you want to continue yes/no");
	       while (cnt==2) {
	    	   int b = 0;
	    	   System.out.println("option 1. to display user account details  option 2.  To perform transaction");
	    	   Scanner sca=new Scanner(System.in);
	    	   b=sca.nextInt();
	    	   switch(b) {
	    	   case 1:
	    		   us1.displayDetails();
	    		   break;
	    	   case 2:
	    		   us1.transaction();
	    		   
	    	   break;
	    		   
	default:
		
			System.out.println("enter correct option");
			
		}
	    	   
	    		   
	}
		case 2:
			System.out.println("your out of bank window");
			break;
		}
	}
}
