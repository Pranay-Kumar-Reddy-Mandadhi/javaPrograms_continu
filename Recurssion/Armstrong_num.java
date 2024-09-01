package Recurssion;

import java.util.Scanner;

public class Armstrong_num {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number ");
		int a=s.nextInt();
		int count=digits(a, 0);
		System.out.println("the number of digits are= "+count);
		int sum=0;
		int value=armstrongvalue(a, count, sum);
		System.out.println("the  value is = "+value);
		display(a, value);

	}
	public static int digits(int n,int count) {
		if(n!=0) {
		int r=n/10;
		return digits(r, count+1);
	}
		return count;

}
	public static int armstrongvalue(int a,int count,int sum) {
		if(a!=0) {
			int r=a%10;
			int res=(int)Math.pow(r, count);
			sum+=res;
			return armstrongvalue(a/10, count, sum);
		}
		return sum;
		
	}
	public static void display(int a,int value) {
		if(a==value)System.out.println(a+" is the armstrong number ");
		else System.out.println(a+" is not the armstrong number");
	}
}
