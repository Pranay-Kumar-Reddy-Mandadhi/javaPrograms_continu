package programs;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int a=s.nextInt();
		int b=a;
		int rev=0;
		for(;a!=0;a=a/10){
			int rem=a%10;
			rev=rev*10+rem;
		}
			if(b==rev) {
				System.out.println(b+" is a palindrome");
			}
			else {
				System.out.println(b+" is not a palindrome");
			}
	}

}
