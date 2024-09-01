package Recurssion;

import java.util.Scanner;

public class Oddnum {

	public static void main(String[] args) {
		System.out.println("enter the range ");
		Scanner s=new Scanner(System.in);
		int start=s.nextInt();
		int end=s.nextInt();
		oddnum(start, end);

	}
	static void oddnum(int a,int n) {
		if(a%2!=0)
		System.out.println(a);
		if(a>=n)return;
		oddnum(a+1, n);
	}
}
