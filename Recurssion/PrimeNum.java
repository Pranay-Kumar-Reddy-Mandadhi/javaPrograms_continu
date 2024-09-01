package Recurssion;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		System.out.println("enter the number ");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=a/2;
		if(isprime(a, b))System.out.println(a+" is primenum");
		else System.out.println(a+ " is not a primenum");
		

	}
	static boolean isprime(int k,int c)
	{
		if(k<=1)return false;
		if (c==1)return true ;
		if(k%c==0)return false;
		return isprime(k, c-1);
		
	}
}

