package programs;

import java.util.Scanner;

public class Addition_of_Numbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int sum=0;
		int a=s.nextInt();
		while(a!=0) {
			int r=a%10;
			sum+=r;
			a=a/10;
			if(a==0&&sum>9) {
				System.out.println(sum);
				a=sum;
				sum=0;
			}
			
		}
		System.out.println(sum);

	}

}
