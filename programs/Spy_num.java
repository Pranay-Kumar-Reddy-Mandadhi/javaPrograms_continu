package programs;

import java.util.Scanner;

public class Spy_num {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=a;
		int sum=0;
		int product=1;
		for(;a!=0;a=a/10) {
			int rem=a%10;
			sum+=rem;
			product*=rem;
		}
		if(sum==product) {
			System.out.println(b+" is a spy number");
		}else {
			System.out.println(b+" is not a spy number ");
		}

	}

}
