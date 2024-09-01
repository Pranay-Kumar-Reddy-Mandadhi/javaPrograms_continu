package programs;

import java.util.Scanner;

public class Reverse_a_num {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number ");
		int a=s.nextInt();
		int b=a;
		int rev=0;
		for(;a!=0;a=a/10){
			int rem=a%10;
			rev=rev*10+rem;
		}
			System.out.println(rev);
	}

}
