package goal;

import java.util.Scanner;

public class dis {
	static Scanner d=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Welcome To Store........");
		int p=99;  
		System.out.println("Price for 1 quantity is : $"+p);
		System.out.println("Enter the quantity ");
		float q=d.nextFloat();
		if(q>=1 && q<=9)
		{
			//System.out.println("you get 20% discount on purchase of "+q+" products");
			//float a=(float)((q*p)/100)*20;
			//System.out.println("your discount : $"+a);
			System.out.println("your total bill : $"+((q*p)));
		}
		if(q>=10 && q<=19)
		{
			System.out.println("you get 20% discount on purchase of "+q+" products");
			float a=(float)((q*p)/100)*20;
			System.out.println("your discount : $"+a);
			System.out.println("your total bill : $"+((q*p)-a));
		}
		if(q>=20 && q<=49)
		{
			System.out.println("you get 30% discount on purchase of "+q+" products");
			float a=(float)((q*p)/100)*30;
			System.out.println("your discount : $"+a);
			System.out.println("your total bill : $"+((q*p)-a));
		}
		if(q>=50 && q<=99)
		{
			System.out.println("you get 40% discount on purchase of "+q+" products");
			float a=(float)((q*p)/100)*40;
			System.out.println("your discount : $"+a);
			System.out.println("your total bill : $"+((q*p)-a));
		}
		if(q>=100)
		{
			System.out.println("you get 50% discount on purchase of "+q+" products");
			float a=(float)((q*p)/100)*50;
			System.out.println("your discount : $"+a);
			System.out.println("your total bill : $"+((q*p)-a));
		}
	}
}
