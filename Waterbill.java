package com.mono.ifelse;

public class Waterbill {
	public static void main(String[] args) {
		int number=Integer.parseInt(args[0]);
		int metercharge=75;
		int charge;
		int total;
		if (number<=100)
		{
			 charge=number*5;
			 total=charge+metercharge;
			 System.out.println("total bill of water is:" +total);
		}
		else
		{
			if(number<=250)
			{
				int charge1=number*10;
				int total1=charge1+metercharge;
				 System.out.println("total bill of water is"+total1);
			}
			else {
				int charge2=number*20;
				int total2=charge2+metercharge;
				 System.out.println("total bill of water is"+total2);
			}
		}
	
	}

}


