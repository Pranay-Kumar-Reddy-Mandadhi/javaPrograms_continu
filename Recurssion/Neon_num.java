package Recurssion;

import java.util.Scanner;

public class Neon_num {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number ");
		int a=s.nextInt();
		int sq=a*a;
		int sum=0;
		int sumnum=strong(sq, sum);
		System.out.println(sq+"="+sumnum);
		display(a,sumnum);
		
	}
	public static int strong(int sq,int sum) {
		if(sq<1)return sum;
		int rem=sq%10;
		sum=sum+rem;
		return strong(sq/10, sum);
		
	}
	public static void display(int a,int sumnum) {
		if(a==sumnum)System.out.println(a+" is the Neon number");
		else System.out.println(a+" is not the Neon  number ");
	}


}
