package programs;

import java.util.Scanner;

public class Sum_of_1_n_numbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int a=s.nextInt();
		String si="";
		int sum=0;
		for(int i=1;i<=a;i++) {
			si=si+i;
			if(i<a) {
			si=si+"+";
			}
			sum=sum+i;
			
			
		}
		System.out.println(si+"="+sum);
	}

}
