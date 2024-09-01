package Recurssion;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		m1(a);
	}
	static void m1(int a) {
		//System.out.println(a);
		if(a>=4)return;
		m1(a+1);
		System.out.println(a);
	}

}
