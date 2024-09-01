package Recurssion;

import java.util.Scanner;

public class PrintNums {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int start=s.nextInt();
		int end=s.nextInt();
		
		int res=sum(end);
		display(start,end);
		System.out.println("the result is "+res);

	}
	static void display(int n,int last) {
		if(n>last)return;
		System.out.println(n);
		display(n+1, last);
	}
	static int sum(int a) {
		if(a==1)return 1;
		return a+sum(a-1);
	}

}
