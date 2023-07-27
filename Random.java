package com.mono.ifelse;

import java.util.Scanner;

public class Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean status=true;
		while(status)
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the random number");
		int random=sc.nextInt();
		int tries=0;
		status=false;
			
		if(random<=100)
		{
			boolean status1=true;
			while(status1)
			{
			System.out.println("guess number");
			int guessnumber=sc.nextInt();
			if(tries==10)
			{
				System.out.println("it is more attempts");
				break;
			}
			tries++;
			if(guessnumber<random)
			{
				System.out.println("Sorry,Too Low.");
			}
			else if (guessnumber>random)
			{
				System.out.println("Sorry,Too High");
			}
			else
			{
				System.out.println("guess the proper number");
				System.out.println("no ot tries"+tries);
				
					
	
				
				status1=false;
			}
			
			}
		
			System.out.println("Do you want to play again?(yes/no)");
			String play=sc.next();
			
			status=play.equals("yes");
		
		
		}
		
		}
		System.out.println("Thank you");
		
		}
		
		
		
		
		}

	


