package programs;

import java.util.Scanner;

public class Sum_of_squares {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int sum=0;
		for(;a!=0;a=a/10) {
			int rem=a%10;
			rem=rem*rem;
			sum=sum+rem;
			                         
		}
		System.out.println(sum);

	}

}
