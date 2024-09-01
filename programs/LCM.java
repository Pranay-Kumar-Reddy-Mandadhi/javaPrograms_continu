package programs;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter two numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		int n=a>b?a:b;//greatest
		
		while(true) {
			if(n%a==0 && n%b==0) {
				break;
			}
			
			n++;
		}
		System.out.println(n+" is the lcm of "+a+" and "+b);
	}

}
