package programs;

import java.util.Scanner;

public class Armstromg_with_in_range {
	public static void main(String[] args) {
		
	Scanner s=new Scanner(System.in);
	System.out.println("enter the range");
		int a=s.nextInt();
		int b=s.nextInt();
		int num=a;
		
		int sum=0;
		for(;num<=b;num++) {
			int c=num; 
			int numofdigits=0;
			for(;c!=0;c=c/10) {
				numofdigits++;
			}
			c=num;
			sum=0;
			for(;c!=0;c=c/10) {
				int r=c%10;
				int product=1;
				for(int i=0;i<numofdigits;i++) {
					product*=r;
					
				}
				sum=sum+product;
			}
		//	System.out.println(sum +"  "+num);
			if(num==sum) {
				System.out.println(num);
			}
		
			
		}
		 
}
}

