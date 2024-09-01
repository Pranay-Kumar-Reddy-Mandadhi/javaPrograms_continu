package Recurssion;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number ");
		int a=s.nextInt();
		int sum=0;
		int revnum=recurssion(a,sum);
		System.out.println(revnum);
		display(a, revnum);
	}
public static int recurssion(int a,int sum) {
	if(a<1) return sum;
		 sum=sum*10+(a%10);
	return recurssion(a/10,sum);
	
}
public static void display(int a,int b) {
	if(a==b)System.out.println(a+" is the palindrome");
	else System.out.println(a+" is not a palindrome");
}
}
