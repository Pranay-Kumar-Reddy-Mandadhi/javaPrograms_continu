package Recurssion;

import java.util.Scanner;

public class Sum_of_digits {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println(" enter the number ");
		int a=s.nextInt();
		int sum=0;
		System.out.println(sumofnum(a, sum));

	}
	public static int sumofnum(int a,int sum) {
		int r=a%10;
		if(a!=0) {
			sum=sum+r;
			return sumofnum(a/10, sum);}
		if(a==0&&sum>9) {
			a=sum;
			sum=0;
			return  sumofnum(a, sum);
		}
			return sum;
		}
	}
