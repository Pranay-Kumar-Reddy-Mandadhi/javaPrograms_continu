package Recurssion;

import java.util.Scanner;

public class factors {

	public static void main(String[] args) 
	{
		System.out.println("enter the number ");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=a/2;
		factorial(a, b);
		

}
	public static int factorial(int a,int b)
	{
		if(b<1) return 1;
		if(a%b==0)System.out.println(b);
		return factorial(a, b-1);
	}
}

