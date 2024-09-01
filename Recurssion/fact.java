package Recurssion;

import java.util.Scanner;

public class fact {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the factorial number");
		int a=s.nextInt();
		int res=fact(a);
		System.out.println(res);
		
	}
static int fact(int n) {
	
	if(n==1)
	return 1;
	return n*fact(n-1);
}
}
