package Recurssion;

import java.util.Scanner;

public class StrongNum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number ");
		int n=s.nextInt();
		if(Strong_num(n)==n) System.out.println(n+" is the strong number ");
		else System.out.println(n+" is not a Strong Number");
}
	public static int Strong_num(int n) {
		if(n==0) return 0;
		return fact(n%10)+Strong_num(n/10);
	}
	public static int fact(int num) {
		if(num==0)return 1;
		return num*fact(num-1);
	}
}
