package programs;

import java.util.Scanner;

public class Strong_number {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int sum=0;
		int a=s.nextInt();
		int b=a;
		for(;a!=0;a=a/10) {
			int r=a%10;
			int fact=1;
			for(int i=1;i<=r;i++) {
				fact=fact*i;
			}
			sum=sum+fact;
		}
		if (b==sum) {
			System.out.println(b+" is the Strong Number");
			
			
		}else {
			System.out.println(b+" is not the Strong Number");
		}

	}

}
