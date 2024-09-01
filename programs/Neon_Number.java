package programs;

import java.util.Scanner;

public class Neon_Number {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int sum=0;
	System.out.println("enter the number ");
	int a=s.nextInt();
	for(int sq=a*a;sq!=0;sq=sq/10) {
		int rem=sq%10;
		sum+=rem;
	}
	if(a==sum) {
		System.out.println(a+"  is the neon number ");
	}else {
		System.out.println(a+" is not a neon number ");
	}
		

	}

}
