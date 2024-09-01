package programs;

import java.util.Scanner;

public class Sum_of_square_of_a_number {

	public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	System.out.println("enter the value ");
	int a=s.nextInt();
	int sum=0;
	for(;a!=0;a=a/10) {
		int rem=a%10;
		rem=rem*rem;
		sum+=rem;
		
	}
	System.out.println(sum);
	}

}
