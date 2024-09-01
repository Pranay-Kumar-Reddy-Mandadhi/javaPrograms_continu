package programs;

import java.util.Scanner;

public class Neon_number_in_range {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the range");
			int a=s.nextInt();
			int b=s.nextInt();
			
			int n=a;
			int sum=0;
			for(int i=n;i<=b;i++) {
				int c=i;
				int count=0;
				for(;c!=0;c=c/10) {
					count++;
				}
				c=i;
				sum=0;
				//System.out.println(c);
				for(int sq=c*c;sq!=0;sq=sq/10) {
					int rem=sq%10;
					sum+=rem;
					
				}
				//System.out.println(c+" "+sum);
				if (sum==c) {
					System.out.println(c);
					
				}
	}
			}
}

