package Recurssion;

import java.util.Scanner;

public class PrintEvenNum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the range ");
		int start=s.nextInt();
		int last=s.nextInt();
		evennum(start,last);
		
	}
	static void evennum(int start,int n) {
		if(start%2==0)
		System.out.println(start);
		if(start>n)return;
		evennum(start+1, n);
	}
	}
