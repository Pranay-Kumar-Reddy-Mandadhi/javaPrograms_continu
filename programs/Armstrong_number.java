package programs;

import java.util.Scanner;

public class Armstrong_number {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=a;
		int c=b;
		int count=0;
		int sum=0;
		
		
		for(;a!=0;a=a/10) {
			count++;
		}
		for(;b!=0;b=b/10) {
			int r=b%10;
			int product=1;
			for(int i=0;i<count;i++) {
				product*=r;
				
			}
			sum=sum+product;
		}
if (sum==c) {
	System.out.println(c+" is the armstrong number ");
	
	
}else
{
	System.out.println(c+" is not the armstrong number");
}
	}

}
