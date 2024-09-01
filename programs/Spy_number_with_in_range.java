package programs;

import java.util.Scanner;

public class Spy_number_with_in_range {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the start range :");
		int start=s.nextInt();
		System.out.println("Enter the End range :");
		int End=s.nextInt();
		System.out.println("The spy numbers are :");
		for(int i=start;i<=End;i++) {
		int a=i;
		int b=a;
		int sum=0;
		int product=1;
		for(;a!=0;a=a/10) {
			int rem=a%10;
			sum+=rem;
			product*=rem;
		}
		if(sum==product) {
			System.out.println(b);
		}

		}
}
}
	


