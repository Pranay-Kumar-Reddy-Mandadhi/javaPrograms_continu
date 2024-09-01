package programs;

import java.util.Scanner;

public class Perfect_number_in_range {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the start number: ");
		int Start=s.nextInt();
		System.out.println("enter the end number: ");
		int end=s.nextInt();
		System.out.println("perfect numbers are ");
		for(int k=Start;k<=end;k++) {
		int a=k;
		int sum=0;
		for(int i=1;i<=a/2;i++) 
		{
			if (a%i==0) {
				sum+=i;				
			}
		}
			if (sum==a) {
				System.out.println(a+" is the perfect number");
				
			}
		}
	}
}

